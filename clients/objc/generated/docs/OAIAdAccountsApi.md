# OAIAdAccountsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountAnalytics**](OAIAdAccountsApi.md#adaccountanalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**adAccountTargetingAnalyticsGet**](OAIAdAccountsApi.md#adaccounttargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account
[**adAccountsCreate**](OAIAdAccountsApi.md#adaccountscreate) | **POST** /ad_accounts | Create ad account
[**adAccountsGet**](OAIAdAccountsApi.md#adaccountsget) | **GET** /ad_accounts/{ad_account_id} | Get ad account
[**adAccountsList**](OAIAdAccountsApi.md#adaccountslist) | **GET** /ad_accounts | List ad accounts
[**analyticsCreateMmmReport**](OAIAdAccountsApi.md#analyticscreatemmmreport) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report
[**analyticsCreateReport**](OAIAdAccountsApi.md#analyticscreatereport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**analyticsCreateTemplateReport**](OAIAdAccountsApi.md#analyticscreatetemplatereport) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template
[**analyticsGetMmmReport**](OAIAdAccountsApi.md#analyticsgetmmmreport) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report.
[**analyticsGetReport**](OAIAdAccountsApi.md#analyticsgetreport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
[**sandboxDelete**](OAIAdAccountsApi.md#sandboxdelete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox
[**templatesList**](OAIAdAccountsApi.md#templateslist) | **GET** /ad_accounts/{ad_account_id}/templates | List templates


# **adAccountAnalytics**
```objc
-(NSURLSessionTask*) adAccountAnalyticsWithAdAccountId: (NSString*) adAccountId
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    columns: (NSArray<NSString*>*) columns
    granularity: (OAIGranularity) granularity
    clickWindowDays: (NSNumber*) clickWindowDays
    engagementWindowDays: (NSNumber*) engagementWindowDays
    viewWindowDays: (NSNumber*) viewWindowDays
    conversionReportTime: (NSString*) conversionReportTime
        completionHandler: (void (^)(NSArray<OAIAdAccountAnalyticsResponseInner>* output, NSError* error)) handler;
```

Get ad account analytics

Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSDate* startDate = @"2013-10-20T19:20:30+01:00"; // Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
NSDate* endDate = @"2013-10-20T19:20:30+01:00"; // Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
NSArray<NSString*>* columns = @[@"columns_example"]; // Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
OAIGranularity granularity = DAY; // TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
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
          completionHandler: ^(NSArray<OAIAdAccountAnalyticsResponseInner>* output, NSError* error) {
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
 **startDate** | **NSDate***| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **NSDate***| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **columns** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**OAIGranularity**](.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
 **clickWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
 **engagementWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
 **viewWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to @1]
 **conversionReportTime** | **NSString***| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to @&quot;TIME_OF_AD_ACTION&quot;]

### Return type

[**NSArray<OAIAdAccountAnalyticsResponseInner>***](OAIAdAccountAnalyticsResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adAccountTargetingAnalyticsGet**
```objc
-(NSURLSessionTask*) adAccountTargetingAnalyticsGetWithAdAccountId: (NSString*) adAccountId
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    targetingTypes: (NSArray<OAIAdsAnalyticsTargetingType>*) targetingTypes
    columns: (NSArray<NSString*>*) columns
    granularity: (OAIGranularity) granularity
    clickWindowDays: (NSNumber*) clickWindowDays
    engagementWindowDays: (NSNumber*) engagementWindowDays
    viewWindowDays: (NSNumber*) viewWindowDays
    conversionReportTime: (NSString*) conversionReportTime
    attributionTypes: (OAIConversionReportAttributionType) attributionTypes
        completionHandler: (void (^)(OAIMetricsResponse* output, NSError* error)) handler;
```

Get targeting analytics for an ad account

Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSDate* startDate = @"2013-10-20T19:20:30+01:00"; // Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
NSDate* endDate = @"2013-10-20T19:20:30+01:00"; // Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
NSArray<OAIAdsAnalyticsTargetingType>* targetingTypes = @[[[OAIAdsAnalyticsTargetingType alloc] init]]; // Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other.
NSArray<NSString*>* columns = @[@"columns_example"]; // Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
OAIGranularity granularity = DAY; // TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
NSNumber* clickWindowDays = 1; // Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to @30)
NSNumber* engagementWindowDays = @30; // Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to @30)
NSNumber* viewWindowDays = @1; // Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to @1)
NSString* conversionReportTime = TIME_OF_AD_ACTION; // The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to @"TIME_OF_AD_ACTION")
OAIConversionReportAttributionType attributionTypes = [[OAIConversionReportAttributionType alloc] init]; // List of types of attribution for the conversion report (optional)

OAIAdAccountsApi*apiInstance = [[OAIAdAccountsApi alloc] init];

// Get targeting analytics for an ad account
[apiInstance adAccountTargetingAnalyticsGetWithAdAccountId:adAccountId
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
          completionHandler: ^(OAIMetricsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdAccountsApi->adAccountTargetingAnalyticsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **startDate** | **NSDate***| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **NSDate***| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **targetingTypes** | [**NSArray&lt;OAIAdsAnalyticsTargetingType&gt;***](OAIAdsAnalyticsTargetingType*.md)| Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. | 
 **columns** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**OAIGranularity**](.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
 **clickWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
 **engagementWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
 **viewWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to @1]
 **conversionReportTime** | **NSString***| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to @&quot;TIME_OF_AD_ACTION&quot;]
 **attributionTypes** | [**OAIConversionReportAttributionType**](.md)| List of types of attribution for the conversion report | [optional] 

### Return type

[**OAIMetricsResponse***](OAIMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adAccountsCreate**
```objc
-(NSURLSessionTask*) adAccountsCreateWithAdAccountCreateRequest: (OAIAdAccountCreateRequest*) adAccountCreateRequest
        completionHandler: (void (^)(OAIAdAccount* output, NSError* error)) handler;
```

Create ad account

Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account. <p/> You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/create-an-advertiser-account\">Create an advertiser account</a>.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIAdAccountCreateRequest* adAccountCreateRequest = [[OAIAdAccountCreateRequest alloc] init]; // Ad account to create.

OAIAdAccountsApi*apiInstance = [[OAIAdAccountsApi alloc] init];

// Create ad account
[apiInstance adAccountsCreateWithAdAccountCreateRequest:adAccountCreateRequest
          completionHandler: ^(OAIAdAccount* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdAccountsApi->adAccountsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountCreateRequest** | [**OAIAdAccountCreateRequest***](OAIAdAccountCreateRequest.md)| Ad account to create. | 

### Return type

[**OAIAdAccount***](OAIAdAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adAccountsGet**
```objc
-(NSURLSessionTask*) adAccountsGetWithAdAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(OAIAdAccount* output, NSError* error)) handler;
```

Get ad account

Get an ad account

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.

OAIAdAccountsApi*apiInstance = [[OAIAdAccountsApi alloc] init];

// Get ad account
[apiInstance adAccountsGetWithAdAccountId:adAccountId
          completionHandler: ^(OAIAdAccount* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdAccountsApi->adAccountsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 

### Return type

[**OAIAdAccount***](OAIAdAccount.md)

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
        completionHandler: (void (^)(OAIAdAccountsList200Response* output, NSError* error)) handler;
```

List ad accounts

Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSNumber* includeSharedAccounts = @(YES); // Include shared ad accounts (optional) (default to @(YES))

OAIAdAccountsApi*apiInstance = [[OAIAdAccountsApi alloc] init];

// List ad accounts
[apiInstance adAccountsListWithBookmark:bookmark
              pageSize:pageSize
              includeSharedAccounts:includeSharedAccounts
          completionHandler: ^(OAIAdAccountsList200Response* output, NSError* error) {
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
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **includeSharedAccounts** | **NSNumber***| Include shared ad accounts | [optional] [default to @(YES)]

### Return type

[**OAIAdAccountsList200Response***](OAIAdAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analyticsCreateMmmReport**
```objc
-(NSURLSessionTask*) analyticsCreateMmmReportWithAdAccountId: (NSString*) adAccountId
    createMMMReportRequest: (OAICreateMMMReportRequest*) createMMMReportRequest
        completionHandler: (void (^)(OAICreateMMMReportResponse* output, NSError* error)) handler;
```

Create a request for a Marketing Mix Modeling (MMM) report

This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it's in beta release.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAICreateMMMReportRequest* createMMMReportRequest = [[OAICreateMMMReportRequest alloc] init]; // 

OAIAdAccountsApi*apiInstance = [[OAIAdAccountsApi alloc] init];

// Create a request for a Marketing Mix Modeling (MMM) report
[apiInstance analyticsCreateMmmReportWithAdAccountId:adAccountId
              createMMMReportRequest:createMMMReportRequest
          completionHandler: ^(OAICreateMMMReportResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdAccountsApi->analyticsCreateMmmReport: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **createMMMReportRequest** | [**OAICreateMMMReportRequest***](OAICreateMMMReportRequest.md)|  | 

### Return type

[**OAICreateMMMReportResponse***](OAICreateMMMReportResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analyticsCreateReport**
```objc
-(NSURLSessionTask*) analyticsCreateReportWithAdAccountId: (NSString*) adAccountId
    adsAnalyticsCreateAsyncRequest: (OAIAdsAnalyticsCreateAsyncRequest*) adsAnalyticsCreateAsyncRequest
        completionHandler: (void (^)(OAIAdsAnalyticsCreateAsyncResponse* output, NSError* error)) handler;
```

Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 914 days before the current date in UTC time and the max time range supported is 186 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. - If level is PRODUCT_ITEM, the furthest back you can are allowed to pull data is 92 days before the current date in UTC time and the max time range supported is 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.

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

# **analyticsCreateTemplateReport**
```objc
-(NSURLSessionTask*) analyticsCreateTemplateReportWithAdAccountId: (NSString*) adAccountId
    templateId: (NSString*) templateId
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    granularity: (OAIGranularity) granularity
        completionHandler: (void (^)(OAIAdsAnalyticsCreateAsyncResponse* output, NSError* error)) handler;
```

Create async request for an analytics report using a template

This takes a template ID and an optional custom timeframe and constructs an asynchronous report based on the template. It returns a token that you can use to download the report when it is ready.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* templateId = @"templateId_example"; // Unique identifier of a template.
NSDate* startDate = @"2013-10-20T19:20:30+01:00"; // Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. (optional)
NSDate* endDate = @"2013-10-20T19:20:30+01:00"; // Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. (optional)
OAIGranularity granularity = DAY; // TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly (optional)

OAIAdAccountsApi*apiInstance = [[OAIAdAccountsApi alloc] init];

// Create async request for an analytics report using a template
[apiInstance analyticsCreateTemplateReportWithAdAccountId:adAccountId
              templateId:templateId
              startDate:startDate
              endDate:endDate
              granularity:granularity
          completionHandler: ^(OAIAdsAnalyticsCreateAsyncResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdAccountsApi->analyticsCreateTemplateReport: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **templateId** | **NSString***| Unique identifier of a template. | 
 **startDate** | **NSDate***| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. | [optional] 
 **endDate** | **NSDate***| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. | [optional] 
 **granularity** | [**OAIGranularity**](.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | [optional] 

### Return type

[**OAIAdsAnalyticsCreateAsyncResponse***](OAIAdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analyticsGetMmmReport**
```objc
-(NSURLSessionTask*) analyticsGetMmmReportWithAdAccountId: (NSString*) adAccountId
    token: (NSString*) token
        completionHandler: (void (^)(OAIGetMMMReportResponse* output, NSError* error)) handler;
```

Get advertiser Marketing Mix Modeling (MMM) report.

Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* token = @"token_example"; // Token returned from the post request creation call

OAIAdAccountsApi*apiInstance = [[OAIAdAccountsApi alloc] init];

// Get advertiser Marketing Mix Modeling (MMM) report.
[apiInstance analyticsGetMmmReportWithAdAccountId:adAccountId
              token:token
          completionHandler: ^(OAIGetMMMReportResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdAccountsApi->analyticsGetMmmReport: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **token** | **NSString***| Token returned from the post request creation call | 

### Return type

[**OAIGetMMMReportResponse***](OAIGetMMMReportResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analyticsGetReport**
```objc
-(NSURLSessionTask*) analyticsGetReportWithAdAccountId: (NSString*) adAccountId
    token: (NSString*) token
        completionHandler: (void (^)(OAIAdsAnalyticsGetAsyncResponse* output, NSError* error)) handler;
```

Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

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

# **sandboxDelete**
```objc
-(NSURLSessionTask*) sandboxDeleteWithAdAccountId: (NSString*) adAccountId
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Delete ads data for ad account in API Sandbox

Delete an ad account and all the ads data associated with that account.  A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5).  Go to https://developers.pinterest.com/docs/dev-tools/sandbox/ for more information.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.

OAIAdAccountsApi*apiInstance = [[OAIAdAccountsApi alloc] init];

// Delete ads data for ad account in API Sandbox
[apiInstance sandboxDeleteWithAdAccountId:adAccountId
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdAccountsApi->sandboxDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 

### Return type

**NSString***

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **templatesList**
```objc
-(NSURLSessionTask*) templatesListWithAdAccountId: (NSString*) adAccountId
    pageSize: (NSNumber*) pageSize
    order: (NSString*) order
    bookmark: (NSString*) bookmark
        completionHandler: (void (^)(OAITemplatesList200Response* output, NSError* error)) handler;
```

List templates

Gets all Templates associated with an ad account ID.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* order = ASCENDING; // The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)

OAIAdAccountsApi*apiInstance = [[OAIAdAccountsApi alloc] init];

// List templates
[apiInstance templatesListWithAdAccountId:adAccountId
              pageSize:pageSize
              order:order
              bookmark:bookmark
          completionHandler: ^(OAITemplatesList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdAccountsApi->templatesList: %@", error);
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

[**OAITemplatesList200Response***](OAITemplatesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

