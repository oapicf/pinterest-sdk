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
        completionHandler: (void (^)(NSError* error)) handler;
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
          completionHandler: ^(NSError* error) {
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

void (empty response body)

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
    integrationRequestPatch: (OAIIntegrationRequestPatch*) integrationRequestPatch
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
OAIIntegrationRequestPatch* integrationRequestPatch = [[OAIIntegrationRequestPatch alloc] init]; // Parameters to get create/update the Integration Metadata (optional)

OAIIntegrationsApi*apiInstance = [[OAIIntegrationsApi alloc] init];

// Update commerce integration
[apiInstance integrationsCommercePatchWithExternalBusinessId:externalBusinessId
              integrationRequestPatch:integrationRequestPatch
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
 **integrationRequestPatch** | [**OAIIntegrationRequestPatch***](OAIIntegrationRequestPatch.md)| Parameters to get create/update the Integration Metadata | [optional] 

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
-(NSURLSessionTask*) integrationsCommercePostWithIntegrationRequest: (OAIIntegrationRequest*) integrationRequest
        completionHandler: (void (^)(OAIIntegrationMetadata* output, NSError* error)) handler;
```

Create commerce integration

Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIIntegrationRequest* integrationRequest = [[OAIIntegrationRequest alloc] init]; // Parameters to get create/update the Integration Metadata (optional)

OAIIntegrationsApi*apiInstance = [[OAIIntegrationsApi alloc] init];

// Create commerce integration
[apiInstance integrationsCommercePostWithIntegrationRequest:integrationRequest
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
 **integrationRequest** | [**OAIIntegrationRequest***](OAIIntegrationRequest.md)| Parameters to get create/update the Integration Metadata | [optional] 

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


NSString* _id = @"_id_example"; // Integration ID.

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
 **_id** | **NSString***| Integration ID. | 

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
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)

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
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]

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
-(NSURLSessionTask*) integrationsLogsPostWithIntegrationLogsRequest: (OAIIntegrationLogsRequest*) integrationLogsRequest
        completionHandler: (void (^)(OAIIntegrationLogsSuccessResponse* output, NSError* error)) handler;
```

Receives batched logs from integration applications.

This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIIntegrationLogsRequest* integrationLogsRequest = [[OAIIntegrationLogsRequest alloc] init]; // Ingest log information from external integration application.

OAIIntegrationsApi*apiInstance = [[OAIIntegrationsApi alloc] init];

// Receives batched logs from integration applications.
[apiInstance integrationsLogsPostWithIntegrationLogsRequest:integrationLogsRequest
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
 **integrationLogsRequest** | [**OAIIntegrationLogsRequest***](OAIIntegrationLogsRequest.md)| Ingest log information from external integration application. | 

### Return type

[**OAIIntegrationLogsSuccessResponse***](OAIIntegrationLogsSuccessResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

