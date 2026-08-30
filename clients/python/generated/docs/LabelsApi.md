# pinterestsdk.LabelsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**labels_apply**](LabelsApi.md#labels_apply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
[**labels_create**](LabelsApi.md#labels_create) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**labels_list**](LabelsApi.md#labels_list) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**labels_remove**](LabelsApi.md#labels_remove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities
[**labels_update**](LabelsApi.md#labels_update) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels


# **labels_apply**
> LabeledEntities labels_apply(ad_account_id, label_id, labeled_entities_create)

Apply label to entity

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)

  Apply a label to one or more campaigns.
  Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.
  Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.

  **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.labeled_entities import LabeledEntities
from pinterestsdk.models.labeled_entities_create import LabeledEntitiesCreate
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
    ad_account_id = 'ad_account_id_example' # str | 
    label_id = 'label_id_example' # str | Label ID.
    labeled_entities_create = pinterestsdk.LabeledEntitiesCreate() # LabeledEntitiesCreate | 

    try:
        # Apply label to entity
        api_response = api_instance.labels_apply(ad_account_id, label_id, labeled_entities_create)
        print("The response of LabelsApi->labels_apply:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LabelsApi->labels_apply: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**|  | 
 **label_id** | **str**| Label ID. | 
 **labeled_entities_create** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md)|  | 

### Return type

[**LabeledEntities**](LabeledEntities.md)

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

# **labels_create**
> LabelsResponse labels_create(ad_account_id, label_create_request)

Create labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)

Apply one or more labels to a campaign.
Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/).
Currently, you can apply brand and custom labels. Future releases will provide more options.

**Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.

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
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labels_list**
> LabelsList200Response labels_list(ad_account_id, campaign_ids=campaign_ids, label_ids=label_ids, entity_statuses=entity_statuses, label_types=label_types, bookmark=bookmark, page_size=page_size)

List labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)

See a list of labels for assets that your account owns, and filter the list by different criteria.
If no filter is provided, it will default to labels associated with the ad account id.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.labels_list200_response import LabelsList200Response
from pinterestsdk.models.query_label_entity_statuses_items import QueryLabelEntityStatusesItems
from pinterestsdk.models.query_label_types_items import QueryLabelTypesItems
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
    entity_statuses = ["ACTIVE"] # List[QueryLabelEntityStatusesItems] | Label entity status (optional) (default to ["ACTIVE"])
    label_types = ["BRAND","CUSTOM"] # List[QueryLabelTypesItems] | Label type. (optional) (default to ["BRAND","CUSTOM"])
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

    try:
        # List labels
        api_response = api_instance.labels_list(ad_account_id, campaign_ids=campaign_ids, label_ids=label_ids, entity_statuses=entity_statuses, label_types=label_types, bookmark=bookmark, page_size=page_size)
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
 **entity_statuses** | [**List[QueryLabelEntityStatusesItems]**](QueryLabelEntityStatusesItems.md)| Label entity status | [optional] [default to [&quot;ACTIVE&quot;]]
 **label_types** | [**List[QueryLabelTypesItems]**](QueryLabelTypesItems.md)| Label type. | [optional] [default to [&quot;BRAND&quot;,&quot;CUSTOM&quot;]]
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labels_remove**
> LabeledEntities labels_remove(ad_account_id, label_id, labeled_entities_create)

Remove label from entities

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)

  Remove a label from one or more entities.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.labeled_entities import LabeledEntities
from pinterestsdk.models.labeled_entities_create import LabeledEntitiesCreate
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
    ad_account_id = 'ad_account_id_example' # str | 
    label_id = 'label_id_example' # str | Label ID.
    labeled_entities_create = pinterestsdk.LabeledEntitiesCreate() # LabeledEntitiesCreate | 

    try:
        # Remove label from entities
        api_response = api_instance.labels_remove(ad_account_id, label_id, labeled_entities_create)
        print("The response of LabelsApi->labels_remove:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LabelsApi->labels_remove: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**|  | 
 **label_id** | **str**| Label ID. | 
 **labeled_entities_create** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md)|  | 

### Return type

[**LabeledEntities**](LabeledEntities.md)

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

# **labels_update**
> LabelsResponse labels_update(ad_account_id, label_update_request)

Update labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)

Change the properties of one or more labels.

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
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

