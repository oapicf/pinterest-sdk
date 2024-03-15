# OAICustomerListsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerListsCreate**](OAICustomerListsApi.md#customerlistscreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
[**customerListsGet**](OAICustomerListsApi.md#customerlistsget) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
[**customerListsList**](OAICustomerListsApi.md#customerlistslist) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
[**customerListsUpdate**](OAICustomerListsApi.md#customerlistsupdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list


# **customerListsCreate**
```objc
-(NSURLSessionTask*) customerListsCreateWithAdAccountId: (NSString*) adAccountId
    customerListRequest: (OAICustomerListRequest*) customerListRequest
        completionHandler: (void (^)(OAICustomerList* output, NSError* error)) handler;
```

Create customer lists

<p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/> <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>Note that once you have created your customer list, you must convert it into an audience (of the “CUSTOMER_LIST” type) using the <a href=\"#operation/create_audience_handler\">create audience endpoint</a> before it can be used.</p>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAICustomerListRequest* customerListRequest = [[OAICustomerListRequest alloc] init]; // Parameters to get Customer lists info

OAICustomerListsApi*apiInstance = [[OAICustomerListsApi alloc] init];

// Create customer lists
[apiInstance customerListsCreateWithAdAccountId:adAccountId
              customerListRequest:customerListRequest
          completionHandler: ^(OAICustomerList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICustomerListsApi->customerListsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **customerListRequest** | [**OAICustomerListRequest***](OAICustomerListRequest.md)| Parameters to get Customer lists info | 

### Return type

[**OAICustomerList***](OAICustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customerListsGet**
```objc
-(NSURLSessionTask*) customerListsGetWithAdAccountId: (NSString*) adAccountId
    customerListId: (NSString*) customerListId
        completionHandler: (void (^)(OAICustomerList* output, NSError* error)) handler;
```

Get customer list

Gets a specific customer list given the customer list ID.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* customerListId = @"customerListId_example"; // Unique identifier of a customer list

OAICustomerListsApi*apiInstance = [[OAICustomerListsApi alloc] init];

// Get customer list
[apiInstance customerListsGetWithAdAccountId:adAccountId
              customerListId:customerListId
          completionHandler: ^(OAICustomerList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICustomerListsApi->customerListsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **customerListId** | **NSString***| Unique identifier of a customer list | 

### Return type

[**OAICustomerList***](OAICustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customerListsList**
```objc
-(NSURLSessionTask*) customerListsListWithAdAccountId: (NSString*) adAccountId
    pageSize: (NSNumber*) pageSize
    order: (NSString*) order
    bookmark: (NSString*) bookmark
        completionHandler: (void (^)(OAICustomerListsList200Response* output, NSError* error)) handler;
```

Get customer lists

<p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* order = ASCENDING; // The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)

OAICustomerListsApi*apiInstance = [[OAICustomerListsApi alloc] init];

// Get customer lists
[apiInstance customerListsListWithAdAccountId:adAccountId
              pageSize:pageSize
              order:order
              bookmark:bookmark
          completionHandler: ^(OAICustomerListsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICustomerListsApi->customerListsList: %@", error);
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

[**OAICustomerListsList200Response***](OAICustomerListsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customerListsUpdate**
```objc
-(NSURLSessionTask*) customerListsUpdateWithAdAccountId: (NSString*) adAccountId
    customerListId: (NSString*) customerListId
    customerListUpdateRequest: (OAICustomerListUpdateRequest*) customerListUpdateRequest
        completionHandler: (void (^)(OAICustomerList* output, NSError* error)) handler;
```

Update customer list

<p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* customerListId = @"customerListId_example"; // Unique identifier of a customer list
OAICustomerListUpdateRequest* customerListUpdateRequest = [[OAICustomerListUpdateRequest alloc] init]; // 

OAICustomerListsApi*apiInstance = [[OAICustomerListsApi alloc] init];

// Update customer list
[apiInstance customerListsUpdateWithAdAccountId:adAccountId
              customerListId:customerListId
              customerListUpdateRequest:customerListUpdateRequest
          completionHandler: ^(OAICustomerList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICustomerListsApi->customerListsUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **customerListId** | **NSString***| Unique identifier of a customer list | 
 **customerListUpdateRequest** | [**OAICustomerListUpdateRequest***](OAICustomerListUpdateRequest.md)|  | 

### Return type

[**OAICustomerList***](OAICustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

