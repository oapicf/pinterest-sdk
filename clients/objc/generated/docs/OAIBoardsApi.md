# OAIBoardsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**boardSectionsCreate**](OAIBoardsApi.md#boardsectionscreate) | **POST** /boards/{board_id}/sections | Create board section
[**boardSectionsDelete**](OAIBoardsApi.md#boardsectionsdelete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
[**boardSectionsList**](OAIBoardsApi.md#boardsectionslist) | **GET** /boards/{board_id}/sections | List board sections
[**boardSectionsListPins**](OAIBoardsApi.md#boardsectionslistpins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
[**boardSectionsUpdate**](OAIBoardsApi.md#boardsectionsupdate) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
[**boardsCreate**](OAIBoardsApi.md#boardscreate) | **POST** /boards | Create board
[**boardsDelete**](OAIBoardsApi.md#boardsdelete) | **DELETE** /boards/{board_id} | Delete board
[**boardsGet**](OAIBoardsApi.md#boardsget) | **GET** /boards/{board_id} | Get board
[**boardsList**](OAIBoardsApi.md#boardslist) | **GET** /boards | List boards
[**boardsListPins**](OAIBoardsApi.md#boardslistpins) | **GET** /boards/{board_id}/pins | List Pins on board
[**boardsUpdate**](OAIBoardsApi.md#boardsupdate) | **PATCH** /boards/{board_id} | Update board


# **boardSectionsCreate**
```objc
-(NSURLSessionTask*) boardSectionsCreateWithBoardId: (NSString*) boardId
    boardSection: (OAIBoardSection*) boardSection
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIBoardSection* output, NSError* error)) handler;
```

Create board section

Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* boardId = @"boardId_example"; // Unique identifier of a board.
OAIBoardSection* boardSection = [[OAIBoardSection alloc] init]; // Create a board section.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIBoardsApi*apiInstance = [[OAIBoardsApi alloc] init];

// Create board section
[apiInstance boardSectionsCreateWithBoardId:boardId
              boardSection:boardSection
              adAccountId:adAccountId
          completionHandler: ^(OAIBoardSection* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBoardsApi->boardSectionsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **NSString***| Unique identifier of a board. | 
 **boardSection** | [**OAIBoardSection***](OAIBoardSection.md)| Create a board section. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAIBoardSection***](OAIBoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardSectionsDelete**
```objc
-(NSURLSessionTask*) boardSectionsDeleteWithBoardId: (NSString*) boardId
    sectionId: (NSString*) sectionId
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(NSError* error)) handler;
```

Delete board section

Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* boardId = @"boardId_example"; // Unique identifier of a board.
NSString* sectionId = @"sectionId_example"; // Unique identifier of a board section.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIBoardsApi*apiInstance = [[OAIBoardsApi alloc] init];

// Delete board section
[apiInstance boardSectionsDeleteWithBoardId:boardId
              sectionId:sectionId
              adAccountId:adAccountId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIBoardsApi->boardSectionsDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **NSString***| Unique identifier of a board. | 
 **sectionId** | **NSString***| Unique identifier of a board section. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardSectionsList**
```objc
-(NSURLSessionTask*) boardSectionsListWithBoardId: (NSString*) boardId
    adAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIBoardSectionsList200Response* output, NSError* error)) handler;
```

List board sections

Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* boardId = @"boardId_example"; // Unique identifier of a board.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)

OAIBoardsApi*apiInstance = [[OAIBoardsApi alloc] init];

// List board sections
[apiInstance boardSectionsListWithBoardId:boardId
              adAccountId:adAccountId
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIBoardSectionsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBoardsApi->boardSectionsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **NSString***| Unique identifier of a board. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]

### Return type

[**OAIBoardSectionsList200Response***](OAIBoardSectionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardSectionsListPins**
```objc
-(NSURLSessionTask*) boardSectionsListPinsWithBoardId: (NSString*) boardId
    sectionId: (NSString*) sectionId
    adAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIBoardsListPins200Response* output, NSError* error)) handler;
```

List Pins on board section

Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* boardId = @"boardId_example"; // Unique identifier of a board.
NSString* sectionId = @"sectionId_example"; // Unique identifier of a board section.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)

OAIBoardsApi*apiInstance = [[OAIBoardsApi alloc] init];

// List Pins on board section
[apiInstance boardSectionsListPinsWithBoardId:boardId
              sectionId:sectionId
              adAccountId:adAccountId
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAIBoardsListPins200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBoardsApi->boardSectionsListPins: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **NSString***| Unique identifier of a board. | 
 **sectionId** | **NSString***| Unique identifier of a board section. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]

### Return type

[**OAIBoardsListPins200Response***](OAIBoardsListPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardSectionsUpdate**
```objc
-(NSURLSessionTask*) boardSectionsUpdateWithBoardId: (NSString*) boardId
    sectionId: (NSString*) sectionId
    boardSection: (OAIBoardSection*) boardSection
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIBoardSection* output, NSError* error)) handler;
```

Update board section

Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* boardId = @"boardId_example"; // Unique identifier of a board.
NSString* sectionId = @"sectionId_example"; // Unique identifier of a board section.
OAIBoardSection* boardSection = [[OAIBoardSection alloc] init]; // Update a board section.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIBoardsApi*apiInstance = [[OAIBoardsApi alloc] init];

// Update board section
[apiInstance boardSectionsUpdateWithBoardId:boardId
              sectionId:sectionId
              boardSection:boardSection
              adAccountId:adAccountId
          completionHandler: ^(OAIBoardSection* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBoardsApi->boardSectionsUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **NSString***| Unique identifier of a board. | 
 **sectionId** | **NSString***| Unique identifier of a board section. | 
 **boardSection** | [**OAIBoardSection***](OAIBoardSection.md)| Update a board section. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAIBoardSection***](OAIBoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardsCreate**
```objc
-(NSURLSessionTask*) boardsCreateWithBoard: (OAIBoard*) board
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIBoard* output, NSError* error)) handler;
```

Create board

Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIBoard* board = [[OAIBoard alloc] init]; // Create a board using a single board json object.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIBoardsApi*apiInstance = [[OAIBoardsApi alloc] init];

// Create board
[apiInstance boardsCreateWithBoard:board
              adAccountId:adAccountId
          completionHandler: ^(OAIBoard* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBoardsApi->boardsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board** | [**OAIBoard***](OAIBoard.md)| Create a board using a single board json object. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAIBoard***](OAIBoard.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardsDelete**
```objc
-(NSURLSessionTask*) boardsDeleteWithBoardId: (NSString*) boardId
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(NSError* error)) handler;
```

Delete board

Delete a board owned by the \"operation user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* boardId = @"boardId_example"; // Unique identifier of a board.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIBoardsApi*apiInstance = [[OAIBoardsApi alloc] init];

// Delete board
[apiInstance boardsDeleteWithBoardId:boardId
              adAccountId:adAccountId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIBoardsApi->boardsDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **NSString***| Unique identifier of a board. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardsGet**
```objc
-(NSURLSessionTask*) boardsGetWithBoardId: (NSString*) boardId
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIBoard* output, NSError* error)) handler;
```

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* boardId = @"boardId_example"; // Unique identifier of a board.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIBoardsApi*apiInstance = [[OAIBoardsApi alloc] init];

// Get board
[apiInstance boardsGetWithBoardId:boardId
              adAccountId:adAccountId
          completionHandler: ^(OAIBoard* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBoardsApi->boardsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **NSString***| Unique identifier of a board. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAIBoard***](OAIBoard.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardsList**
```objc
-(NSURLSessionTask*) boardsListWithAdAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    privacy: (NSString*) privacy
        completionHandler: (void (^)(OAIBoardsList200Response* output, NSError* error)) handler;
```

List boards

Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* privacy = @"privacy_example"; // Privacy setting for a board. (optional)

OAIBoardsApi*apiInstance = [[OAIBoardsApi alloc] init];

// List boards
[apiInstance boardsListWithAdAccountId:adAccountId
              bookmark:bookmark
              pageSize:pageSize
              privacy:privacy
          completionHandler: ^(OAIBoardsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBoardsApi->boardsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **privacy** | **NSString***| Privacy setting for a board. | [optional] 

### Return type

[**OAIBoardsList200Response***](OAIBoardsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardsListPins**
```objc
-(NSURLSessionTask*) boardsListPinsWithBoardId: (NSString*) boardId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    creativeTypes: (NSArray<NSString*>*) creativeTypes
    adAccountId: (NSString*) adAccountId
    pinMetrics: (NSNumber*) pinMetrics
        completionHandler: (void (^)(OAIBoardsListPins200Response* output, NSError* error)) handler;
```

List Pins on board

Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* boardId = @"boardId_example"; // Unique identifier of a board.
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSArray<NSString*>* creativeTypes = @[@"creativeTypes_example"]; // Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional)
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)
NSNumber* pinMetrics = @(NO); // Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to @(NO))

OAIBoardsApi*apiInstance = [[OAIBoardsApi alloc] init];

// List Pins on board
[apiInstance boardsListPinsWithBoardId:boardId
              bookmark:bookmark
              pageSize:pageSize
              creativeTypes:creativeTypes
              adAccountId:adAccountId
              pinMetrics:pinMetrics
          completionHandler: ^(OAIBoardsListPins200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBoardsApi->boardsListPins: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **NSString***| Unique identifier of a board. | 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **creativeTypes** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 
 **pinMetrics** | **NSNumber***| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to @(NO)]

### Return type

[**OAIBoardsListPins200Response***](OAIBoardsListPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardsUpdate**
```objc
-(NSURLSessionTask*) boardsUpdateWithBoardId: (NSString*) boardId
    boardUpdate: (OAIBoardUpdate*) boardUpdate
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIBoard* output, NSError* error)) handler;
```

Update board

Update a board owned by the \"operating user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* boardId = @"boardId_example"; // Unique identifier of a board.
OAIBoardUpdate* boardUpdate = [[OAIBoardUpdate alloc] init]; // Update a board.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIBoardsApi*apiInstance = [[OAIBoardsApi alloc] init];

// Update board
[apiInstance boardsUpdateWithBoardId:boardId
              boardUpdate:boardUpdate
              adAccountId:adAccountId
          completionHandler: ^(OAIBoard* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBoardsApi->boardsUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **NSString***| Unique identifier of a board. | 
 **boardUpdate** | [**OAIBoardUpdate***](OAIBoardUpdate.md)| Update a board. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAIBoard***](OAIBoard.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

