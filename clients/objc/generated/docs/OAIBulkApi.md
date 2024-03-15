# OAIBulkApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkDownloadCreate**](OAIBulkApi.md#bulkdownloadcreate) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
[**bulkRequestGet**](OAIBulkApi.md#bulkrequestget) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
[**bulkUpsertCreate**](OAIBulkApi.md#bulkupsertcreate) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk


# **bulkDownloadCreate**
```objc
-(NSURLSessionTask*) bulkDownloadCreateWithAdAccountId: (NSString*) adAccountId
    bulkDownloadRequest: (OAIBulkDownloadRequest*) bulkDownloadRequest
        completionHandler: (void (^)(OAIBulkDownloadResponse* output, NSError* error)) handler;
```

Get advertiser entities in bulk

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAIBulkDownloadRequest* bulkDownloadRequest = [[OAIBulkDownloadRequest alloc] init]; // Parameters to get ad entities in bulk

OAIBulkApi*apiInstance = [[OAIBulkApi alloc] init];

// Get advertiser entities in bulk
[apiInstance bulkDownloadCreateWithAdAccountId:adAccountId
              bulkDownloadRequest:bulkDownloadRequest
          completionHandler: ^(OAIBulkDownloadResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBulkApi->bulkDownloadCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **bulkDownloadRequest** | [**OAIBulkDownloadRequest***](OAIBulkDownloadRequest.md)| Parameters to get ad entities in bulk | 

### Return type

[**OAIBulkDownloadResponse***](OAIBulkDownloadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bulkRequestGet**
```objc
-(NSURLSessionTask*) bulkRequestGetWithAdAccountId: (NSString*) adAccountId
    bulkRequestId: (NSString*) bulkRequestId
    includeDetails: (NSNumber*) includeDetails
        completionHandler: (void (^)(OAIBulkUpsertStatusResponse* output, NSError* error)) handler;
```

Download advertiser entities in bulk

Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* bulkRequestId = @"bulkRequestId_example"; // Unique identifier of a bulk upsert request.
NSNumber* includeDetails = @(NO); // if set to True then attach the errors/details to all the requests (optional) (default to @(NO))

OAIBulkApi*apiInstance = [[OAIBulkApi alloc] init];

// Download advertiser entities in bulk
[apiInstance bulkRequestGetWithAdAccountId:adAccountId
              bulkRequestId:bulkRequestId
              includeDetails:includeDetails
          completionHandler: ^(OAIBulkUpsertStatusResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBulkApi->bulkRequestGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **bulkRequestId** | **NSString***| Unique identifier of a bulk upsert request. | 
 **includeDetails** | **NSNumber***| if set to True then attach the errors/details to all the requests | [optional] [default to @(NO)]

### Return type

[**OAIBulkUpsertStatusResponse***](OAIBulkUpsertStatusResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bulkUpsertCreate**
```objc
-(NSURLSessionTask*) bulkUpsertCreateWithAdAccountId: (NSString*) adAccountId
    bulkUpsertRequest: (OAIBulkUpsertRequest*) bulkUpsertRequest
        completionHandler: (void (^)(OAIBulkUpsertResponse* output, NSError* error)) handler;
```

Create/update ad entities in bulk

Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAIBulkUpsertRequest* bulkUpsertRequest = [[OAIBulkUpsertRequest alloc] init]; // Parameters to get create/update ad entities in bulk

OAIBulkApi*apiInstance = [[OAIBulkApi alloc] init];

// Create/update ad entities in bulk
[apiInstance bulkUpsertCreateWithAdAccountId:adAccountId
              bulkUpsertRequest:bulkUpsertRequest
          completionHandler: ^(OAIBulkUpsertResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBulkApi->bulkUpsertCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **bulkUpsertRequest** | [**OAIBulkUpsertRequest***](OAIBulkUpsertRequest.md)| Parameters to get create/update ad entities in bulk | 

### Return type

[**OAIBulkUpsertResponse***](OAIBulkUpsertResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

