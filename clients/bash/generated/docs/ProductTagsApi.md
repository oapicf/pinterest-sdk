# ProductTagsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productTagsBulkAdd**](ProductTagsApi.md#productTagsBulkAdd) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin
[**productTagsBulkDelete**](ProductTagsApi.md#productTagsBulkDelete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin
[**productTagsList**](ProductTagsApi.md#productTagsList) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin



## productTagsBulkAdd

Add product tags to pin

Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin.
- Maximum 24 product tags can be added in a single request.
- Duplicate pin_ids in the request will result in an error.
- If any product tag fails eligibility check, the entire request fails (all-or-nothing).
- If a product tag is already tagged on the pin, it is treated as a no-op success.

### Example

```bash
 productTagsBulkAdd pin_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **string** | Unique identifier of the hero pin that will receive product tags. | [default to null]
 **productTagsBulkAddRequest** | [**ProductTagsBulkAddRequest**](ProductTagsBulkAddRequest.md) |  |

### Return type

[**ProductTagsResponse**](ProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## productTagsBulkDelete

Delete product tags from pin

Delete product tags from a pin.
- If a product tag is not found on the pin, it is treated as a no-op success.

### Example

```bash
 productTagsBulkDelete pin_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **string** | Unique identifier of the hero pin that will receive product tags. | [default to null]
 **productTagsBulkDeleteRequest** | [**ProductTagsBulkDeleteRequest**](ProductTagsBulkDeleteRequest.md) |  |

### Return type

(empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## productTagsList

Get product tags for pin

Retrieve all product tags for a pin.
- Returns an empty array if the pin has no product tags.

### Example

```bash
 productTagsList pin_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **string** | Unique identifier of the hero pin that will receive product tags. | [default to null]

### Return type

[**ProductTagsResponse**](ProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

