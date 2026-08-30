# product_tags_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**product_tags/bulk_add**](product_tags_api.md#product_tags/bulk_add) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin
**product_tags/bulk_delete**](product_tags_api.md#product_tags/bulk_delete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin
**product_tags/list**](product_tags_api.md#product_tags/list) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin


# **product_tags/bulk_add**
> models::ProductTagsResponse product_tags/bulk_add(ctx, pin_id, product_tags_bulk_add_request)
Add product tags to pin

Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **pin_id** | **String**| Unique identifier of the hero pin that will receive product tags. | 
  **product_tags_bulk_add_request** | [**ProductTagsBulkAddRequest**](ProductTagsBulkAddRequest.md)|  | 

### Return type

[**models::ProductTagsResponse**](ProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_tags/bulk_delete**
> product_tags/bulk_delete(ctx, pin_id, product_tags_bulk_delete_request)
Delete product tags from pin

Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **pin_id** | **String**| Unique identifier of the hero pin that will receive product tags. | 
  **product_tags_bulk_delete_request** | [**ProductTagsBulkDeleteRequest**](ProductTagsBulkDeleteRequest.md)|  | 

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_tags/list**
> models::ProductTagsResponse product_tags/list(ctx, pin_id)
Get product tags for pin

Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **pin_id** | **String**| Unique identifier of the hero pin that will receive product tags. | 

### Return type

[**models::ProductTagsResponse**](ProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

