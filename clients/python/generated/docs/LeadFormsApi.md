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
> LeadFormResponse lead_form_get(ad_account_id, lead_form_id)

Get lead form by id

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>

Gets a lead form given it's ID. It must also be associated with the provided ad account ID.

For more, see <a class="reference external" href="https://help.pinterest.com/en/business/article/lead-ads">Lead ads</a>.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.lead_form_response import LeadFormResponse
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
    lead_form_id = '1234567890123' # str | Unique identifier of a lead form.

    try:
        # Get lead form by id
        api_response = api_instance.lead_form_get(ad_account_id, lead_form_id)
        print("The response of LeadFormsApi->lead_form_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LeadFormsApi->lead_form_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **lead_form_id** | **str**| Unique identifier of a lead form. | 

### Return type

[**LeadFormResponse**](LeadFormResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account lead forms parameters. |  -  |
**404** | The lead form ID for the given ad account ID does not exist. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_form_test_create**
> LeadFormTestResponse lead_form_test_create(ad_account_id, lead_form_id, lead_form_test_request)

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body.
- List of answers should follow the questions creation order.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.lead_form_test_request import LeadFormTestRequest
from pinterestsdk.models.lead_form_test_response import LeadFormTestResponse
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
    lead_form_id = '1234567890123' # str | Unique identifier of a lead form.
    lead_form_test_request = pinterestsdk.LeadFormTestRequest() # LeadFormTestRequest | Subscription to create.

    try:
        # Create lead form test data
        api_response = api_instance.lead_form_test_create(ad_account_id, lead_form_id, lead_form_test_request)
        print("The response of LeadFormsApi->lead_form_test_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LeadFormsApi->lead_form_test_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **lead_form_id** | **str**| Unique identifier of a lead form. | 
 **lead_form_test_request** | [**LeadFormTestRequest**](LeadFormTestRequest.md)| Subscription to create. | 

### Return type

[**LeadFormTestResponse**](LeadFormTestResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid parameters. |  -  |
**404** | Lead not found. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_forms_create**
> LeadFormArrayResponse lead_forms_create(ad_account_id, lead_form_create_request)

Create lead forms

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>

Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’s description, questions and confirmation sections.

For more, see <a class="reference external" href="https://help.pinterest.com/en/business/article/lead-ads">Lead ads</a>.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.lead_form_array_response import LeadFormArrayResponse
from pinterestsdk.models.lead_form_create_request import LeadFormCreateRequest
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
    lead_form_create_request = [pinterestsdk.LeadFormCreateRequest()] # List[LeadFormCreateRequest] | List of lead forms to create, size limit [1, 30].

    try:
        # Create lead forms
        api_response = api_instance.lead_forms_create(ad_account_id, lead_form_create_request)
        print("The response of LeadFormsApi->lead_forms_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LeadFormsApi->lead_forms_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **lead_form_create_request** | [**List[LeadFormCreateRequest]**](LeadFormCreateRequest.md)| List of lead forms to create, size limit [1, 30]. | 

### Return type

[**LeadFormArrayResponse**](LeadFormArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account lead forms parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_forms_list**
> LeadFormsList200Response lead_forms_list(ad_account_id, page_size=page_size, order=order, bookmark=bookmark)

List lead forms

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>

List lead forms associated with an ad account ID.

For more, see <a class="reference external" href="https://help.pinterest.com/en/business/article/lead-ads">Lead ads</a>.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.lead_forms_list200_response import LeadFormsList200Response
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
    page_size = 25 # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
    order = 'ASCENDING' # str | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)

    try:
        # List lead forms
        api_response = api_instance.lead_forms_list(ad_account_id, page_size=page_size, order=order, bookmark=bookmark)
        print("The response of LeadFormsApi->lead_forms_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LeadFormsApi->lead_forms_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **str**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 

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
**200** | Success |  -  |
**400** | Invalid ad account lead forms parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_forms_update**
> LeadFormArrayResponse lead_forms_update(ad_account_id, lead_form_update_request)

Update lead forms

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>

Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.

For more, see <a class="reference external" href="https://help.pinterest.com/en/business/article/lead-ads">Lead ads</a>.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.lead_form_array_response import LeadFormArrayResponse
from pinterestsdk.models.lead_form_update_request import LeadFormUpdateRequest
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
    lead_form_update_request = [pinterestsdk.LeadFormUpdateRequest()] # List[LeadFormUpdateRequest] | List of lead forms to update, size limit [1, 30].

    try:
        # Update lead forms
        api_response = api_instance.lead_forms_update(ad_account_id, lead_form_update_request)
        print("The response of LeadFormsApi->lead_forms_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LeadFormsApi->lead_forms_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **lead_form_update_request** | [**List[LeadFormUpdateRequest]**](LeadFormUpdateRequest.md)| List of lead forms to update, size limit [1, 30]. | 

### Return type

[**LeadFormArrayResponse**](LeadFormArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account lead forms parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

