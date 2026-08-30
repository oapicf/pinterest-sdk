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
    promotionCreate: (NSArray<OAIPromotionCreate>*) promotionCreate
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
NSArray<OAIPromotionCreate>* promotionCreate = @[[[OAIPromotionCreate alloc] init]]; // 

OAIPromotionsApi*apiInstance = [[OAIPromotionsApi alloc] init];

// Create promotions
[apiInstance promotionsCreateWithAdAccountId:adAccountId
              promotionCreate:promotionCreate
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
 **promotionCreate** | [**NSArray&lt;OAIPromotionCreate&gt;***](OAIPromotionCreate.md)|  | 

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
-(NSURLSessionTask*) promotionsDeleteWithPromotionId: (NSString*) promotionId
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIPromotion* output, NSError* error)) handler;
```

Delete promotion by id

Delete a promotion within Pinterest.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* promotionId = @"promotionId_example"; // Promotion ID
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.

OAIPromotionsApi*apiInstance = [[OAIPromotionsApi alloc] init];

// Delete promotion by id
[apiInstance promotionsDeleteWithPromotionId:promotionId
              adAccountId:adAccountId
          completionHandler: ^(OAIPromotion* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPromotionsApi->promotionsDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionId** | **NSString***| Promotion ID | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 

### Return type

[**OAIPromotion***](OAIPromotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotionsGet**
```objc
-(NSURLSessionTask*) promotionsGetWithPromotionId: (NSString*) promotionId
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIPromotion* output, NSError* error)) handler;
```

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* promotionId = @"promotionId_example"; // Promotion ID
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.

OAIPromotionsApi*apiInstance = [[OAIPromotionsApi alloc] init];

// Get promotion by id
[apiInstance promotionsGetWithPromotionId:promotionId
              adAccountId:adAccountId
          completionHandler: ^(OAIPromotion* output, NSError* error) {
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
 **promotionId** | **NSString***| Promotion ID | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 

### Return type

[**OAIPromotion***](OAIPromotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotionsList**
```objc
-(NSURLSessionTask*) promotionsListWithAdAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    order: (OAIPinterestLibPaginationOrder) order
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
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)
OAIPinterestLibPaginationOrder order = [[OAIPinterestLibPaginationOrder alloc] init]; // The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)

OAIPromotionsApi*apiInstance = [[OAIPromotionsApi alloc] init];

// Get promotions
[apiInstance promotionsListWithAdAccountId:adAccountId
              bookmark:bookmark
              pageSize:pageSize
              order:order
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
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]
 **order** | [**OAIPinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

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
    promotionBatchUpdate: (NSArray<OAIPromotionBatchUpdate>*) promotionBatchUpdate
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
NSArray<OAIPromotionBatchUpdate>* promotionBatchUpdate = @[[[OAIPromotionBatchUpdate alloc] init]]; // 

OAIPromotionsApi*apiInstance = [[OAIPromotionsApi alloc] init];

// Update promotions
[apiInstance promotionsUpdateWithAdAccountId:adAccountId
              promotionBatchUpdate:promotionBatchUpdate
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
 **promotionBatchUpdate** | [**NSArray&lt;OAIPromotionBatchUpdate&gt;***](OAIPromotionBatchUpdate.md)|  | 

### Return type

[**OAIPromotionsResponse***](OAIPromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

