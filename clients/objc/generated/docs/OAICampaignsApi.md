# OAICampaignsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**campaignTargetingAnalyticsGet**](OAICampaignsApi.md#campaigntargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
[**campaignsAnalytics**](OAICampaignsApi.md#campaignsanalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**campaignsCreate**](OAICampaignsApi.md#campaignscreate) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
[**campaignsGet**](OAICampaignsApi.md#campaignsget) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
[**campaignsList**](OAICampaignsApi.md#campaignslist) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**campaignsUpdate**](OAICampaignsApi.md#campaignsupdate) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns


# **campaignTargetingAnalyticsGet**
```objc
-(NSURLSessionTask*) campaignTargetingAnalyticsGetWithAdAccountId: (NSString*) adAccountId
    campaignIds: (NSArray<NSString*>*) campaignIds
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

Get targeting analytics for campaigns

Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSArray<NSString*>* campaignIds = @[@"campaignIds_example"]; // List of Campaign Ids to use to filter the results.
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

OAICampaignsApi*apiInstance = [[OAICampaignsApi alloc] init];

// Get targeting analytics for campaigns
[apiInstance campaignTargetingAnalyticsGetWithAdAccountId:adAccountId
              campaignIds:campaignIds
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
                            NSLog(@"Error calling OAICampaignsApi->campaignTargetingAnalyticsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **campaignIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Campaign Ids to use to filter the results. | 
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

# **campaignsAnalytics**
```objc
-(NSURLSessionTask*) campaignsAnalyticsWithAdAccountId: (NSString*) adAccountId
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    campaignIds: (NSArray<NSString*>*) campaignIds
    columns: (NSArray<NSString*>*) columns
    granularity: (OAIGranularity) granularity
    clickWindowDays: (NSNumber*) clickWindowDays
    engagementWindowDays: (NSNumber*) engagementWindowDays
    viewWindowDays: (NSNumber*) viewWindowDays
    conversionReportTime: (NSString*) conversionReportTime
        completionHandler: (void (^)(NSArray<OAICampaignsAnalyticsResponseInner>* output, NSError* error)) handler;
```

Get campaign analytics

Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSDate* startDate = @"2013-10-20T19:20:30+01:00"; // Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
NSDate* endDate = @"2013-10-20T19:20:30+01:00"; // Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
NSArray<NSString*>* campaignIds = @[@"campaignIds_example"]; // List of Campaign Ids to use to filter the results.
NSArray<NSString*>* columns = @[@"columns_example"]; // Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
OAIGranularity granularity = DAY; // TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
NSNumber* clickWindowDays = 1; // Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to @30)
NSNumber* engagementWindowDays = @30; // Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to @30)
NSNumber* viewWindowDays = @1; // Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to @1)
NSString* conversionReportTime = TIME_OF_AD_ACTION; // The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to @"TIME_OF_AD_ACTION")

OAICampaignsApi*apiInstance = [[OAICampaignsApi alloc] init];

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
          completionHandler: ^(NSArray<OAICampaignsAnalyticsResponseInner>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICampaignsApi->campaignsAnalytics: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **startDate** | **NSDate***| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **NSDate***| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **campaignIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Campaign Ids to use to filter the results. | 
 **columns** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**OAIGranularity**](.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
 **clickWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
 **engagementWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
 **viewWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to @1]
 **conversionReportTime** | **NSString***| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to @&quot;TIME_OF_AD_ACTION&quot;]

### Return type

[**NSArray<OAICampaignsAnalyticsResponseInner>***](OAICampaignsAnalyticsResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaignsCreate**
```objc
-(NSURLSessionTask*) campaignsCreateWithAdAccountId: (NSString*) adAccountId
    campaignCreateRequest: (NSArray<OAICampaignCreateRequest>*) campaignCreateRequest
        completionHandler: (void (^)(OAICampaignCreateResponse* output, NSError* error)) handler;
```

Create campaigns

Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSArray<OAICampaignCreateRequest>* campaignCreateRequest = @[[[OAICampaignCreateRequest alloc] init]]; // Array of campaigns.

OAICampaignsApi*apiInstance = [[OAICampaignsApi alloc] init];

// Create campaigns
[apiInstance campaignsCreateWithAdAccountId:adAccountId
              campaignCreateRequest:campaignCreateRequest
          completionHandler: ^(OAICampaignCreateResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICampaignsApi->campaignsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **campaignCreateRequest** | [**NSArray&lt;OAICampaignCreateRequest&gt;***](OAICampaignCreateRequest.md)| Array of campaigns. | 

### Return type

[**OAICampaignCreateResponse***](OAICampaignCreateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaignsGet**
```objc
-(NSURLSessionTask*) campaignsGetWithAdAccountId: (NSString*) adAccountId
    campaignId: (NSString*) campaignId
        completionHandler: (void (^)(OAICampaignResponse* output, NSError* error)) handler;
```

Get campaign

Get a specific campaign given the campaign ID.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* campaignId = @"campaignId_example"; // Campaign ID, must be associated with the ad account ID provided in the path.

OAICampaignsApi*apiInstance = [[OAICampaignsApi alloc] init];

// Get campaign
[apiInstance campaignsGetWithAdAccountId:adAccountId
              campaignId:campaignId
          completionHandler: ^(OAICampaignResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICampaignsApi->campaignsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **campaignId** | **NSString***| Campaign ID, must be associated with the ad account ID provided in the path. | 

### Return type

[**OAICampaignResponse***](OAICampaignResponse.md)

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
        completionHandler: (void (^)(OAICampaignsList200Response* output, NSError* error)) handler;
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
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* order = ASCENDING; // The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)

OAICampaignsApi*apiInstance = [[OAICampaignsApi alloc] init];

// List campaigns
[apiInstance campaignsListWithAdAccountId:adAccountId
              campaignIds:campaignIds
              entityStatuses:entityStatuses
              pageSize:pageSize
              order:order
              bookmark:bookmark
          completionHandler: ^(OAICampaignsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICampaignsApi->campaignsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **campaignIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **entityStatuses** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Entity status | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **order** | **NSString***| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 

### Return type

[**OAICampaignsList200Response***](OAICampaignsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaignsUpdate**
```objc
-(NSURLSessionTask*) campaignsUpdateWithAdAccountId: (NSString*) adAccountId
    campaignUpdateRequest: (NSArray<OAICampaignUpdateRequest>*) campaignUpdateRequest
        completionHandler: (void (^)(OAICampaignUpdateResponse* output, NSError* error)) handler;
```

Update campaigns

Update multiple ad campaigns based on campaign_ids. <p/> <strong>Note:</strong><p/> - <p>The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSArray<OAICampaignUpdateRequest>* campaignUpdateRequest = @[[[OAICampaignUpdateRequest alloc] init]]; // Array of campaigns.

OAICampaignsApi*apiInstance = [[OAICampaignsApi alloc] init];

// Update campaigns
[apiInstance campaignsUpdateWithAdAccountId:adAccountId
              campaignUpdateRequest:campaignUpdateRequest
          completionHandler: ^(OAICampaignUpdateResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICampaignsApi->campaignsUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **campaignUpdateRequest** | [**NSArray&lt;OAICampaignUpdateRequest&gt;***](OAICampaignUpdateRequest.md)| Array of campaigns. | 

### Return type

[**OAICampaignUpdateResponse***](OAICampaignUpdateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

