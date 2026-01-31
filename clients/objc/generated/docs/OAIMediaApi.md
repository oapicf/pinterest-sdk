# OAIMediaApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mediaCreate**](OAIMediaApi.md#mediacreate) | **POST** /media | Register media upload
[**mediaGet**](OAIMediaApi.md#mediaget) | **GET** /media/{media_id} | Get media upload details
[**mediaList**](OAIMediaApi.md#medialist) | **GET** /media | List media uploads


# **mediaCreate**
```objc
-(NSURLSessionTask*) mediaCreateWithMediaUploadCreate: (OAIMediaUploadCreate*) mediaUploadCreate
        completionHandler: (void (^)(OAIMediaUpload* output, NSError* error)) handler;
```

Register media upload

Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using `curl`, for example) to `upload_url` using the `Content-Type` header value. Send the media file's contents as the request's `file` parameter and also include all of the parameters from `upload_parameters`.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIMediaUploadCreate* mediaUploadCreate = [[OAIMediaUploadCreate alloc] init]; // 

OAIMediaApi*apiInstance = [[OAIMediaApi alloc] init];

// Register media upload
[apiInstance mediaCreateWithMediaUploadCreate:mediaUploadCreate
          completionHandler: ^(OAIMediaUpload* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMediaApi->mediaCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaUploadCreate** | [**OAIMediaUploadCreate***](OAIMediaUploadCreate.md)|  | 

### Return type

[**OAIMediaUpload***](OAIMediaUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mediaGet**
```objc
-(NSURLSessionTask*) mediaGetWithMediaId: (NSString*) mediaId
        completionHandler: (void (^)(OAIMedia* output, NSError* error)) handler;
```

Get media upload details

Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* mediaId = @"mediaId_example"; // Unique identifier for this media upload. Used to track status and for attaching during Pin creation.

OAIMediaApi*apiInstance = [[OAIMediaApi alloc] init];

// Get media upload details
[apiInstance mediaGetWithMediaId:mediaId
          completionHandler: ^(OAIMedia* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMediaApi->mediaGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | **NSString***| Unique identifier for this media upload. Used to track status and for attaching during Pin creation. | 

### Return type

[**OAIMedia***](OAIMedia.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mediaList**
```objc
-(NSURLSessionTask*) mediaListWithBookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIMediaList200Response* output, NSError* error)) handler;
```

List media uploads

List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)

OAIMediaApi*apiInstance = [[OAIMediaApi alloc] init];

// List media uploads
[apiInstance mediaListWithBookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIMediaList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMediaApi->mediaList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]

### Return type

[**OAIMediaList200Response***](OAIMediaList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

