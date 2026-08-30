# OAIAdGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adGroupsAnalytics**](OAIAdGroupsApi.md#adgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**adGroupsAudienceSizing**](OAIAdGroupsApi.md#adgroupsaudiencesizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
[**adGroupsBidFloorGet**](OAIAdGroupsApi.md#adgroupsbidfloorget) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
[**adGroupsCreate**](OAIAdGroupsApi.md#adgroupscreate) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
[**adGroupsDynamicTitlesDownloadCsv**](OAIAdGroupsApi.md#adgroupsdynamictitlesdownloadcsv) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL
[**adGroupsDynamicTitlesGetStatus**](OAIAdGroupsApi.md#adgroupsdynamictitlesgetstatus) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status
[**adGroupsDynamicTitlesGetUploadUrl**](OAIAdGroupsApi.md#adgroupsdynamictitlesgetuploadurl) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL
[**adGroupsDynamicTitlesProcessCsv**](OAIAdGroupsApi.md#adgroupsdynamictitlesprocesscsv) | **POST** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV
[**adGroupsGet**](OAIAdGroupsApi.md#adgroupsget) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
[**adGroupsList**](OAIAdGroupsApi.md#adgroupslist) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**adGroupsTargetingAnalyticsGet**](OAIAdGroupsApi.md#adgroupstargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
[**adGroupsUpdate**](OAIAdGroupsApi.md#adgroupsupdate) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups
[**getAdGroupsByPromotionIdsList**](OAIAdGroupsApi.md#getadgroupsbypromotionidslist) | **GET** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs.


# **adGroupsAnalytics**
```objc
-(NSURLSessionTask*) adGroupsAnalyticsWithStartDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    adGroupIds: (NSArray<NSString*>*) adGroupIds
    columns: (NSArray<OAIReportingColumnSync>*) columns
    granularity: (OAIGranularity) granularity
    adAccountId: (NSString*) adAccountId
    clickWindowDays: (NSNumber*) clickWindowDays
    engagementWindowDays: (NSNumber*) engagementWindowDays
    viewWindowDays: (NSNumber*) viewWindowDays
    conversionReportTime: (NSString*) conversionReportTime
    aggregateReportRows: (NSNumber*) aggregateReportRows
    reportingTimezone: (OAIReportingTimeZone) reportingTimezone
        completionHandler: (void (^)(NSArray<OAIAdGroupsAnalyticsMetrics>* output, NSError* error)) handler;
```

Get ad group analytics

Get analytics for the specified ad groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSDate* startDate = @"2013-10-20T19:20:30+01:00"; // Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
NSDate* endDate = @"2013-10-20T19:20:30+01:00"; // Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
NSArray<NSString*>* adGroupIds = @[@"adGroupIds_example"]; // List of Ad group Ids to use to filter the results.
NSArray<OAIReportingColumnSync>* columns = @[[[OAIReportingColumnSync alloc] init]]; // Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
OAIGranularity granularity = [[OAIGranularity alloc] init]; //   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSNumber* clickWindowDays = @30; // Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to @30)
NSNumber* engagementWindowDays = @30; // Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to @30)
NSNumber* viewWindowDays = @1; // Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to @1)
NSString* conversionReportTime = @"TIME_OF_AD_ACTION"; // The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to @"TIME_OF_AD_ACTION")
NSNumber* aggregateReportRows = @(NO); // Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. (optional) (default to @(NO))
OAIReportingTimeZone reportingTimezone = [[OAIReportingTimeZone alloc] init]; // Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)

OAIAdGroupsApi*apiInstance = [[OAIAdGroupsApi alloc] init];

// Get ad group analytics
[apiInstance adGroupsAnalyticsWithStartDate:startDate
              endDate:endDate
              adGroupIds:adGroupIds
              columns:columns
              granularity:granularity
              adAccountId:adAccountId
              clickWindowDays:clickWindowDays
              engagementWindowDays:engagementWindowDays
              viewWindowDays:viewWindowDays
              conversionReportTime:conversionReportTime
              aggregateReportRows:aggregateReportRows
              reportingTimezone:reportingTimezone
          completionHandler: ^(NSArray<OAIAdGroupsAnalyticsMetrics>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdGroupsApi->adGroupsAnalytics: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **NSDate***| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **NSDate***| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **adGroupIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Ad group Ids to use to filter the results. | 
 **columns** | [**NSArray&lt;OAIReportingColumnSync&gt;***](OAIReportingColumnSync*.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**OAIGranularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **clickWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
 **engagementWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to @30]
 **viewWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to @1]
 **conversionReportTime** | **NSString***| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to @&quot;TIME_OF_AD_ACTION&quot;]
 **aggregateReportRows** | **NSNumber***| Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. | [optional] [default to @(NO)]
 **reportingTimezone** | [**OAIReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 

### Return type

[**NSArray<OAIAdGroupsAnalyticsMetrics>***](OAIAdGroupsAnalyticsMetrics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsAudienceSizing**
```objc
-(NSURLSessionTask*) adGroupsAudienceSizingWithAdAccountId: (NSString*) adAccountId
    adGroupAudienceSizingCreate: (OAIAdGroupAudienceSizingCreate*) adGroupAudienceSizingCreate
        completionHandler: (void (^)(OAIAdGroupAudienceSizing* output, NSError* error)) handler;
```

Get audience sizing

Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAIAdGroupAudienceSizingCreate* adGroupAudienceSizingCreate = [[OAIAdGroupAudienceSizingCreate alloc] init]; // 

OAIAdGroupsApi*apiInstance = [[OAIAdGroupsApi alloc] init];

// Get audience sizing
[apiInstance adGroupsAudienceSizingWithAdAccountId:adAccountId
              adGroupAudienceSizingCreate:adGroupAudienceSizingCreate
          completionHandler: ^(OAIAdGroupAudienceSizing* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdGroupsApi->adGroupsAudienceSizing: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **adGroupAudienceSizingCreate** | [**OAIAdGroupAudienceSizingCreate***](OAIAdGroupAudienceSizingCreate.md)|  | 

### Return type

[**OAIAdGroupAudienceSizing***](OAIAdGroupAudienceSizing.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsBidFloorGet**
```objc
-(NSURLSessionTask*) adGroupsBidFloorGetWithAdAccountId: (NSString*) adAccountId
    bidFloorCreate: (OAIBidFloorCreate*) bidFloorCreate
        completionHandler: (void (^)(OAIBidFloor* output, NSError* error)) handler;
```

Get bid floors

List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  * $1 = 1,000,000 microdollars * 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAIBidFloorCreate* bidFloorCreate = [[OAIBidFloorCreate alloc] init]; // 

OAIAdGroupsApi*apiInstance = [[OAIAdGroupsApi alloc] init];

// Get bid floors
[apiInstance adGroupsBidFloorGetWithAdAccountId:adAccountId
              bidFloorCreate:bidFloorCreate
          completionHandler: ^(OAIBidFloor* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdGroupsApi->adGroupsBidFloorGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **bidFloorCreate** | [**OAIBidFloorCreate***](OAIBidFloorCreate.md)|  | 

### Return type

[**OAIBidFloor***](OAIBidFloor.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsCreate**
```objc
-(NSURLSessionTask*) adGroupsCreateWithAdAccountId: (NSString*) adAccountId
    adGroupCreateCreate: (NSArray<OAIAdGroupCreateCreate>*) adGroupCreateCreate
        completionHandler: (void (^)(OAIAdGroupsCreate200Response* output, NSError* error)) handler;
```

Create ad groups

Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency: - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSArray<OAIAdGroupCreateCreate>* adGroupCreateCreate = @[[[OAIAdGroupCreateCreate alloc] init]]; // 

OAIAdGroupsApi*apiInstance = [[OAIAdGroupsApi alloc] init];

// Create ad groups
[apiInstance adGroupsCreateWithAdAccountId:adAccountId
              adGroupCreateCreate:adGroupCreateCreate
          completionHandler: ^(OAIAdGroupsCreate200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdGroupsApi->adGroupsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **adGroupCreateCreate** | [**NSArray&lt;OAIAdGroupCreateCreate&gt;***](OAIAdGroupCreateCreate.md)|  | 

### Return type

[**OAIAdGroupsCreate200Response***](OAIAdGroupsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsDynamicTitlesDownloadCsv**
```objc
-(NSURLSessionTask*) adGroupsDynamicTitlesDownloadCsvWithAdAccountId: (NSString*) adAccountId
    adGroupId: (NSString*) adGroupId
        completionHandler: (void (^)(OAIDynamicTitlesDownloadCSV* output, NSError* error)) handler;
```

Get dynamic titles CSV download URL

Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* adGroupId = @"adGroupId_example"; // Ad group ID.

OAIAdGroupsApi*apiInstance = [[OAIAdGroupsApi alloc] init];

// Get dynamic titles CSV download URL
[apiInstance adGroupsDynamicTitlesDownloadCsvWithAdAccountId:adAccountId
              adGroupId:adGroupId
          completionHandler: ^(OAIDynamicTitlesDownloadCSV* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdGroupsApi->adGroupsDynamicTitlesDownloadCsv: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **adGroupId** | **NSString***| Ad group ID. | 

### Return type

[**OAIDynamicTitlesDownloadCSV***](OAIDynamicTitlesDownloadCSV.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsDynamicTitlesGetStatus**
```objc
-(NSURLSessionTask*) adGroupsDynamicTitlesGetStatusWithAdAccountId: (NSString*) adAccountId
    adGroupId: (NSString*) adGroupId
        completionHandler: (void (^)(OAIDynamicTitlesGetStatus* output, NSError* error)) handler;
```

Get dynamic titles status

Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* adGroupId = @"adGroupId_example"; // Ad group ID.

OAIAdGroupsApi*apiInstance = [[OAIAdGroupsApi alloc] init];

// Get dynamic titles status
[apiInstance adGroupsDynamicTitlesGetStatusWithAdAccountId:adAccountId
              adGroupId:adGroupId
          completionHandler: ^(OAIDynamicTitlesGetStatus* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdGroupsApi->adGroupsDynamicTitlesGetStatus: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **adGroupId** | **NSString***| Ad group ID. | 

### Return type

[**OAIDynamicTitlesGetStatus***](OAIDynamicTitlesGetStatus.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsDynamicTitlesGetUploadUrl**
```objc
-(NSURLSessionTask*) adGroupsDynamicTitlesGetUploadUrlWithAdAccountId: (NSString*) adAccountId
    adGroupId: (NSString*) adGroupId
        completionHandler: (void (^)(OAIDynamicTitlesUploadURL* output, NSError* error)) handler;
```

Get dynamic titles upload URL

Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* adGroupId = @"adGroupId_example"; // Ad group ID.

OAIAdGroupsApi*apiInstance = [[OAIAdGroupsApi alloc] init];

// Get dynamic titles upload URL
[apiInstance adGroupsDynamicTitlesGetUploadUrlWithAdAccountId:adAccountId
              adGroupId:adGroupId
          completionHandler: ^(OAIDynamicTitlesUploadURL* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdGroupsApi->adGroupsDynamicTitlesGetUploadUrl: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **adGroupId** | **NSString***| Ad group ID. | 

### Return type

[**OAIDynamicTitlesUploadURL***](OAIDynamicTitlesUploadURL.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsDynamicTitlesProcessCsv**
```objc
-(NSURLSessionTask*) adGroupsDynamicTitlesProcessCsvWithAdAccountId: (NSString*) adAccountId
    adGroupId: (NSString*) adGroupId
    dynamicTitlesProcessCSVCreate: (OAIDynamicTitlesProcessCSVCreate*) dynamicTitlesProcessCSVCreate
        completionHandler: (void (^)(OAIDynamicTitlesProcessCSV* output, NSError* error)) handler;
```

Process dynamic titles CSV

Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* adGroupId = @"adGroupId_example"; // Ad group ID.
OAIDynamicTitlesProcessCSVCreate* dynamicTitlesProcessCSVCreate = [[OAIDynamicTitlesProcessCSVCreate alloc] init]; // 

OAIAdGroupsApi*apiInstance = [[OAIAdGroupsApi alloc] init];

// Process dynamic titles CSV
[apiInstance adGroupsDynamicTitlesProcessCsvWithAdAccountId:adAccountId
              adGroupId:adGroupId
              dynamicTitlesProcessCSVCreate:dynamicTitlesProcessCSVCreate
          completionHandler: ^(OAIDynamicTitlesProcessCSV* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdGroupsApi->adGroupsDynamicTitlesProcessCsv: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **adGroupId** | **NSString***| Ad group ID. | 
 **dynamicTitlesProcessCSVCreate** | [**OAIDynamicTitlesProcessCSVCreate***](OAIDynamicTitlesProcessCSVCreate.md)|  | 

### Return type

[**OAIDynamicTitlesProcessCSV***](OAIDynamicTitlesProcessCSV.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsGet**
```objc
-(NSURLSessionTask*) adGroupsGetWithAdGroupId: (NSString*) adGroupId
    adAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIAdGroup* output, NSError* error)) handler;
```

Get ad group

Get a specific ad group given the ad group ID.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adGroupId = @"adGroupId_example"; // Ad group ID.
NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.

OAIAdGroupsApi*apiInstance = [[OAIAdGroupsApi alloc] init];

// Get ad group
[apiInstance adGroupsGetWithAdGroupId:adGroupId
              adAccountId:adAccountId
          completionHandler: ^(OAIAdGroup* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdGroupsApi->adGroupsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adGroupId** | **NSString***| Ad group ID. | 
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 

### Return type

[**OAIAdGroup***](OAIAdGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsList**
```objc
-(NSURLSessionTask*) adGroupsListWithAdAccountId: (NSString*) adAccountId
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    order: (OAIPinterestLibPaginationOrder) order
    campaignIds: (NSArray<NSString*>*) campaignIds
    adGroupIds: (NSArray<NSString*>*) adGroupIds
    entityStatuses: (NSArray<OAIEntityStatus>*) entityStatuses
    translateInterestsToNames: (NSNumber*) translateInterestsToNames
        completionHandler: (void (^)(OAIAdGroupsList200Response* output, NSError* error)) handler;
```

List ad groups

List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)
OAIPinterestLibPaginationOrder order = [[OAIPinterestLibPaginationOrder alloc] init]; // The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
NSArray<NSString*>* campaignIds = @[@"campaignIds_example"]; // List of Campaign Ids to use to filter the results. (optional)
NSArray<NSString*>* adGroupIds = @[@"adGroupIds_example"]; // List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. (optional)
NSArray<OAIEntityStatus>* entityStatuses = @[[[OAIEntityStatus alloc] init]]; // Entity status (optional)
NSNumber* translateInterestsToNames = @(NO); // Return interests as text names (if value is true) rather than topic IDs. (optional) (default to @(NO))

OAIAdGroupsApi*apiInstance = [[OAIAdGroupsApi alloc] init];

// List ad groups
[apiInstance adGroupsListWithAdAccountId:adAccountId
              bookmark:bookmark
              pageSize:pageSize
              order:order
              campaignIds:campaignIds
              adGroupIds:adGroupIds
              entityStatuses:entityStatuses
              translateInterestsToNames:translateInterestsToNames
          completionHandler: ^(OAIAdGroupsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdGroupsApi->adGroupsList: %@", error);
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
 **campaignIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **adGroupIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [optional] 
 **entityStatuses** | [**NSArray&lt;OAIEntityStatus&gt;***](OAIEntityStatus*.md)| Entity status | [optional] 
 **translateInterestsToNames** | **NSNumber***| Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to @(NO)]

### Return type

[**OAIAdGroupsList200Response***](OAIAdGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsTargetingAnalyticsGet**
```objc
-(NSURLSessionTask*) adGroupsTargetingAnalyticsGetWithAdAccountId: (NSString*) adAccountId
    adGroupIds: (NSArray<NSString*>*) adGroupIds
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    targetingTypes: (NSArray<OAIAdsAnalyticsAdGroupTargetingType>*) targetingTypes
    columns: (NSArray<OAIReportingColumnSync>*) columns
    granularity: (OAIGranularity) granularity
    clickWindowDays: (NSNumber*) clickWindowDays
    engagementWindowDays: (NSNumber*) engagementWindowDays
    viewWindowDays: (NSNumber*) viewWindowDays
    conversionReportTime: (NSString*) conversionReportTime
    attributionTypes: (NSArray<OAIConversionReportAttributionType>*) attributionTypes
    reportingTimezone: (OAIReportingTimeZone) reportingTimezone
    sortColumns: (NSArray<NSString*>*) sortColumns
    sortAscending: (NSNumber*) sortAscending
        completionHandler: (void (^)(OAIMetricsResponse* output, NSError* error)) handler;
```

Get targeting analytics for ad groups

Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSArray<NSString*>* adGroupIds = @[@"adGroupIds_example"]; // List of Ad group Ids to use to filter the results.
NSDate* startDate = @"2013-10-20T19:20:30+01:00"; // Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
NSDate* endDate = @"2013-10-20T19:20:30+01:00"; // Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
NSArray<OAIAdsAnalyticsAdGroupTargetingType>* targetingTypes = @[[[OAIAdsAnalyticsAdGroupTargetingType alloc] init]]; // Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\", \"CREATIVE_ENHANCEMENTS\"] are in BETA and not yet available to all users.
NSArray<OAIReportingColumnSync>* columns = @[[[OAIReportingColumnSync alloc] init]]; // Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
OAIGranularity granularity = [[OAIGranularity alloc] init]; //   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
NSNumber* clickWindowDays = @30; // Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to @30)
NSNumber* engagementWindowDays = @30; // Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to @30)
NSNumber* viewWindowDays = @1; // Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to @1)
NSString* conversionReportTime = @"TIME_OF_AD_ACTION"; // The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to @"TIME_OF_AD_ACTION")
NSArray<OAIConversionReportAttributionType>* attributionTypes = @[[[OAIConversionReportAttributionType alloc] init]]; // List of types of attribution for the conversion report (optional)
OAIReportingTimeZone reportingTimezone = [[OAIReportingTimeZone alloc] init]; // Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
NSArray<NSString*>* sortColumns = @[@"sortColumns_example"]; // Sort Columns. (optional)
NSNumber* sortAscending = @56; // Sort ascending. (optional)

OAIAdGroupsApi*apiInstance = [[OAIAdGroupsApi alloc] init];

// Get targeting analytics for ad groups
[apiInstance adGroupsTargetingAnalyticsGetWithAdAccountId:adAccountId
              adGroupIds:adGroupIds
              startDate:startDate
              endDate:endDate
              targetingTypes:targetingTypes
              columns:columns
              granularity:granularity
              clickWindowDays:clickWindowDays
              engagementWindowDays:engagementWindowDays
              viewWindowDays:viewWindowDays
              conversionReportTime:conversionReportTime
              attributionTypes:attributionTypes
              reportingTimezone:reportingTimezone
              sortColumns:sortColumns
              sortAscending:sortAscending
          completionHandler: ^(OAIMetricsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdGroupsApi->adGroupsTargetingAnalyticsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **adGroupIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Ad group Ids to use to filter the results. | 
 **startDate** | **NSDate***| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **NSDate***| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **targetingTypes** | [**NSArray&lt;OAIAdsAnalyticsAdGroupTargetingType&gt;***](OAIAdsAnalyticsAdGroupTargetingType*.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;, \&quot;CREATIVE_ENHANCEMENTS\&quot;] are in BETA and not yet available to all users. | 
 **columns** | [**NSArray&lt;OAIReportingColumnSync&gt;***](OAIReportingColumnSync*.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**OAIGranularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **clickWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
 **engagementWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to @30]
 **viewWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to @1]
 **conversionReportTime** | **NSString***| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to @&quot;TIME_OF_AD_ACTION&quot;]
 **attributionTypes** | [**NSArray&lt;OAIConversionReportAttributionType&gt;***](OAIConversionReportAttributionType*.md)| List of types of attribution for the conversion report | [optional] 
 **reportingTimezone** | [**OAIReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 
 **sortColumns** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Sort Columns. | [optional] 
 **sortAscending** | **NSNumber***| Sort ascending. | [optional] 

### Return type

[**OAIMetricsResponse***](OAIMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsUpdate**
```objc
-(NSURLSessionTask*) adGroupsUpdateWithAdAccountId: (NSString*) adAccountId
    adGroupUpdateBatchUpdate: (NSArray<OAIAdGroupUpdateBatchUpdate>*) adGroupUpdateBatchUpdate
        completionHandler: (void (^)(OAIAdGroupsCreate200Response* output, NSError* error)) handler;
```

Update ad groups

Update multiple existing ad groups.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSArray<OAIAdGroupUpdateBatchUpdate>* adGroupUpdateBatchUpdate = @[[[OAIAdGroupUpdateBatchUpdate alloc] init]]; // 

OAIAdGroupsApi*apiInstance = [[OAIAdGroupsApi alloc] init];

// Update ad groups
[apiInstance adGroupsUpdateWithAdAccountId:adAccountId
              adGroupUpdateBatchUpdate:adGroupUpdateBatchUpdate
          completionHandler: ^(OAIAdGroupsCreate200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdGroupsApi->adGroupsUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **adGroupUpdateBatchUpdate** | [**NSArray&lt;OAIAdGroupUpdateBatchUpdate&gt;***](OAIAdGroupUpdateBatchUpdate.md)|  | 

### Return type

[**OAIAdGroupsCreate200Response***](OAIAdGroupsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAdGroupsByPromotionIdsList**
```objc
-(NSURLSessionTask*) getAdGroupsByPromotionIdsListWithAdAccountId: (NSString*) adAccountId
    promotionIds: (NSArray<NSString*>*) promotionIds
    bookmark: (NSString*) bookmark
    pageSize: (NSNumber*) pageSize
    order: (OAIPinterestLibPaginationOrder) order
        completionHandler: (void (^)(OAIAdGroupsList200Response* output, NSError* error)) handler;
```

List of ad groups using promotions IDs.

  Get a list of ad groups that are associated with those promotion ids

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSArray<NSString*>* promotionIds = @[@"promotionIds_example"]; // List of Promotion IDs to use to filter the results.
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to @25)
OAIPinterestLibPaginationOrder order = [[OAIPinterestLibPaginationOrder alloc] init]; // The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)

OAIAdGroupsApi*apiInstance = [[OAIAdGroupsApi alloc] init];

// List of ad groups using promotions IDs.
[apiInstance getAdGroupsByPromotionIdsListWithAdAccountId:adAccountId
              promotionIds:promotionIds
              bookmark:bookmark
              pageSize:pageSize
              order:order
          completionHandler: ^(OAIAdGroupsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdGroupsApi->getAdGroupsByPromotionIdsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **promotionIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Promotion IDs to use to filter the results. | 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to @25]
 **order** | [**OAIPinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

### Return type

[**OAIAdGroupsList200Response***](OAIAdGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

