# OAIIntegrationsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**integrationsCommerceDel**](OAIIntegrationsApi.md#integrationscommercedel) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration
[**integrationsCommerceGet**](OAIIntegrationsApi.md#integrationscommerceget) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration
[**integrationsCommercePatch**](OAIIntegrationsApi.md#integrationscommercepatch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration
[**integrationsCommercePost**](OAIIntegrationsApi.md#integrationscommercepost) | **POST** /integrations/commerce | Create commerce integration
[**integrationsGetById**](OAIIntegrationsApi.md#integrationsgetbyid) | **GET** /integrations/{id} | Get integration metadata
[**integrationsGetList**](OAIIntegrationsApi.md#integrationsgetlist) | **GET** /integrations | Get integration metadata list
[**integrationsLogsPost**](OAIIntegrationsApi.md#integrationslogspost) | **POST** /integrations/logs | Receives batched logs from integration applications.


# **integrationsCommerceDel**
```objc
-(NSURLSessionTask*) integrationsCommerceDelWithExternalBusinessId: (NSString*) externalBusinessId
        completionHandler: (void (^)(OAIIntegrationMetadata* output, NSError* error)) handler;
```

Delete commerce integration

Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* externalBusinessId = @"externalBusinessId_example"; // External business ID for the integration.

OAIIntegrationsApi*apiInstance = [[OAIIntegrationsApi alloc] init];

// Delete commerce integration
[apiInstance integrationsCommerceDelWithExternalBusinessId:externalBusinessId
          completionHandler: ^(OAIIntegrationMetadata* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIIntegrationsApi->integrationsCommerceDel: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalBusinessId** | **NSString***| External business ID for the integration. | 

### Return type

[**OAIIntegrationMetadata***](OAIIntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrationsCommerceGet**
```objc
-(NSURLSessionTask*) integrationsCommerceGetWithExternalBusinessId: (NSString*) externalBusinessId
        completionHandler: (void (^)(OAIIntegrationMetadata* output, NSError* error)) handler;
```

Get commerce integration

Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* externalBusinessId = @"externalBusinessId_example"; // External business ID for the integration.

OAIIntegrationsApi*apiInstance = [[OAIIntegrationsApi alloc] init];

// Get commerce integration
[apiInstance integrationsCommerceGetWithExternalBusinessId:externalBusinessId
          completionHandler: ^(OAIIntegrationMetadata* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIIntegrationsApi->integrationsCommerceGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalBusinessId** | **NSString***| External business ID for the integration. | 

### Return type

[**OAIIntegrationMetadata***](OAIIntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrationsCommercePatch**
```objc
-(NSURLSessionTask*) integrationsCommercePatchWithExternalBusinessId: (NSString*) externalBusinessId
    integrationMetadataUpdate: (OAIIntegrationMetadataUpdate*) integrationMetadataUpdate
        completionHandler: (void (^)(OAIIntegrationMetadata* output, NSError* error)) handler;
```

Update commerce integration

Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* externalBusinessId = @"externalBusinessId_example"; // External business ID for the integration.
OAIIntegrationMetadataUpdate* integrationMetadataUpdate = [[OAIIntegrationMetadataUpdate alloc] init]; // 

OAIIntegrationsApi*apiInstance = [[OAIIntegrationsApi alloc] init];

// Update commerce integration
[apiInstance integrationsCommercePatchWithExternalBusinessId:externalBusinessId
              integrationMetadataUpdate:integrationMetadataUpdate
          completionHandler: ^(OAIIntegrationMetadata* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIIntegrationsApi->integrationsCommercePatch: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalBusinessId** | **NSString***| External business ID for the integration. | 
 **integrationMetadataUpdate** | [**OAIIntegrationMetadataUpdate***](OAIIntegrationMetadataUpdate.md)|  | 

### Return type

[**OAIIntegrationMetadata***](OAIIntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrationsCommercePost**
```objc
-(NSURLSessionTask*) integrationsCommercePostWithIntegrationMetadataCreate: (OAIIntegrationMetadataCreate*) integrationMetadataCreate
        completionHandler: (void (^)(OAIIntegrationMetadata* output, NSError* error)) handler;
```

Create commerce integration

Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIIntegrationMetadataCreate* integrationMetadataCreate = [[OAIIntegrationMetadataCreate alloc] init]; // 

OAIIntegrationsApi*apiInstance = [[OAIIntegrationsApi alloc] init];

// Create commerce integration
[apiInstance integrationsCommercePostWithIntegrationMetadataCreate:integrationMetadataCreate
          completionHandler: ^(OAIIntegrationMetadata* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIIntegrationsApi->integrationsCommercePost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationMetadataCreate** | [**OAIIntegrationMetadataCreate***](OAIIntegrationMetadataCreate.md)|  | 

### Return type

[**OAIIntegrationMetadata***](OAIIntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrationsGetById**
```objc
-(NSURLSessionTask*) integrationsGetByIdWithId: (NSString*) _id
        completionHandler: (void (^)(OAIIntegrationRecord* output, NSError* error)) handler;
```

Get integration metadata

Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* _id = @"_id_example"; // Integration record ID.

OAIIntegrationsApi*apiInstance = [[OAIIntegrationsApi alloc] init];

// Get integration metadata
[apiInstance integrationsGetByIdWithId:_id
          completionHandler: ^(OAIIntegrationRecord* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIIntegrationsApi->integrationsGetById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| Integration record ID. | 

### Return type

[**OAIIntegrationRecord***](OAIIntegrationRecord.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrationsGetList**
```objc
-(NSURLSessionTask*) integrationsGetListWithBookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIIntegrationsGetList200Response* output, NSError* error)) handler;
```

Get integration metadata list

Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)

OAIIntegrationsApi*apiInstance = [[OAIIntegrationsApi alloc] init];

// Get integration metadata list
[apiInstance integrationsGetListWithBookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIIntegrationsGetList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIIntegrationsApi->integrationsGetList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]

### Return type

[**OAIIntegrationsGetList200Response***](OAIIntegrationsGetList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrationsLogsPost**
```objc
-(NSURLSessionTask*) integrationsLogsPostWithIntegrationLogsRequestCreate: (OAIIntegrationLogsRequestCreate*) integrationLogsRequestCreate
        completionHandler: (void (^)(OAIIntegrationLogsSuccessResponse* output, NSError* error)) handler;
```

Receives batched logs from integration applications.

This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIIntegrationLogsRequestCreate* integrationLogsRequestCreate = [[OAIIntegrationLogsRequestCreate alloc] init]; // 

OAIIntegrationsApi*apiInstance = [[OAIIntegrationsApi alloc] init];

// Receives batched logs from integration applications.
[apiInstance integrationsLogsPostWithIntegrationLogsRequestCreate:integrationLogsRequestCreate
          completionHandler: ^(OAIIntegrationLogsSuccessResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIIntegrationsApi->integrationsLogsPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationLogsRequestCreate** | [**OAIIntegrationLogsRequestCreate***](OAIIntegrationLogsRequestCreate.md)|  | 

### Return type

[**OAIIntegrationLogsSuccessResponse***](OAIIntegrationLogsSuccessResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

