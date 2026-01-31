# pinterestsdk.LabelsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**labels_create**](LabelsApi.md#labels_create) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**labels_list**](LabelsApi.md#labels_list) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**labels_update**](LabelsApi.md#labels_update) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels


# **labels_create**
> LabelsResponse labels_create(ad_account_id, label_create_request)

Create labels

<p>
<a href="/docs/getting-started/using-beta-and-restricted-features/" target="blank" target="blank">Closed beta</a>
This endpoint is not available to all users.
</p>
<p>
  Apply one or more labels to a campaign.
  Currently, you can apply brand and custom labels. Future releases will provide more options.

  <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
 </p>

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.label_create_request import LabelCreateRequest
from pinterestsdk.models.labels_response import LabelsResponse
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
    api_instance = pinterestsdk.LabelsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    label_create_request = pinterestsdk.LabelCreateRequest() # LabelCreateRequest | 

    try:
        # Create labels
        api_response = api_instance.labels_create(ad_account_id, label_create_request)
        print("The response of LabelsApi->labels_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LabelsApi->labels_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **label_create_request** | [**LabelCreateRequest**](LabelCreateRequest.md)|  | 

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labels_list**
> LabelsList200Response labels_list(ad_account_id, campaign_ids=campaign_ids, label_ids=label_ids, entity_statuses=entity_statuses, label_types=label_types, page_size=page_size, bookmark=bookmark)

List labels

<p>
  <a href="/docs/getting-started/using-beta-and-restricted-features/" target="blank" target="blank">Closed beta</a>
  This endpoint is not available to all users.
</p>
<p>
  See a list of labels for assets that your account owns, and filter the list by different criteria.
</p>

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.labels_list200_response import LabelsList200Response
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
    api_instance = pinterestsdk.LabelsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    campaign_ids = ['campaign_ids_example'] # List[str] | List of Campaign Ids to use to filter the results. (optional)
    label_ids = ['label_ids_example'] # List[str] | List of Label Ids to use to filter the results. (optional)
    entity_statuses = ["ACTIVE"] # List[str] | Label entity status (optional) (default to ["ACTIVE"])
    label_types = ["BRAND","CUSTOM"] # List[str] | Label type. (optional) (default to ["BRAND","CUSTOM"])
    page_size = 25 # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)

    try:
        # List labels
        api_response = api_instance.labels_list(ad_account_id, campaign_ids=campaign_ids, label_ids=label_ids, entity_statuses=entity_statuses, label_types=label_types, page_size=page_size, bookmark=bookmark)
        print("The response of LabelsApi->labels_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LabelsApi->labels_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **campaign_ids** | [**List[str]**](str.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **label_ids** | [**List[str]**](str.md)| List of Label Ids to use to filter the results. | [optional] 
 **entity_statuses** | [**List[str]**](str.md)| Label entity status | [optional] [default to [&quot;ACTIVE&quot;]]
 **label_types** | [**List[str]**](str.md)| Label type. | [optional] [default to [&quot;BRAND&quot;,&quot;CUSTOM&quot;]]
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**LabelsList200Response**](LabelsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account ads parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labels_update**
> LabelsResponse labels_update(ad_account_id, label_update_request)

Update labels

<p>
  <a href="/docs/getting-started/using-beta-and-restricted-features/" target="blank" target="blank">Closed beta</a>
  This endpoint is not available to all users.
</p>
<p>
  Change the properties of one or more labels.
</p>

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.label_update_request import LabelUpdateRequest
from pinterestsdk.models.labels_response import LabelsResponse
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
    api_instance = pinterestsdk.LabelsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    label_update_request = pinterestsdk.LabelUpdateRequest() # LabelUpdateRequest | 

    try:
        # Update labels
        api_response = api_instance.labels_update(ad_account_id, label_update_request)
        print("The response of LabelsApi->labels_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LabelsApi->labels_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **label_update_request** | [**LabelUpdateRequest**](LabelUpdateRequest.md)|  | 

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

