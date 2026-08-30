# PRODUCTTAGS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**product_tags_bulk_add**](PRODUCTTAGS_API.md#product_tags_bulk_add) | **Post** /pins/{pin_id}/product_tags | Add product tags to pin
[**product_tags_bulk_delete**](PRODUCTTAGS_API.md#product_tags_bulk_delete) | **Post** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin
[**product_tags_list**](PRODUCTTAGS_API.md#product_tags_list) | **Get** /pins/{pin_id}/product_tags | Get product tags for pin


# **product_tags_bulk_add**
> product_tags_bulk_add (pin_id: STRING_32 ; product_tags_bulk_add_request: PRODUCT_TAGS_BULK_ADD_REQUEST ): detachable PRODUCT_TAGS_RESPONSE


Add product tags to pin

Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_id** | **STRING_32**| Unique identifier of the hero pin that will receive product tags. | [default to null]
 **product_tags_bulk_add_request** | [**PRODUCT_TAGS_BULK_ADD_REQUEST**](PRODUCT_TAGS_BULK_ADD_REQUEST.md)|  | 

### Return type

[**PRODUCT_TAGS_RESPONSE**](ProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_tags_bulk_delete**
> product_tags_bulk_delete (pin_id: STRING_32 ; product_tags_bulk_delete_request: PRODUCT_TAGS_BULK_DELETE_REQUEST )


Delete product tags from pin

Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_id** | **STRING_32**| Unique identifier of the hero pin that will receive product tags. | [default to null]
 **product_tags_bulk_delete_request** | [**PRODUCT_TAGS_BULK_DELETE_REQUEST**](PRODUCT_TAGS_BULK_DELETE_REQUEST.md)|  | 

### Return type

{empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_tags_list**
> product_tags_list (pin_id: STRING_32 ): detachable PRODUCT_TAGS_RESPONSE


Get product tags for pin

Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_id** | **STRING_32**| Unique identifier of the hero pin that will receive product tags. | [default to null]

### Return type

[**PRODUCT_TAGS_RESPONSE**](ProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

