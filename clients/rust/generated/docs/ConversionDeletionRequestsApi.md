# \ConversionDeletionRequestsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversion_deletion_request_slash_create**](ConversionDeletionRequestsApi.md#conversion_deletion_request_slash_create) | **POST** /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request
[**conversion_deletion_request_slash_delete**](ConversionDeletionRequestsApi.md#conversion_deletion_request_slash_delete) | **DELETE** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request
[**conversion_deletion_request_slash_get**](ConversionDeletionRequestsApi.md#conversion_deletion_request_slash_get) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request
[**conversion_deletion_request_slash_list**](ConversionDeletionRequestsApi.md#conversion_deletion_request_slash_list) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests



## conversion_deletion_request_slash_create

> models::ConversionDeletionRequest conversion_deletion_request_slash_create(ad_account_id, conversion_deletion_request_create)
Create a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified `ad_account_id`. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**conversion_deletion_request_create** | [**ConversionDeletionRequestCreate**](ConversionDeletionRequestCreate.md) |  | [required] |

### Return type

[**models::ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## conversion_deletion_request_slash_delete

> models::ConversionDeletionRequest conversion_deletion_request_slash_delete(request_id, ad_account_id)
Delete a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from `ad_account_id` with `request_id`. This will cancel the request and prevent it from being processed. This can only be done if the request is in the `PENDING` status and before the 72 hours mark.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**request_id** | **String** | Unique identifier of the conversion deletion request | [required] |
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |

### Return type

[**models::ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## conversion_deletion_request_slash_get

> models::ConversionDeletionRequest conversion_deletion_request_slash_get(request_id, ad_account_id)
Get a single conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from `ad_account_id` with `request_id`.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**request_id** | **String** | Unique identifier of the conversion deletion request | [required] |
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |

### Return type

[**models::ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## conversion_deletion_request_slash_list

> models::ConversionDeletionRequestList200Response conversion_deletion_request_slash_list(ad_account_id, bookmark, page_size, order)
List conversion deletion requests

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified `ad_account_id`.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. |  |[default to 25]
**order** | Option<[**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md)> | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. |  |

### Return type

[**models::ConversionDeletionRequestList200Response**](conversion_deletion_request_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

