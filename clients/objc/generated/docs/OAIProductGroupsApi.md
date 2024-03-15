# OAIProductGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsCatalogsProductGroupsList**](OAIProductGroupsApi.md#adaccountscatalogsproductgroupslist) | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups


# **adAccountsCatalogsProductGroupsList**
```objc
-(NSURLSessionTask*) adAccountsCatalogsProductGroupsListWithAdAccountId: (NSString*) adAccountId
    feedProfileId: (NSString*) feedProfileId
        completionHandler: (void (^)(OAIAdAccountsCatalogsProductGroupsList200Response* output, NSError* error)) handler;
```

Get catalog product groups

This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* feedProfileId = @"feedProfileId_example"; // The feed profile id whose catalog product groups we want to return. (optional)

OAIProductGroupsApi*apiInstance = [[OAIProductGroupsApi alloc] init];

// Get catalog product groups
[apiInstance adAccountsCatalogsProductGroupsListWithAdAccountId:adAccountId
              feedProfileId:feedProfileId
          completionHandler: ^(OAIAdAccountsCatalogsProductGroupsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProductGroupsApi->adAccountsCatalogsProductGroupsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **feedProfileId** | **NSString***| The feed profile id whose catalog product groups we want to return. | [optional] 

### Return type

[**OAIAdAccountsCatalogsProductGroupsList200Response***](OAIAdAccountsCatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

