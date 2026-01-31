# OAICustomerListUploadsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerListUploadsCreate**](OAICustomerListUploadsApi.md#customerlistuploadscreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
[**customerListUploadsGet**](OAICustomerListUploadsApi.md#customerlistuploadsget) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
[**customerListUploadsRun**](OAICustomerListUploadsApi.md#customerlistuploadsrun) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload


# **customerListUploadsCreate**
```objc
-(NSURLSessionTask*) customerListUploadsCreateWithAdAccountId: (NSString*) adAccountId
    customerListId: (NSString*) customerListId
    customerListUploadCreateRequest: (OAICustomerListUploadCreateRequest*) customerListUploadCreateRequest
        completionHandler: (void (^)(OAICustomerListUploadCreateResponse* output, NSError* error)) handler;
```

Create customer list upload

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>  <p>Create a customer list upload request for multipart S3 upload.</p> <p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p> <p><b>Please review the <u><a href=\"/docs/api/v5/customer_lists-update/\" target=\"_blank\">update customer list endpoint</a></u> documentation for additional information.</b></p>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* customerListId = @"customerListId_example"; // Unique identifier of a customer list
OAICustomerListUploadCreateRequest* customerListUploadCreateRequest = [[OAICustomerListUploadCreateRequest alloc] init]; // Parameters to create a customer list upload request

OAICustomerListUploadsApi*apiInstance = [[OAICustomerListUploadsApi alloc] init];

// Create customer list upload
[apiInstance customerListUploadsCreateWithAdAccountId:adAccountId
              customerListId:customerListId
              customerListUploadCreateRequest:customerListUploadCreateRequest
          completionHandler: ^(OAICustomerListUploadCreateResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICustomerListUploadsApi->customerListUploadsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **customerListId** | **NSString***| Unique identifier of a customer list | 
 **customerListUploadCreateRequest** | [**OAICustomerListUploadCreateRequest***](OAICustomerListUploadCreateRequest.md)| Parameters to create a customer list upload request | 

### Return type

[**OAICustomerListUploadCreateResponse***](OAICustomerListUploadCreateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customerListUploadsGet**
```objc
-(NSURLSessionTask*) customerListUploadsGetWithAdAccountId: (NSString*) adAccountId
    customerListId: (NSString*) customerListId
    customerListUploadId: (NSString*) customerListUploadId
        completionHandler: (void (^)(OAICustomerListUploadResponse* output, NSError* error)) handler;
```

Get customer list upload

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Get the metadata for a given upload by its ID.</p>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* customerListId = @"customerListId_example"; // Unique identifier of a customer list
NSString* customerListUploadId = @"customerListUploadId_example"; // Unique identifier of a customer list upload

OAICustomerListUploadsApi*apiInstance = [[OAICustomerListUploadsApi alloc] init];

// Get customer list upload
[apiInstance customerListUploadsGetWithAdAccountId:adAccountId
              customerListId:customerListId
              customerListUploadId:customerListUploadId
          completionHandler: ^(OAICustomerListUploadResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICustomerListUploadsApi->customerListUploadsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **customerListId** | **NSString***| Unique identifier of a customer list | 
 **customerListUploadId** | **NSString***| Unique identifier of a customer list upload | 

### Return type

[**OAICustomerListUploadResponse***](OAICustomerListUploadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customerListUploadsRun**
```objc
-(NSURLSessionTask*) customerListUploadsRunWithAdAccountId: (NSString*) adAccountId
    customerListId: (NSString*) customerListId
    customerListUploadId: (NSString*) customerListUploadId
        completionHandler: (void (^)(OAICustomerListUploadResponse* output, NSError* error)) handler;
```

Run customer list upload

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Begin processing a customer list upload.</p>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* customerListId = @"customerListId_example"; // Unique identifier of a customer list
NSString* customerListUploadId = @"customerListUploadId_example"; // Unique identifier of a customer list upload

OAICustomerListUploadsApi*apiInstance = [[OAICustomerListUploadsApi alloc] init];

// Run customer list upload
[apiInstance customerListUploadsRunWithAdAccountId:adAccountId
              customerListId:customerListId
              customerListUploadId:customerListUploadId
          completionHandler: ^(OAICustomerListUploadResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICustomerListUploadsApi->customerListUploadsRun: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **customerListId** | **NSString***| Unique identifier of a customer list | 
 **customerListUploadId** | **NSString***| Unique identifier of a customer list upload | 

### Return type

[**OAICustomerListUploadResponse***](OAICustomerListUploadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

