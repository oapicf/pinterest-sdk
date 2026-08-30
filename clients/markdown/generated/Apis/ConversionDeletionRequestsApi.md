# ConversionDeletionRequestsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**conversionDeletionRequest/create**](ConversionDeletionRequestsApi.md#conversionDeletionRequest/create) | **POST** /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request |
| [**conversionDeletionRequest/delete**](ConversionDeletionRequestsApi.md#conversionDeletionRequest/delete) | **DELETE** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request |
| [**conversionDeletionRequest/get**](ConversionDeletionRequestsApi.md#conversionDeletionRequest/get) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request |
| [**conversionDeletionRequest/list**](ConversionDeletionRequestsApi.md#conversionDeletionRequest/list) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests |


<a name="conversionDeletionRequest/create"></a>
# **conversionDeletionRequest/create**
> ConversionDeletionRequest conversionDeletionRequest/create(ad\_account\_id, ConversionDeletionRequestCreate)

Create a conversion deletion request

    **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified &#x60;ad_account_id&#x60;. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **ConversionDeletionRequestCreate** | [**ConversionDeletionRequestCreate**](../Models/ConversionDeletionRequestCreate.md)|  | |

### Return type

[**ConversionDeletionRequest**](../Models/ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="conversionDeletionRequest/delete"></a>
# **conversionDeletionRequest/delete**
> ConversionDeletionRequest conversionDeletionRequest/delete(request\_id, ad\_account\_id)

Delete a conversion deletion request

    **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;. This will cancel the request and prevent it from being processed. This can only be done if the request is in the &#x60;PENDING&#x60; status and before the 72 hours mark.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **request\_id** | **String**| Unique identifier of the conversion deletion request | [default to null] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |

### Return type

[**ConversionDeletionRequest**](../Models/ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="conversionDeletionRequest/get"></a>
# **conversionDeletionRequest/get**
> ConversionDeletionRequest conversionDeletionRequest/get(request\_id, ad\_account\_id)

Get a single conversion deletion request

    **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **request\_id** | **String**| Unique identifier of the conversion deletion request | [default to null] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |

### Return type

[**ConversionDeletionRequest**](../Models/ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="conversionDeletionRequest/list"></a>
# **conversionDeletionRequest/list**
> conversion_deletion_request_list_200_response conversionDeletionRequest/list(ad\_account\_id, bookmark, page\_size, order)

List conversion deletion requests

    **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified &#x60;ad_account_id&#x60;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**Pinterest.Lib.PaginationOrder**](../Models/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |

### Return type

[**conversion_deletion_request_list_200_response**](../Models/conversion_deletion_request_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

