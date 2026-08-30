# ProductTagsController

All URIs are relative to `"/v5"`

The controller class is defined in **[ProductTagsController.java](../../src/main/java/org/openapitools/controller/ProductTagsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**productTagsBulkAdd**](#productTagsBulkAdd) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin
[**productTagsBulkDelete**](#productTagsBulkDelete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin
[**productTagsList**](#productTagsList) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin

<a id="productTagsBulkAdd"></a>
# **productTagsBulkAdd**
```java
Mono<ProductTagsResponse> ProductTagsController.productTagsBulkAdd(pinIdproductTagsBulkAddRequest)
```

Add product tags to pin

Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**pinId** | `String` | Unique identifier of the hero pin that will receive product tags. |
**productTagsBulkAddRequest** | [**ProductTagsBulkAddRequest**](../../docs/models/ProductTagsBulkAddRequest.md) |  |

### Return type
[**ProductTagsResponse**](../../docs/models/ProductTagsResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `boards:write`, `pins:read`, `pins:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="productTagsBulkDelete"></a>
# **productTagsBulkDelete**
```java
Mono<Object> ProductTagsController.productTagsBulkDelete(pinIdproductTagsBulkDeleteRequest)
```

Delete product tags from pin

Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**pinId** | `String` | Unique identifier of the hero pin that will receive product tags. |
**productTagsBulkDeleteRequest** | [**ProductTagsBulkDeleteRequest**](../../docs/models/ProductTagsBulkDeleteRequest.md) |  |


### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `boards:write`, `pins:read`, `pins:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="productTagsList"></a>
# **productTagsList**
```java
Mono<ProductTagsResponse> ProductTagsController.productTagsList(pinId)
```

Get product tags for pin

Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**pinId** | `String` | Unique identifier of the hero pin that will receive product tags. |

### Return type
[**ProductTagsResponse**](../../docs/models/ProductTagsResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `pins:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

