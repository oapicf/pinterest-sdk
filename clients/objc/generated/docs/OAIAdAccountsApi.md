# OAIAdAccountsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountAnalytics**](OAIAdAccountsApi.md#adaccountanalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**adAccountsList**](OAIAdAccountsApi.md#adaccountslist) | **GET** /ad_accounts | List ad accounts
[**adGroupsAnalytics**](OAIAdAccountsApi.md#adgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**adGroupsList**](OAIAdAccountsApi.md#adgroupslist) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**adsAnalytics**](OAIAdAccountsApi.md#adsanalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**adsList**](OAIAdAccountsApi.md#adslist) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
[**analyticsCreateReport**](OAIAdAccountsApi.md#analyticscreatereport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**analyticsGetReport**](OAIAdAccountsApi.md#analyticsgetreport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
[**campaignsAnalytics**](OAIAdAccountsApi.md#campaignsanalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**campaignsList**](OAIAdAccountsApi.md#campaignslist) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**productGroupsAnalytics**](OAIAdAccountsApi.md#productgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics


# **adAccountAnalytics**
```objc
-(NSURLSessionTask*) adAccountAnalyticsWithAdAccountId: (NSString*) adAccountId
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    columns: (NSArray<NSString*>*) columns
    granularity: (OAIGranularity*) granularity
    clickWindowDays: (NSNumber*) clickWindowDays
    engagementWindowDays: (NSNumber*) engagementWindowDays
    viewWindowDays: (NSNumber*) viewWindowDays
    conversionReportTime: (NSString*) conversionReportTime
        completionHandler: (void (^)(NSArray<NSDictionary<NSString*, NSObject*>*>* output, NSError* error)) handler;
```

Get ad account analytics

Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSDate* startDate = @"2013-10-20T19:20:30+01:00"; // Metric report start date (UTC). Format: YYYY-MM-DD
NSDate* endDate = @"2013-10-20T19:20:30+01:00"; // Metric report end date (UTC). Format: YYYY-MM-DD
NSArray<NSString*>* columns = @[@"columns_example"]; // Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
OAIGranularity* granularity = DAY; // Granularity
NSNumber* clickWindowDays = 1; // Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to @30)
NSNumber* engagementWindowDays = @30; // Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to @30)
NSNumber* viewWindowDays = @1; // Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to @1)
NSString* conversionReportTime = TIME_OF_AD_ACTION; // The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to @"TIME_OF_AD_ACTION")

OAIAdAccountsApi*apiInstance = [[OAIAdAccountsApi alloc] init];

// Get ad account analytics
[apiInstance adAccountAnalyticsWithAdAccountId:adAccountId
              startDate:startDate
              endDate:endDate
              columns:columns
              granularity:granularity
              clickWindowDays:clickWindowDays
              engagementWindowDays:engagementWindowDays
              viewWindowDays:viewWindowDays
              conversionReportTime:conversionReportTime
          completionHandler: ^(NSArray<NSDictionary<NSString*, NSObject*>*>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdAccountsApi->adAccountAnalytics: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **startDate** | **NSDate***| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **NSDate***| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **columns** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**OAIGranularity***](.md)| Granularity | 
 **clickWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
 **engagementWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
 **viewWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to @1]
 **conversionReportTime** | **NSString***| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to @&quot;TIME_OF_AD_ACTION&quot;]

### Return type

[**NSArray<NSDictionary<NSString*, NSObject*>*>***](NSDictionary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adAccountsList**
```objc
-(NSURLSessionTask*) adAccountsListWithBookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    includeSharedAccounts: (NSNumber*) includeSharedAccounts
        completionHandler: (void (^)(OAIPaginated* output, NSError* error)) handler;
```

List ad accounts

Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to @25)
NSNumber* includeSharedAccounts = @(YES); // Include shared ad accounts (optional) (default to @(YES))

OAIAdAccountsApi*apiInstance = [[OAIAdAccountsApi alloc] init];

// List ad accounts
[apiInstance adAccountsListWithBookmark:bookmark
              pageSize:pageSize
              includeSharedAccounts:includeSharedAccounts
          completionHandler: ^(OAIPaginated* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdAccountsApi->adAccountsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **includeSharedAccounts** | **NSNumber***| Include shared ad accounts | [optional] [default to @(YES)]

### Return type

[**OAIPaginated***](OAIPaginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsAnalytics**
```objc
-(NSURLSessionTask*) adGroupsAnalyticsWithAdAccountId: (NSString*) adAccountId
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    adGroupIds: (NSArray<NSString*>*) adGroupIds
    columns: (NSArray<NSString*>*) columns
    granularity: (OAIGranularity*) granularity
    clickWindowDays: (NSNumber*) clickWindowDays
    engagementWindowDays: (NSNumber*) engagementWindowDays
    viewWindowDays: (NSNumber*) viewWindowDays
    conversionReportTime: (NSString*) conversionReportTime
        completionHandler: (void (^)(NSArray<NSDictionary<NSString*, NSObject*>*>* output, NSError* error)) handler;
```

Get ad group analytics

Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSDate* startDate = @"2013-10-20T19:20:30+01:00"; // Metric report start date (UTC). Format: YYYY-MM-DD
NSDate* endDate = @"2013-10-20T19:20:30+01:00"; // Metric report end date (UTC). Format: YYYY-MM-DD
NSArray<NSString*>* adGroupIds = @[@"adGroupIds_example"]; // List of Ad group Ids to use to filter the results.
NSArray<NSString*>* columns = @[@"columns_example"]; // Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
OAIGranularity* granularity = DAY; // Granularity
NSNumber* clickWindowDays = 1; // Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to @30)
NSNumber* engagementWindowDays = @30; // Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to @30)
NSNumber* viewWindowDays = @1; // Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to @1)
NSString* conversionReportTime = TIME_OF_AD_ACTION; // The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to @"TIME_OF_AD_ACTION")

OAIAdAccountsApi*apiInstance = [[OAIAdAccountsApi alloc] init];

// Get ad group analytics
[apiInstance adGroupsAnalyticsWithAdAccountId:adAccountId
              startDate:startDate
              endDate:endDate
              adGroupIds:adGroupIds
              columns:columns
              granularity:granularity
              clickWindowDays:clickWindowDays
              engagementWindowDays:engagementWindowDays
              viewWindowDays:viewWindowDays
              conversionReportTime:conversionReportTime
          completionHandler: ^(NSArray<NSDictionary<NSString*, NSObject*>*>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdAccountsApi->adGroupsAnalytics: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **startDate** | **NSDate***| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **NSDate***| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **adGroupIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Ad group Ids to use to filter the results. | 
 **columns** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**OAIGranularity***](.md)| Granularity | 
 **clickWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
 **engagementWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
 **viewWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to @1]
 **conversionReportTime** | **NSString***| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to @&quot;TIME_OF_AD_ACTION&quot;]

### Return type

[**NSArray<NSDictionary<NSString*, NSObject*>*>***](NSDictionary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsList**
```objc
-(NSURLSessionTask*) adGroupsListWithAdAccountId: (NSString*) adAccountId
    campaignIds: (NSArray<NSString*>*) campaignIds
    adGroupIds: (NSArray<NSString*>*) adGroupIds
    entityStatuses: (NSArray<NSString*>*) entityStatuses
    pageSize: (NSNumber*) pageSize
    order: (NSString*) order
    bookmark: (NSString*) bookmark
    translateInterestsToNames: (NSNumber*) translateInterestsToNames
        completionHandler: (void (^)(OAIPaginated* output, NSError* error)) handler;
```

List ad groups

Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSArray<NSString*>* campaignIds = @[@"campaignIds_example"]; // List of Campaign Ids to use to filter the results. (optional)
NSArray<NSString*>* adGroupIds = @[@"adGroupIds_example"]; // List of Ad group Ids to use to filter the results. (optional)
NSArray<NSString*>* entityStatuses = @[@"entityStatuses_example"]; // Entity status (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to @25)
NSString* order = ASCENDING; // The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* translateInterestsToNames = @(NO); // Return interests as text names (if value is true) rather than topic IDs. (optional) (default to @(NO))

OAIAdAccountsApi*apiInstance = [[OAIAdAccountsApi alloc] init];

// List ad groups
[apiInstance adGroupsListWithAdAccountId:adAccountId
              campaignIds:campaignIds
              adGroupIds:adGroupIds
              entityStatuses:entityStatuses
              pageSize:pageSize
              order:order
              bookmark:bookmark
              translateInterestsToNames:translateInterestsToNames
          completionHandler: ^(OAIPaginated* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdAccountsApi->adGroupsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **campaignIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **adGroupIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Ad group Ids to use to filter the results. | [optional] 
 **entityStatuses** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Entity status | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **order** | **NSString***| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **translateInterestsToNames** | **NSNumber***| Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to @(NO)]

### Return type

[**OAIPaginated***](OAIPaginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adsAnalytics**
```objc
-(NSURLSessionTask*) adsAnalyticsWithAdAccountId: (NSString*) adAccountId
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    adIds: (NSArray<NSString*>*) adIds
    columns: (NSArray<NSString*>*) columns
    granularity: (OAIGranularity*) granularity
    clickWindowDays: (NSNumber*) clickWindowDays
    engagementWindowDays: (NSNumber*) engagementWindowDays
    viewWindowDays: (NSNumber*) viewWindowDays
    conversionReportTime: (NSString*) conversionReportTime
        completionHandler: (void (^)(NSArray<NSDictionary<NSString*, NSObject*>*>* output, NSError* error)) handler;
```

Get ad analytics

Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSDate* startDate = @"2013-10-20T19:20:30+01:00"; // Metric report start date (UTC). Format: YYYY-MM-DD
NSDate* endDate = @"2013-10-20T19:20:30+01:00"; // Metric report end date (UTC). Format: YYYY-MM-DD
NSArray<NSString*>* adIds = @[@"adIds_example"]; // List of Ad Ids to use to filter the results.
NSArray<NSString*>* columns = @[@"columns_example"]; // Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
OAIGranularity* granularity = DAY; // Granularity
NSNumber* clickWindowDays = 1; // Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to @30)
NSNumber* engagementWindowDays = @30; // Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to @30)
NSNumber* viewWindowDays = @1; // Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to @1)
NSString* conversionReportTime = TIME_OF_AD_ACTION; // The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to @"TIME_OF_AD_ACTION")

OAIAdAccountsApi*apiInstance = [[OAIAdAccountsApi alloc] init];

// Get ad analytics
[apiInstance adsAnalyticsWithAdAccountId:adAccountId
              startDate:startDate
              endDate:endDate
              adIds:adIds
              columns:columns
              granularity:granularity
              clickWindowDays:clickWindowDays
              engagementWindowDays:engagementWindowDays
              viewWindowDays:viewWindowDays
              conversionReportTime:conversionReportTime
          completionHandler: ^(NSArray<NSDictionary<NSString*, NSObject*>*>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdAccountsApi->adsAnalytics: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **startDate** | **NSDate***| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **NSDate***| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **adIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Ad Ids to use to filter the results. | 
 **columns** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**OAIGranularity***](.md)| Granularity | 
 **clickWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
 **engagementWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
 **viewWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to @1]
 **conversionReportTime** | **NSString***| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to @&quot;TIME_OF_AD_ACTION&quot;]

### Return type

[**NSArray<NSDictionary<NSString*, NSObject*>*>***](NSDictionary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adsList**
```objc
-(NSURLSessionTask*) adsListWithAdAccountId: (NSString*) adAccountId
    campaignIds: (NSArray<NSString*>*) campaignIds
    adGroupIds: (NSArray<NSString*>*) adGroupIds
    adIds: (NSArray<NSString*>*) adIds
    entityStatuses: (NSArray<NSString*>*) entityStatuses
    pageSize: (NSNumber*) pageSize
    order: (NSString*) order
    bookmark: (NSString*) bookmark
        completionHandler: (void (^)(OAIPaginated* output, NSError* error)) handler;
```

List ads

Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSArray<NSString*>* campaignIds = @[@"campaignIds_example"]; // List of Campaign Ids to use to filter the results. (optional)
NSArray<NSString*>* adGroupIds = @[@"adGroupIds_example"]; // List of Ad group Ids to use to filter the results. (optional)
NSArray<NSString*>* adIds = @[@"adIds_example"]; // List of Ad Ids to use to filter the results. (optional)
NSArray<NSString*>* entityStatuses = @[@"entityStatuses_example"]; // Entity status (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to @25)
NSString* order = ASCENDING; // The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)

OAIAdAccountsApi*apiInstance = [[OAIAdAccountsApi alloc] init];

// List ads
[apiInstance adsListWithAdAccountId:adAccountId
              campaignIds:campaignIds
              adGroupIds:adGroupIds
              adIds:adIds
              entityStatuses:entityStatuses
              pageSize:pageSize
              order:order
              bookmark:bookmark
          completionHandler: ^(OAIPaginated* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdAccountsApi->adsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **campaignIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **adGroupIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Ad group Ids to use to filter the results. | [optional] 
 **adIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Ad Ids to use to filter the results. | [optional] 
 **entityStatuses** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Entity status | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **order** | **NSString***| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 

### Return type

[**OAIPaginated***](OAIPaginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analyticsCreateReport**
```objc
-(NSURLSessionTask*) analyticsCreateReportWithAdAccountId: (NSString*) adAccountId
    adsAnalyticsCreateAsyncRequest: (OAIAdsAnalyticsCreateAsyncRequest*) adsAnalyticsCreateAsyncRequest
        completionHandler: (void (^)(OAIAdsAnalyticsCreateAsyncResponse* output, NSError* error)) handler;
```

Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAIAdsAnalyticsCreateAsyncRequest* adsAnalyticsCreateAsyncRequest = [[OAIAdsAnalyticsCreateAsyncRequest alloc] init]; // 

OAIAdAccountsApi*apiInstance = [[OAIAdAccountsApi alloc] init];

// Create async request for an account analytics report
[apiInstance analyticsCreateReportWithAdAccountId:adAccountId
              adsAnalyticsCreateAsyncRequest:adsAnalyticsCreateAsyncRequest
          completionHandler: ^(OAIAdsAnalyticsCreateAsyncResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdAccountsApi->analyticsCreateReport: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **adsAnalyticsCreateAsyncRequest** | [**OAIAdsAnalyticsCreateAsyncRequest***](OAIAdsAnalyticsCreateAsyncRequest.md)|  | 

### Return type

[**OAIAdsAnalyticsCreateAsyncResponse***](OAIAdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analyticsGetReport**
```objc
-(NSURLSessionTask*) analyticsGetReportWithAdAccountId: (NSString*) adAccountId
    token: (NSString*) token
        completionHandler: (void (^)(OAIAdsAnalyticsGetAsyncResponse* output, NSError* error)) handler;
```

Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* token = @"token_example"; // Token returned from the post request creation call

OAIAdAccountsApi*apiInstance = [[OAIAdAccountsApi alloc] init];

// Get the account analytics report created by the async call
[apiInstance analyticsGetReportWithAdAccountId:adAccountId
              token:token
          completionHandler: ^(OAIAdsAnalyticsGetAsyncResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdAccountsApi->analyticsGetReport: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **token** | **NSString***| Token returned from the post request creation call | 

### Return type

[**OAIAdsAnalyticsGetAsyncResponse***](OAIAdsAnalyticsGetAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaignsAnalytics**
```objc
-(NSURLSessionTask*) campaignsAnalyticsWithAdAccountId: (NSString*) adAccountId
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    campaignIds: (NSArray<NSString*>*) campaignIds
    columns: (NSArray<NSString*>*) columns
    granularity: (OAIGranularity*) granularity
    clickWindowDays: (NSNumber*) clickWindowDays
    engagementWindowDays: (NSNumber*) engagementWindowDays
    viewWindowDays: (NSNumber*) viewWindowDays
    conversionReportTime: (NSString*) conversionReportTime
        completionHandler: (void (^)(NSArray<NSDictionary<NSString*, NSObject*>*>* output, NSError* error)) handler;
```

Get campaign analytics

Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSDate* startDate = @"2013-10-20T19:20:30+01:00"; // Metric report start date (UTC). Format: YYYY-MM-DD
NSDate* endDate = @"2013-10-20T19:20:30+01:00"; // Metric report end date (UTC). Format: YYYY-MM-DD
NSArray<NSString*>* campaignIds = @[@"campaignIds_example"]; // List of Campaign Ids to use to filter the results.
NSArray<NSString*>* columns = @[@"columns_example"]; // Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
OAIGranularity* granularity = DAY; // Granularity
NSNumber* clickWindowDays = 1; // Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to @30)
NSNumber* engagementWindowDays = @30; // Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to @30)
NSNumber* viewWindowDays = @1; // Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to @1)
NSString* conversionReportTime = TIME_OF_AD_ACTION; // The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to @"TIME_OF_AD_ACTION")

OAIAdAccountsApi*apiInstance = [[OAIAdAccountsApi alloc] init];

// Get campaign analytics
[apiInstance campaignsAnalyticsWithAdAccountId:adAccountId
              startDate:startDate
              endDate:endDate
              campaignIds:campaignIds
              columns:columns
              granularity:granularity
              clickWindowDays:clickWindowDays
              engagementWindowDays:engagementWindowDays
              viewWindowDays:viewWindowDays
              conversionReportTime:conversionReportTime
          completionHandler: ^(NSArray<NSDictionary<NSString*, NSObject*>*>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdAccountsApi->campaignsAnalytics: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **startDate** | **NSDate***| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **NSDate***| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **campaignIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Campaign Ids to use to filter the results. | 
 **columns** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**OAIGranularity***](.md)| Granularity | 
 **clickWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
 **engagementWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
 **viewWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to @1]
 **conversionReportTime** | **NSString***| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to @&quot;TIME_OF_AD_ACTION&quot;]

### Return type

[**NSArray<NSDictionary<NSString*, NSObject*>*>***](NSDictionary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaignsList**
```objc
-(NSURLSessionTask*) campaignsListWithAdAccountId: (NSString*) adAccountId
    campaignIds: (NSArray<NSString*>*) campaignIds
    entityStatuses: (NSArray<NSString*>*) entityStatuses
    pageSize: (NSNumber*) pageSize
    order: (NSString*) order
    bookmark: (NSString*) bookmark
        completionHandler: (void (^)(OAIPaginated* output, NSError* error)) handler;
```

List campaigns

Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSArray<NSString*>* campaignIds = @[@"campaignIds_example"]; // List of Campaign Ids to use to filter the results. (optional)
NSArray<NSString*>* entityStatuses = @[@"entityStatuses_example"]; // Entity status (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to @25)
NSString* order = ASCENDING; // The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)

OAIAdAccountsApi*apiInstance = [[OAIAdAccountsApi alloc] init];

// List campaigns
[apiInstance campaignsListWithAdAccountId:adAccountId
              campaignIds:campaignIds
              entityStatuses:entityStatuses
              pageSize:pageSize
              order:order
              bookmark:bookmark
          completionHandler: ^(OAIPaginated* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdAccountsApi->campaignsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **campaignIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **entityStatuses** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Entity status | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **order** | **NSString***| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 

### Return type

[**OAIPaginated***](OAIPaginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **productGroupsAnalytics**
```objc
-(NSURLSessionTask*) productGroupsAnalyticsWithAdAccountId: (NSString*) adAccountId
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    productGroupIds: (NSArray<NSString*>*) productGroupIds
    columns: (NSArray<NSString*>*) columns
    granularity: (OAIGranularity*) granularity
    clickWindowDays: (NSNumber*) clickWindowDays
    engagementWindowDays: (NSNumber*) engagementWindowDays
    viewWindowDays: (NSNumber*) viewWindowDays
    conversionReportTime: (NSString*) conversionReportTime
        completionHandler: (void (^)(NSArray<NSDictionary<NSString*, NSObject*>*>* output, NSError* error)) handler;
```

Get product group analytics

Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSDate* startDate = @"2013-10-20T19:20:30+01:00"; // Metric report start date (UTC). Format: YYYY-MM-DD
NSDate* endDate = @"2013-10-20T19:20:30+01:00"; // Metric report end date (UTC). Format: YYYY-MM-DD
NSArray<NSString*>* productGroupIds = @[@"productGroupIds_example"]; // List of Product group Ids to use to filter the results.
NSArray<NSString*>* columns = @[@"columns_example"]; // Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
OAIGranularity* granularity = DAY; // Granularity
NSNumber* clickWindowDays = 1; // Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to @30)
NSNumber* engagementWindowDays = @30; // Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to @30)
NSNumber* viewWindowDays = @1; // Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to @1)
NSString* conversionReportTime = TIME_OF_AD_ACTION; // The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to @"TIME_OF_AD_ACTION")

OAIAdAccountsApi*apiInstance = [[OAIAdAccountsApi alloc] init];

// Get product group analytics
[apiInstance productGroupsAnalyticsWithAdAccountId:adAccountId
              startDate:startDate
              endDate:endDate
              productGroupIds:productGroupIds
              columns:columns
              granularity:granularity
              clickWindowDays:clickWindowDays
              engagementWindowDays:engagementWindowDays
              viewWindowDays:viewWindowDays
              conversionReportTime:conversionReportTime
          completionHandler: ^(NSArray<NSDictionary<NSString*, NSObject*>*>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdAccountsApi->productGroupsAnalytics: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **startDate** | **NSDate***| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **NSDate***| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **productGroupIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Product group Ids to use to filter the results. | 
 **columns** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**OAIGranularity***](.md)| Granularity | 
 **clickWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
 **engagementWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
 **viewWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to @1]
 **conversionReportTime** | **NSString***| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to @&quot;TIME_OF_AD_ACTION&quot;]

### Return type

[**NSArray<NSDictionary<NSString*, NSObject*>*>***](NSDictionary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

