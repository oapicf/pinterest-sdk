# ProductTagsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ProductTagsAPI_productTagsBulkAdd**](ProductTagsAPI.md#ProductTagsAPI_productTagsBulkAdd) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin
[**ProductTagsAPI_productTagsBulkDelete**](ProductTagsAPI.md#ProductTagsAPI_productTagsBulkDelete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin
[**ProductTagsAPI_productTagsList**](ProductTagsAPI.md#ProductTagsAPI_productTagsList) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin


# **ProductTagsAPI_productTagsBulkAdd**
```c
// Add product tags to pin
//
// Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.
//
product_tags_response_t* ProductTagsAPI_productTagsBulkAdd(apiClient_t *apiClient, char *pin_id, product_tags_bulk_add_request_t *product_tags_bulk_add_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**pin_id** | **char \*** | Unique identifier of the hero pin that will receive product tags. | 
**product_tags_bulk_add_request** | **[product_tags_bulk_add_request_t](product_tags_bulk_add_request.md) \*** |  | 

### Return type

[product_tags_response_t](product_tags_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProductTagsAPI_productTagsBulkDelete**
```c
// Delete product tags from pin
//
// Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.
//
void ProductTagsAPI_productTagsBulkDelete(apiClient_t *apiClient, char *pin_id, product_tags_bulk_delete_request_t *product_tags_bulk_delete_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**pin_id** | **char \*** | Unique identifier of the hero pin that will receive product tags. | 
**product_tags_bulk_delete_request** | **[product_tags_bulk_delete_request_t](product_tags_bulk_delete_request.md) \*** |  | 

### Return type

void

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProductTagsAPI_productTagsList**
```c
// Get product tags for pin
//
// Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.
//
product_tags_response_t* ProductTagsAPI_productTagsList(apiClient_t *apiClient, char *pin_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**pin_id** | **char \*** | Unique identifier of the hero pin that will receive product tags. | 

### Return type

[product_tags_response_t](product_tags_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

