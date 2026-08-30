# OAICatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsAvailableFilterValues**](OAICatalogsApi.md#catalogsavailablefiltervalues) | **GET** /catalogs/available_filter_values | List available filter values
[**catalogsCreate**](OAICatalogsApi.md#catalogscreate) | **POST** /catalogs | Create catalog
[**catalogsList**](OAICatalogsApi.md#catalogslist) | **GET** /catalogs | List catalogs


# **catalogsAvailableFilterValues**
```objc
-(NSURLSessionTask*) catalogsAvailableFilterValuesWithCatalogId: (NSString*) catalogId
    feedId: (NSString*) feedId
    country: (OAICountry) country
    language: (OAICatalogsLocale) language
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalogsAvailableFilterValues* output, NSError* error)) handler;
```

List available filter values

Get the available filter attributes and values associated with a given feed or catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - `country`, `language`, and `feed_id` are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* catalogId = @"catalogId_example"; // Filter entities for a given catalog_id.
NSString* feedId = @"feedId_example"; // Filter entities for a given feed_id. If not given, all feeds are considered. (optional)
OAICountry country = [[OAICountry alloc] init]; // Country for the Catalogs Items (optional)
OAICatalogsLocale language = [[OAICatalogsLocale alloc] init]; // Language for the Catalogs Items (optional)
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// List available filter values
[apiInstance catalogsAvailableFilterValuesWithCatalogId:catalogId
              feedId:feedId
              country:country
              language:language
              adAccountId:adAccountId
          completionHandler: ^(OAICatalogsAvailableFilterValues* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogsApi->catalogsAvailableFilterValues: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **NSString***| Filter entities for a given catalog_id. | 
 **feedId** | **NSString***| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] 
 **country** | [**OAICountry**](.md)| Country for the Catalogs Items | [optional] 
 **language** | [**OAICatalogsLocale**](.md)| Language for the Catalogs Items | [optional] 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAICatalogsAvailableFilterValues***](OAICatalogsAvailableFilterValues.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsCreate**
```objc
-(NSURLSessionTask*) catalogsCreateWithCatalogCreate: (OAICatalogCreate*) catalogCreate
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalog* output, NSError* error)) handler;
```

Create catalog

Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAICatalogCreate* catalogCreate = [[OAICatalogCreate alloc] init]; // 
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Create catalog
[apiInstance catalogsCreateWithCatalogCreate:catalogCreate
              adAccountId:adAccountId
          completionHandler: ^(OAICatalog* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogsApi->catalogsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogCreate** | [**OAICatalogCreate***](OAICatalogCreate.md)|  | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAICatalog***](OAICatalog.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogsList**
```objc
-(NSURLSessionTask*) catalogsListWithAdAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(OAICatalogsList200Response* output, NSError* error)) handler;
```

List catalogs

Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// List catalogs
[apiInstance catalogsListWithAdAccountId:adAccountId
              bookmark:bookmark
              pageSize:pageSize
          completionHandler: ^(OAICatalogsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICatalogsApi->catalogsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]

### Return type

[**OAICatalogsList200Response***](OAICatalogsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

