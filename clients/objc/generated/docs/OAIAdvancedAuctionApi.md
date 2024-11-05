# OAIAdvancedAuctionApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advancedAuctionItemsGetPost**](OAIAdvancedAuctionApi.md#advancedauctionitemsgetpost) | **POST** /advanced_auction/items/get | Get item bid options (POST)
[**advancedAuctionItemsSubmitPost**](OAIAdvancedAuctionApi.md#advancedauctionitemssubmitpost) | **POST** /advanced_auction/items/submit | Operate on item level bid options


# **advancedAuctionItemsGetPost**
```objc
-(NSURLSessionTask*) advancedAuctionItemsGetPostWithAdvancedAuctionItemsGetRequest: (OAIAdvancedAuctionItemsGetRequest*) advancedAuctionItemsGetRequest
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIAdvancedAuctionItems* output, NSError* error)) handler;
```

Get item bid options (POST)

Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIAdvancedAuctionItemsGetRequest* advancedAuctionItemsGetRequest = [[OAIAdvancedAuctionItemsGetRequest alloc] init]; // Request object used to get bid options values for a batch of retail catalog items
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIAdvancedAuctionApi*apiInstance = [[OAIAdvancedAuctionApi alloc] init];

// Get item bid options (POST)
[apiInstance advancedAuctionItemsGetPostWithAdvancedAuctionItemsGetRequest:advancedAuctionItemsGetRequest
              adAccountId:adAccountId
          completionHandler: ^(OAIAdvancedAuctionItems* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdvancedAuctionApi->advancedAuctionItemsGetPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advancedAuctionItemsGetRequest** | [**OAIAdvancedAuctionItemsGetRequest***](OAIAdvancedAuctionItemsGetRequest.md)| Request object used to get bid options values for a batch of retail catalog items | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAIAdvancedAuctionItems***](OAIAdvancedAuctionItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **advancedAuctionItemsSubmitPost**
```objc
-(NSURLSessionTask*) advancedAuctionItemsSubmitPostWithAdvancedAuctionItemsSubmitRequest: (OAIAdvancedAuctionItemsSubmitRequest*) advancedAuctionItemsSubmitRequest
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIAdvancedAuctionProcessedItems* output, NSError* error)) handler;
```

Operate on item level bid options

This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIAdvancedAuctionItemsSubmitRequest* advancedAuctionItemsSubmitRequest = [[OAIAdvancedAuctionItemsSubmitRequest alloc] init]; // Request object used to upsert or delete bid options for a batch of retail catalog items
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAIAdvancedAuctionApi*apiInstance = [[OAIAdvancedAuctionApi alloc] init];

// Operate on item level bid options
[apiInstance advancedAuctionItemsSubmitPostWithAdvancedAuctionItemsSubmitRequest:advancedAuctionItemsSubmitRequest
              adAccountId:adAccountId
          completionHandler: ^(OAIAdvancedAuctionProcessedItems* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdvancedAuctionApi->advancedAuctionItemsSubmitPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advancedAuctionItemsSubmitRequest** | [**OAIAdvancedAuctionItemsSubmitRequest***](OAIAdvancedAuctionItemsSubmitRequest.md)| Request object used to upsert or delete bid options for a batch of retail catalog items | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAIAdvancedAuctionProcessedItems***](OAIAdvancedAuctionProcessedItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

