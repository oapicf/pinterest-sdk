# OAIMediaApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mediaCreate**](OAIMediaApi.md#mediacreate) | **POST** /media | Register media upload
[**mediaGet**](OAIMediaApi.md#mediaget) | **GET** /media/{media_id} | Get media upload details
[**mediaList**](OAIMediaApi.md#medialist) | **GET** /media | List media uploads


# **mediaCreate**
```objc
-(NSURLSessionTask*) mediaCreateWithMediaUploadRequest: (OAIMediaUploadRequest*) mediaUploadRequest
        completionHandler: (void (^)(OAIMediaUpload* output, NSError* error)) handler;
```

Register media upload

Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file's contents as the request's <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIMediaUploadRequest* mediaUploadRequest = [[OAIMediaUploadRequest alloc] init]; // Create a media upload request

OAIMediaApi*apiInstance = [[OAIMediaApi alloc] init];

// Register media upload
[apiInstance mediaCreateWithMediaUploadRequest:mediaUploadRequest
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
 **mediaUploadRequest** | [**OAIMediaUploadRequest***](OAIMediaUploadRequest.md)| Create a media upload request | 

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
        completionHandler: (void (^)(OAIMediaUploadDetails* output, NSError* error)) handler;
```

Get media upload details

Get details for a registered media upload, including its current status.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* mediaId = @"mediaId_example"; // Media identifier

OAIMediaApi*apiInstance = [[OAIMediaApi alloc] init];

// Get media upload details
[apiInstance mediaGetWithMediaId:mediaId
          completionHandler: ^(OAIMediaUploadDetails* output, NSError* error) {
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
 **mediaId** | **NSString***| Media identifier | 

### Return type

[**OAIMediaUploadDetails***](OAIMediaUploadDetails.md)

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
        completionHandler: (void (^)(OAIPaginated* output, NSError* error)) handler;
```

List media uploads

List media uploads filtered by given parameters.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to @25)

OAIMediaApi*apiInstance = [[OAIMediaApi alloc] init];

// List media uploads
[apiInstance mediaListWithBookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIPaginated* output, NSError* error) {
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
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]

### Return type

[**OAIPaginated***](OAIPaginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

