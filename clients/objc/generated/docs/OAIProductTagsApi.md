# OAIProductTagsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productTagsBulkAdd**](OAIProductTagsApi.md#producttagsbulkadd) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin
[**productTagsBulkDelete**](OAIProductTagsApi.md#producttagsbulkdelete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin
[**productTagsList**](OAIProductTagsApi.md#producttagslist) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin


# **productTagsBulkAdd**
```objc
-(NSURLSessionTask*) productTagsBulkAddWithPinId: (NSString*) pinId
    productTagsBulkAddRequest: (OAIProductTagsBulkAddRequest*) productTagsBulkAddRequest
        completionHandler: (void (^)(OAIProductTagsResponse* output, NSError* error)) handler;
```

Add product tags to pin

Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* pinId = @"pinId_example"; // Unique identifier of the hero pin that will receive product tags.
OAIProductTagsBulkAddRequest* productTagsBulkAddRequest = [[OAIProductTagsBulkAddRequest alloc] init]; // 

OAIProductTagsApi*apiInstance = [[OAIProductTagsApi alloc] init];

// Add product tags to pin
[apiInstance productTagsBulkAddWithPinId:pinId
              productTagsBulkAddRequest:productTagsBulkAddRequest
          completionHandler: ^(OAIProductTagsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProductTagsApi->productTagsBulkAdd: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **NSString***| Unique identifier of the hero pin that will receive product tags. | 
 **productTagsBulkAddRequest** | [**OAIProductTagsBulkAddRequest***](OAIProductTagsBulkAddRequest.md)|  | 

### Return type

[**OAIProductTagsResponse***](OAIProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **productTagsBulkDelete**
```objc
-(NSURLSessionTask*) productTagsBulkDeleteWithPinId: (NSString*) pinId
    productTagsBulkDeleteRequest: (OAIProductTagsBulkDeleteRequest*) productTagsBulkDeleteRequest
        completionHandler: (void (^)(NSError* error)) handler;
```

Delete product tags from pin

Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* pinId = @"pinId_example"; // Unique identifier of the hero pin that will receive product tags.
OAIProductTagsBulkDeleteRequest* productTagsBulkDeleteRequest = [[OAIProductTagsBulkDeleteRequest alloc] init]; // 

OAIProductTagsApi*apiInstance = [[OAIProductTagsApi alloc] init];

// Delete product tags from pin
[apiInstance productTagsBulkDeleteWithPinId:pinId
              productTagsBulkDeleteRequest:productTagsBulkDeleteRequest
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIProductTagsApi->productTagsBulkDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **NSString***| Unique identifier of the hero pin that will receive product tags. | 
 **productTagsBulkDeleteRequest** | [**OAIProductTagsBulkDeleteRequest***](OAIProductTagsBulkDeleteRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **productTagsList**
```objc
-(NSURLSessionTask*) productTagsListWithPinId: (NSString*) pinId
        completionHandler: (void (^)(OAIProductTagsResponse* output, NSError* error)) handler;
```

Get product tags for pin

Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* pinId = @"pinId_example"; // Unique identifier of the hero pin that will receive product tags.

OAIProductTagsApi*apiInstance = [[OAIProductTagsApi alloc] init];

// Get product tags for pin
[apiInstance productTagsListWithPinId:pinId
          completionHandler: ^(OAIProductTagsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProductTagsApi->productTagsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **NSString***| Unique identifier of the hero pin that will receive product tags. | 

### Return type

[**OAIProductTagsResponse***](OAIProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

