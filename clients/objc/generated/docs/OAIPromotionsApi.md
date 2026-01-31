# OAIPromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**promotionsCreate**](OAIPromotionsApi.md#promotionscreate) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions
[**promotionsDelete**](OAIPromotionsApi.md#promotionsdelete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
[**promotionsGet**](OAIPromotionsApi.md#promotionsget) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
[**promotionsList**](OAIPromotionsApi.md#promotionslist) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions
[**promotionsUpdate**](OAIPromotionsApi.md#promotionsupdate) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions


# **promotionsCreate**
```objc
-(NSURLSessionTask*) promotionsCreateWithAdAccountId: (NSString*) adAccountId
    promotionCreateRequest: (NSArray<OAIPromotionCreateRequest>*) promotionCreateRequest
        completionHandler: (void (^)(OAIPromotionsResponse* output, NSError* error)) handler;
```

Create promotions

Create multiple new promotions.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSArray<OAIPromotionCreateRequest>* promotionCreateRequest = @[[[OAIPromotionCreateRequest alloc] init]]; // List of promotions to create, size limit [1, 30].

OAIPromotionsApi*apiInstance = [[OAIPromotionsApi alloc] init];

// Create promotions
[apiInstance promotionsCreateWithAdAccountId:adAccountId
              promotionCreateRequest:promotionCreateRequest
          completionHandler: ^(OAIPromotionsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPromotionsApi->promotionsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **promotionCreateRequest** | [**NSArray&lt;OAIPromotionCreateRequest&gt;***](OAIPromotionCreateRequest.md)| List of promotions to create, size limit [1, 30]. | 

### Return type

[**OAIPromotionsResponse***](OAIPromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotionsDelete**
```objc
-(NSURLSessionTask*) promotionsDeleteWithAdAccountId: (NSString*) adAccountId
    promotionId: (NSString*) promotionId
        completionHandler: (void (^)(NSError* error)) handler;
```

Delete promotion by id

Delete a promotion within Pinterest.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* promotionId = @"promotionId_example"; // Unique identifier of a promotion

OAIPromotionsApi*apiInstance = [[OAIPromotionsApi alloc] init];

// Delete promotion by id
[apiInstance promotionsDeleteWithAdAccountId:adAccountId
              promotionId:promotionId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIPromotionsApi->promotionsDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **promotionId** | **NSString***| Unique identifier of a promotion | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotionsGet**
```objc
-(NSURLSessionTask*) promotionsGetWithAdAccountId: (NSString*) adAccountId
    promotionId: (NSString*) promotionId
        completionHandler: (void (^)(OAIPromotionResponse* output, NSError* error)) handler;
```

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* promotionId = @"promotionId_example"; // Unique identifier of a promotion

OAIPromotionsApi*apiInstance = [[OAIPromotionsApi alloc] init];

// Get promotion by id
[apiInstance promotionsGetWithAdAccountId:adAccountId
              promotionId:promotionId
          completionHandler: ^(OAIPromotionResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPromotionsApi->promotionsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **promotionId** | **NSString***| Unique identifier of a promotion | 

### Return type

[**OAIPromotionResponse***](OAIPromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotionsList**
```objc
-(NSURLSessionTask*) promotionsListWithAdAccountId: (NSString*) adAccountId
    pageSize: (NSNumber*) pageSize
    order: (NSString*) order
    bookmark: (NSString*) bookmark
        completionHandler: (void (^)(OAIPromotionsList200Response* output, NSError* error)) handler;
```

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* order = ASCENDING; // The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)

OAIPromotionsApi*apiInstance = [[OAIPromotionsApi alloc] init];

// Get promotions
[apiInstance promotionsListWithAdAccountId:adAccountId
              pageSize:pageSize
              order:order
              bookmark:bookmark
          completionHandler: ^(OAIPromotionsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPromotionsApi->promotionsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **order** | **NSString***| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 

### Return type

[**OAIPromotionsList200Response***](OAIPromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotionsUpdate**
```objc
-(NSURLSessionTask*) promotionsUpdateWithAdAccountId: (NSString*) adAccountId
    promotionUpdateRequest: (NSArray<OAIPromotionUpdateRequest>*) promotionUpdateRequest
        completionHandler: (void (^)(OAIPromotionsResponse* output, NSError* error)) handler;
```

Update promotions

Update multiple promotions.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSArray<OAIPromotionUpdateRequest>* promotionUpdateRequest = @[[[OAIPromotionUpdateRequest alloc] init]]; // List of promotions to create, size limit [1, 30].

OAIPromotionsApi*apiInstance = [[OAIPromotionsApi alloc] init];

// Update promotions
[apiInstance promotionsUpdateWithAdAccountId:adAccountId
              promotionUpdateRequest:promotionUpdateRequest
          completionHandler: ^(OAIPromotionsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPromotionsApi->promotionsUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **promotionUpdateRequest** | [**NSArray&lt;OAIPromotionUpdateRequest&gt;***](OAIPromotionUpdateRequest.md)| List of promotions to create, size limit [1, 30]. | 

### Return type

[**OAIPromotionsResponse***](OAIPromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

