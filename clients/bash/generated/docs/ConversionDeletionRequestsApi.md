# ConversionDeletionRequestsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversionDeletionRequestCreate**](ConversionDeletionRequestsApi.md#conversionDeletionRequestCreate) | **POST** /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request
[**conversionDeletionRequestDelete**](ConversionDeletionRequestsApi.md#conversionDeletionRequestDelete) | **DELETE** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request
[**conversionDeletionRequestGet**](ConversionDeletionRequestsApi.md#conversionDeletionRequestGet) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request
[**conversionDeletionRequestList**](ConversionDeletionRequestsApi.md#conversionDeletionRequestList) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests



## conversionDeletionRequestCreate

Create a conversion deletion request

**This endpoint is currently in beta and not available to all apps.**
[Learn more](/docs/key-concepts/using-beta-and-restricted-features/).
Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified 'ad_account_id'.
After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion
within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.

### Example

```bash
 conversionDeletionRequestCreate ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **conversionDeletionRequestCreate** | [**ConversionDeletionRequestCreate**](ConversionDeletionRequestCreate.md) |  |

### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## conversionDeletionRequestDelete

Delete a conversion deletion request

**This endpoint is currently in beta and not available to all apps.**
[Learn more](/docs/key-concepts/using-beta-and-restricted-features/).
Delete a conversion deletion request from 'ad_account_id' with 'request_id'.
This will cancel the request and prevent it from being processed. This can only be
done if the request is in the 'PENDING' status and before the 72 hours mark.

### Example

```bash
 conversionDeletionRequestDelete request_id=value ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **string** | Unique identifier of the conversion deletion request | [default to null]
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]

### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## conversionDeletionRequestGet

Get a single conversion deletion request

**This endpoint is currently in beta and not available to all apps.**
[Learn more](/docs/key-concepts/using-beta-and-restricted-features/).
Get a single conversion deletion request from 'ad_account_id' with 'request_id'.

### Example

```bash
 conversionDeletionRequestGet request_id=value ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **string** | Unique identifier of the conversion deletion request | [default to null]
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]

### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## conversionDeletionRequestList

List conversion deletion requests

**This endpoint is currently in beta and not available to all apps.**
[Learn more](/docs/key-concepts/using-beta-and-restricted-features/).
Get a list of the conversion deletion requests for the specified 'ad_account_id'.

### Example

```bash
 conversionDeletionRequestList ad_account_id=value  bookmark=value  page_size=value  order=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page.
See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID.
Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]

### Return type

[**ConversionDeletionRequestList200Response**](ConversionDeletionRequestList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

