# OAICustomerSegmentApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerSegmentCreate**](OAICustomerSegmentApi.md#customersegmentcreate) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
[**customerSegmentList**](OAICustomerSegmentApi.md#customersegmentlist) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
[**customerSegmentUpdate**](OAICustomerSegmentApi.md#customersegmentupdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments


# **customerSegmentCreate**
```objc
-(NSURLSessionTask*) customerSegmentCreateWithAdAccountId: (NSString*) adAccountId
    customerSegmentCreate: (OAICustomerSegmentCreate*) customerSegmentCreate
        completionHandler: (void (^)(OAICustomerSegment* output, NSError* error)) handler;
```

Create customer segments

Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAICustomerSegmentCreate* customerSegmentCreate = [[OAICustomerSegmentCreate alloc] init]; // 

OAICustomerSegmentApi*apiInstance = [[OAICustomerSegmentApi alloc] init];

// Create customer segments
[apiInstance customerSegmentCreateWithAdAccountId:adAccountId
              customerSegmentCreate:customerSegmentCreate
          completionHandler: ^(OAICustomerSegment* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICustomerSegmentApi->customerSegmentCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **customerSegmentCreate** | [**OAICustomerSegmentCreate***](OAICustomerSegmentCreate.md)|  | 

### Return type

[**OAICustomerSegment***](OAICustomerSegment.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customerSegmentList**
```objc
-(NSURLSessionTask*) customerSegmentListWithAdAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    order: (OAIPinterestLibPaginationOrder) order
    includeSizing: (NSNumber*) includeSizing
    searchQuery: (NSString*) searchQuery
        completionHandler: (void (^)(OAICustomerSegmentList200Response* output, NSError* error)) handler;
```

List customer segments

Get a list of the customer segments in the specified `ad_account_id`.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)
OAIPinterestLibPaginationOrder order = [[OAIPinterestLibPaginationOrder alloc] init]; // The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
NSNumber* includeSizing = @(NO); // Include audience sizing in result or not (optional) (default to @(NO))
NSString* searchQuery = @"searchQuery_example"; // Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)

OAICustomerSegmentApi*apiInstance = [[OAICustomerSegmentApi alloc] init];

// List customer segments
[apiInstance customerSegmentListWithAdAccountId:adAccountId
              bookmark:bookmark
              pageSize:pageSize
              order:order
              includeSizing:includeSizing
              searchQuery:searchQuery
          completionHandler: ^(OAICustomerSegmentList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICustomerSegmentApi->customerSegmentList: %@", error);
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
 **includeSizing** | **NSNumber***| Include audience sizing in result or not | [optional] [default to @(NO)]
 **searchQuery** | **NSString***| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] 

### Return type

[**OAICustomerSegmentList200Response***](OAICustomerSegmentList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customerSegmentUpdate**
```objc
-(NSURLSessionTask*) customerSegmentUpdateWithAdAccountId: (NSString*) adAccountId
    customerSegmentUpdateRequestUpdateWithRequiredBody: (OAICustomerSegmentUpdateRequestUpdateWithRequiredBody*) customerSegmentUpdateRequestUpdateWithRequiredBody
        completionHandler: (void (^)(NSError* error)) handler;
```

Update customer segments

Update the customer segment given advertiser ID and customer segment ID

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAICustomerSegmentUpdateRequestUpdateWithRequiredBody* customerSegmentUpdateRequestUpdateWithRequiredBody = [[OAICustomerSegmentUpdateRequestUpdateWithRequiredBody alloc] init]; // 

OAICustomerSegmentApi*apiInstance = [[OAICustomerSegmentApi alloc] init];

// Update customer segments
[apiInstance customerSegmentUpdateWithAdAccountId:adAccountId
              customerSegmentUpdateRequestUpdateWithRequiredBody:customerSegmentUpdateRequestUpdateWithRequiredBody
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAICustomerSegmentApi->customerSegmentUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **customerSegmentUpdateRequestUpdateWithRequiredBody** | [**OAICustomerSegmentUpdateRequestUpdateWithRequiredBody***](OAICustomerSegmentUpdateRequestUpdateWithRequiredBody.md)|  | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

