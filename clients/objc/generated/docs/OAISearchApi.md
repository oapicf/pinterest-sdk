# OAISearchApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchPartnerPins**](OAISearchApi.md#searchpartnerpins) | **GET** /search/partner/pins | Search pins by a given search term
[**searchUserBoardsGet**](OAISearchApi.md#searchuserboardsget) | **GET** /search/boards | Search user&#39;s boards
[**searchUserPinsList**](OAISearchApi.md#searchuserpinslist) | **GET** /search/pins | Search user&#39;s Pins


# **searchPartnerPins**
```objc
-(NSURLSessionTask*) searchPartnerPinsWithTerm: (NSString*) term
    countryCode: (NSString*) countryCode
    bookmark: (NSString*) bookmark
    locale: (NSString*) locale
    limit: (NSNumber*) limit
        completionHandler: (void (^)(OAISearchPartnerPins200Response* output, NSError* error)) handler;
```

Search pins by a given search term

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* term = @"term_example"; // Search term to look up pins.
NSString* countryCode = US; // Two letter country code (ISO 3166-1 alpha-2)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSString* locale = @"locale_example"; // Search locale. (optional)
NSNumber* limit = 4; // Max search result size (optional) (default to @10)

OAISearchApi*apiInstance = [[OAISearchApi alloc] init];

// Search pins by a given search term
[apiInstance searchPartnerPinsWithTerm:term
              countryCode:countryCode
              bookmark:bookmark
              locale:locale
              limit:limit
          completionHandler: ^(OAISearchPartnerPins200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISearchApi->searchPartnerPins: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **NSString***| Search term to look up pins. | 
 **countryCode** | **NSString***| Two letter country code (ISO 3166-1 alpha-2) | 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **locale** | **NSString***| Search locale. | [optional] 
 **limit** | **NSNumber***| Max search result size | [optional] [default to @10]

### Return type

[**OAISearchPartnerPins200Response***](OAISearchPartnerPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **searchUserBoardsGet**
```objc
-(NSURLSessionTask*) searchUserBoardsGetWithAdAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    query: (NSString*) query
        completionHandler: (void (^)(OAISearchUserBoardsGet200Response* output, NSError* error)) handler;
```

Search user's boards

Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* query = @"query_example"; // Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)

OAISearchApi*apiInstance = [[OAISearchApi alloc] init];

// Search user's boards
[apiInstance searchUserBoardsGetWithAdAccountId:adAccountId
              bookmark:bookmark
              pageSize:pageSize
              query:query
          completionHandler: ^(OAISearchUserBoardsGet200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISearchApi->searchUserBoardsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **query** | **NSString***| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] 

### Return type

[**OAISearchUserBoardsGet200Response***](OAISearchUserBoardsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **searchUserPinsList**
```objc
-(NSURLSessionTask*) searchUserPinsListWithQuery: (NSString*) query
    adAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
        completionHandler: (void (^)(OAIPinsList200Response* output, NSError* error)) handler;
```

Search user's Pins

Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* query = Plants; // Search query. Can contain pin description keywords or comma-separated pin IDs.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)

OAISearchApi*apiInstance = [[OAISearchApi alloc] init];

// Search user's Pins
[apiInstance searchUserPinsListWithQuery:query
              adAccountId:adAccountId
              bookmark:bookmark
          completionHandler: ^(OAIPinsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISearchApi->searchUserPinsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **NSString***| Search query. Can contain pin description keywords or comma-separated pin IDs. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 

### Return type

[**OAIPinsList200Response***](OAIPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

