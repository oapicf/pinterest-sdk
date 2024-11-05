# OAIAudienceSharingApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsAudiencesSharedAccountsList**](OAIAudienceSharingApi.md#adaccountsaudiencessharedaccountslist) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account
[**businessAccountAudiencesSharedAccountsList**](OAIAudienceSharingApi.md#businessaccountaudiencessharedaccountslist) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business
[**sharedAudiencesForBusinessList**](OAIAudienceSharingApi.md#sharedaudiencesforbusinesslist) | **GET** /businesses/{business_id}/audiences | List received audiences for a business
[**updateAdAccountToAdAccountSharedAudience**](OAIAudienceSharingApi.md#updateadaccounttoadaccountsharedaudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts
[**updateAdAccountToBusinessSharedAudience**](OAIAudienceSharingApi.md#updateadaccounttobusinesssharedaudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses
[**updateBusinessToAdAccountSharedAudience**](OAIAudienceSharingApi.md#updatebusinesstoadaccountsharedaudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts
[**updateBusinessToBusinessSharedAudience**](OAIAudienceSharingApi.md#updatebusinesstobusinesssharedaudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses


# **adAccountsAudiencesSharedAccountsList**
```objc
-(NSURLSessionTask*) adAccountsAudiencesSharedAccountsListWithAdAccountId: (NSString*) adAccountId
    audienceId: (NSString*) audienceId
    accountType: (OAIAudienceAccountType) accountType
    pageSize: (NSNumber*) pageSize
    bookmark: (NSString*) bookmark
        completionHandler: (void (^)(OAIAdAccountsAudiencesSharedAccountsList200Response* output, NSError* error)) handler;
```

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* audienceId = @"audienceId_example"; // Unique identifier of the audience to use to filter the results.
OAIAudienceAccountType accountType = [[OAIAudienceAccountType alloc] init]; // Filter accounts by account type.
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)

OAIAudienceSharingApi*apiInstance = [[OAIAudienceSharingApi alloc] init];

// List accounts with access to an audience owned by an ad account
[apiInstance adAccountsAudiencesSharedAccountsListWithAdAccountId:adAccountId
              audienceId:audienceId
              accountType:accountType
              pageSize:pageSize
              bookmark:bookmark
          completionHandler: ^(OAIAdAccountsAudiencesSharedAccountsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAudienceSharingApi->adAccountsAudiencesSharedAccountsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **audienceId** | **NSString***| Unique identifier of the audience to use to filter the results. | 
 **accountType** | [**OAIAudienceAccountType**](.md)| Filter accounts by account type. | 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 

### Return type

[**OAIAdAccountsAudiencesSharedAccountsList200Response***](OAIAdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessAccountAudiencesSharedAccountsList**
```objc
-(NSURLSessionTask*) businessAccountAudiencesSharedAccountsListWithBusinessId: (NSString*) businessId
    audienceId: (NSString*) audienceId
    accountType: (OAIAudienceAccountType) accountType
    pageSize: (NSNumber*) pageSize
    bookmark: (NSString*) bookmark
        completionHandler: (void (^)(OAIAdAccountsAudiencesSharedAccountsList200Response* output, NSError* error)) handler;
```

List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Unique identifier of the requesting business.
NSString* audienceId = @"audienceId_example"; // Unique identifier of the audience to use to filter the results.
OAIAudienceAccountType accountType = [[OAIAudienceAccountType alloc] init]; // Filter accounts by account type.
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)

OAIAudienceSharingApi*apiInstance = [[OAIAudienceSharingApi alloc] init];

// List accounts with access to an audience owned by a business
[apiInstance businessAccountAudiencesSharedAccountsListWithBusinessId:businessId
              audienceId:audienceId
              accountType:accountType
              pageSize:pageSize
              bookmark:bookmark
          completionHandler: ^(OAIAdAccountsAudiencesSharedAccountsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAudienceSharingApi->businessAccountAudiencesSharedAccountsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Unique identifier of the requesting business. | 
 **audienceId** | **NSString***| Unique identifier of the audience to use to filter the results. | 
 **accountType** | [**OAIAudienceAccountType**](.md)| Filter accounts by account type. | 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 

### Return type

[**OAIAdAccountsAudiencesSharedAccountsList200Response***](OAIAdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sharedAudiencesForBusinessList**
```objc
-(NSURLSessionTask*) sharedAudiencesForBusinessListWithBusinessId: (NSString*) businessId
    bookmark: (NSString*) bookmark
    order: (NSString*) order
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAIAudiencesList200Response* output, NSError* error)) handler;
```

List received audiences for a business

Get a list of received audiences for the given business.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Unique identifier of the requesting business.
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSString* order = ASCENDING; // The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)

OAIAudienceSharingApi*apiInstance = [[OAIAudienceSharingApi alloc] init];

// List received audiences for a business
[apiInstance sharedAudiencesForBusinessListWithBusinessId:businessId
              bookmark:bookmark
              order:order
              pageSize:pageSize
          completionHandler: ^(OAIAudiencesList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAudienceSharingApi->sharedAudiencesForBusinessList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Unique identifier of the requesting business. | 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **order** | **NSString***| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]

### Return type

[**OAIAudiencesList200Response***](OAIAudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateAdAccountToAdAccountSharedAudience**
```objc
-(NSURLSessionTask*) updateAdAccountToAdAccountSharedAudienceWithAdAccountId: (NSString*) adAccountId
    sharedAudience: (OAISharedAudience*) sharedAudience
        completionHandler: (void (^)(OAISharedAudienceResponse* output, NSError* error)) handler;
```

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href='https://help.pinterest.com/en/business/article/create-and-manage-accounts'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAISharedAudience* sharedAudience = [[OAISharedAudience alloc] init]; // 

OAIAudienceSharingApi*apiInstance = [[OAIAudienceSharingApi alloc] init];

// Update audience sharing between ad accounts
[apiInstance updateAdAccountToAdAccountSharedAudienceWithAdAccountId:adAccountId
              sharedAudience:sharedAudience
          completionHandler: ^(OAISharedAudienceResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAudienceSharingApi->updateAdAccountToAdAccountSharedAudience: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **sharedAudience** | [**OAISharedAudience***](OAISharedAudience.md)|  | 

### Return type

[**OAISharedAudienceResponse***](OAISharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateAdAccountToBusinessSharedAudience**
```objc
-(NSURLSessionTask*) updateAdAccountToBusinessSharedAudienceWithAdAccountId: (NSString*) adAccountId
    businessSharedAudience: (OAIBusinessSharedAudience*) businessSharedAudience
        completionHandler: (void (^)(OAIBusinessSharedAudienceResponse* output, NSError* error)) handler;
```

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAIBusinessSharedAudience* businessSharedAudience = [[OAIBusinessSharedAudience alloc] init]; // 

OAIAudienceSharingApi*apiInstance = [[OAIAudienceSharingApi alloc] init];

// Update audience sharing from an ad account to businesses
[apiInstance updateAdAccountToBusinessSharedAudienceWithAdAccountId:adAccountId
              businessSharedAudience:businessSharedAudience
          completionHandler: ^(OAIBusinessSharedAudienceResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAudienceSharingApi->updateAdAccountToBusinessSharedAudience: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **businessSharedAudience** | [**OAIBusinessSharedAudience***](OAIBusinessSharedAudience.md)|  | 

### Return type

[**OAIBusinessSharedAudienceResponse***](OAIBusinessSharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateBusinessToAdAccountSharedAudience**
```objc
-(NSURLSessionTask*) updateBusinessToAdAccountSharedAudienceWithBusinessId: (NSString*) businessId
    sharedAudience: (OAISharedAudience*) sharedAudience
        completionHandler: (void (^)(OAISharedAudienceResponse* output, NSError* error)) handler;
```

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Unique identifier of the requesting business.
OAISharedAudience* sharedAudience = [[OAISharedAudience alloc] init]; // 

OAIAudienceSharingApi*apiInstance = [[OAIAudienceSharingApi alloc] init];

// Update audience sharing from a business to ad accounts
[apiInstance updateBusinessToAdAccountSharedAudienceWithBusinessId:businessId
              sharedAudience:sharedAudience
          completionHandler: ^(OAISharedAudienceResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAudienceSharingApi->updateBusinessToAdAccountSharedAudience: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Unique identifier of the requesting business. | 
 **sharedAudience** | [**OAISharedAudience***](OAISharedAudience.md)|  | 

### Return type

[**OAISharedAudienceResponse***](OAISharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateBusinessToBusinessSharedAudience**
```objc
-(NSURLSessionTask*) updateBusinessToBusinessSharedAudienceWithBusinessId: (NSString*) businessId
    businessSharedAudience: (OAIBusinessSharedAudience*) businessSharedAudience
        completionHandler: (void (^)(OAIBusinessSharedAudienceResponse* output, NSError* error)) handler;
```

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* businessId = 729090764583391194; // Unique identifier of the requesting business.
OAIBusinessSharedAudience* businessSharedAudience = [[OAIBusinessSharedAudience alloc] init]; // 

OAIAudienceSharingApi*apiInstance = [[OAIAudienceSharingApi alloc] init];

// Update audience sharing between businesses
[apiInstance updateBusinessToBusinessSharedAudienceWithBusinessId:businessId
              businessSharedAudience:businessSharedAudience
          completionHandler: ^(OAIBusinessSharedAudienceResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAudienceSharingApi->updateBusinessToBusinessSharedAudience: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSString***| Unique identifier of the requesting business. | 
 **businessSharedAudience** | [**OAIBusinessSharedAudience***](OAIBusinessSharedAudience.md)|  | 

### Return type

[**OAIBusinessSharedAudienceResponse***](OAIBusinessSharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

