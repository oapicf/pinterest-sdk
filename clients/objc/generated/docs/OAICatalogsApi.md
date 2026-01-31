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

Get the available filter attributes and values associated with a given feed or catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - <code>country</code>, <code>language</code>, and <code>feed_id</code> are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* catalogId = @"catalogId_example"; // Filter entities for a given catalog_id.
NSString* feedId = @"feedId_example"; // Filter entities for a given feed_id. If not given, all feeds are considered. (optional)
OAICountry country = US; // Country for the Catalogs Items (optional)
OAICatalogsLocale language = en-US; // Language for the Catalogs Items (optional)
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
-(NSURLSessionTask*) catalogsCreateWithCatalogsCreateRequest: (OAICatalogsCreateRequest*) catalogsCreateRequest
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalog* output, NSError* error)) handler;
```

Create catalog

Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAICatalogsCreateRequest* catalogsCreateRequest = [[OAICatalogsCreateRequest alloc] init]; // Request object used to created a feed.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// Create catalog
[apiInstance catalogsCreateWithCatalogsCreateRequest:catalogsCreateRequest
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
 **catalogsCreateRequest** | [**OAICatalogsCreateRequest***](OAICatalogsCreateRequest.md)| Request object used to created a feed. | 
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
-(NSURLSessionTask*) catalogsListWithBookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAICatalogsList200Response* output, NSError* error)) handler;
```

List catalogs

Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account. (optional)

OAICatalogsApi*apiInstance = [[OAICatalogsApi alloc] init];

// List catalogs
[apiInstance catalogsListWithBookmark:bookmark
              pageSize:pageSize
              adAccountId:adAccountId
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
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **adAccountId** | **NSString***| Unique identifier of an ad account. | [optional] 

### Return type

[**OAICatalogsList200Response***](OAICatalogsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

