# OAIOrderLinesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderLinesGet**](OAIOrderLinesApi.md#orderlinesget) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
[**orderLinesList**](OAIOrderLinesApi.md#orderlineslist) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines


# **orderLinesGet**
```objc
-(NSURLSessionTask*) orderLinesGetWithAdAccountId: (NSString*) adAccountId
    orderLineId: (NSString*) orderLineId
        completionHandler: (void (^)(OAIOrderLine* output, NSError* error)) handler;
```

Get order line

Get a specific existing order line associated with an ad account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* orderLineId = @"orderLineId_example"; // Unique identifier of an order line.

OAIOrderLinesApi*apiInstance = [[OAIOrderLinesApi alloc] init];

// Get order line
[apiInstance orderLinesGetWithAdAccountId:adAccountId
              orderLineId:orderLineId
          completionHandler: ^(OAIOrderLine* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOrderLinesApi->orderLinesGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **orderLineId** | **NSString***| Unique identifier of an order line. | 

### Return type

[**OAIOrderLine***](OAIOrderLine.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orderLinesList**
```objc
-(NSURLSessionTask*) orderLinesListWithAdAccountId: (NSString*) adAccountId
    pageSize: (NSNumber*) pageSize
    order: (NSString*) order
    bookmark: (NSString*) bookmark
        completionHandler: (void (^)(OAIOrderLinesList200Response* output, NSError* error)) handler;
```

Get order lines

List existing order lines associated with an ad account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* order = ASCENDING; // The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)

OAIOrderLinesApi*apiInstance = [[OAIOrderLinesApi alloc] init];

// Get order lines
[apiInstance orderLinesListWithAdAccountId:adAccountId
              pageSize:pageSize
              order:order
              bookmark:bookmark
          completionHandler: ^(OAIOrderLinesList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOrderLinesApi->orderLinesList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **order** | **NSString***| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 

### Return type

[**OAIOrderLinesList200Response***](OAIOrderLinesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

