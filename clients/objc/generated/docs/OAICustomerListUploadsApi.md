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

Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // 
NSString* customerListId = @"customerListId_example"; // Customer list ID.
OAICustomerListUploadCreateRequest* customerListUploadCreateRequest = [[OAICustomerListUploadCreateRequest alloc] init]; // 

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
 **adAccountId** | **NSString***|  | 
 **customerListId** | **NSString***| Customer list ID. | 
 **customerListUploadCreateRequest** | [**OAICustomerListUploadCreateRequest***](OAICustomerListUploadCreateRequest.md)|  | 

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
        completionHandler: (void (^)(OAICustomerListUpload* output, NSError* error)) handler;
```

Get customer list upload

Get the metadata for a given upload by its ID.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // 
NSString* customerListId = @"customerListId_example"; // Customer list ID.
NSString* customerListUploadId = @"customerListUploadId_example"; // Customer List Upload ID.

OAICustomerListUploadsApi*apiInstance = [[OAICustomerListUploadsApi alloc] init];

// Get customer list upload
[apiInstance customerListUploadsGetWithAdAccountId:adAccountId
              customerListId:customerListId
              customerListUploadId:customerListUploadId
          completionHandler: ^(OAICustomerListUpload* output, NSError* error) {
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
 **adAccountId** | **NSString***|  | 
 **customerListId** | **NSString***| Customer list ID. | 
 **customerListUploadId** | **NSString***| Customer List Upload ID. | 

### Return type

[**OAICustomerListUpload***](OAICustomerListUpload.md)

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
        completionHandler: (void (^)(OAICustomerListUpload* output, NSError* error)) handler;
```

Run customer list upload

Begin processing a customer list upload.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // 
NSString* customerListId = @"customerListId_example"; // Customer list ID.
NSString* customerListUploadId = @"customerListUploadId_example"; // Customer List Upload ID.

OAICustomerListUploadsApi*apiInstance = [[OAICustomerListUploadsApi alloc] init];

// Run customer list upload
[apiInstance customerListUploadsRunWithAdAccountId:adAccountId
              customerListId:customerListId
              customerListUploadId:customerListUploadId
          completionHandler: ^(OAICustomerListUpload* output, NSError* error) {
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
 **adAccountId** | **NSString***|  | 
 **customerListId** | **NSString***| Customer list ID. | 
 **customerListUploadId** | **NSString***| Customer List Upload ID. | 

### Return type

[**OAICustomerListUpload***](OAICustomerListUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

