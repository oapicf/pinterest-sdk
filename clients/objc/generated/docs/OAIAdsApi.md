# OAIAdsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adPreviewsCreate**](OAIAdsApi.md#adpreviewscreate) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
[**adTargetingAnalyticsGet**](OAIAdsApi.md#adtargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
[**adsAnalytics**](OAIAdsApi.md#adsanalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**adsCreate**](OAIAdsApi.md#adscreate) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
[**adsGet**](OAIAdsApi.md#adsget) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
[**adsList**](OAIAdsApi.md#adslist) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
[**adsUpdate**](OAIAdsApi.md#adsupdate) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads


# **adPreviewsCreate**
```objc
-(NSURLSessionTask*) adPreviewsCreateWithAdAccountId: (NSString*) adAccountId
    adPreviewRequest: (OAIAdPreviewRequest*) adPreviewRequest
        completionHandler: (void (^)(OAIAdPreviewURLResponse* output, NSError* error)) handler;
```

Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAIAdPreviewRequest* adPreviewRequest = [[OAIAdPreviewRequest alloc] init]; // Create ad preview with pin or image.

OAIAdsApi*apiInstance = [[OAIAdsApi alloc] init];

// Create ad preview with pin or image
[apiInstance adPreviewsCreateWithAdAccountId:adAccountId
              adPreviewRequest:adPreviewRequest
          completionHandler: ^(OAIAdPreviewURLResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdsApi->adPreviewsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **adPreviewRequest** | [**OAIAdPreviewRequest***](OAIAdPreviewRequest.md)| Create ad preview with pin or image. | 

### Return type

[**OAIAdPreviewURLResponse***](OAIAdPreviewURLResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adTargetingAnalyticsGet**
```objc
-(NSURLSessionTask*) adTargetingAnalyticsGetWithAdAccountId: (NSString*) adAccountId
    adIds: (NSArray<NSString*>*) adIds
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

Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSArray<NSString*>* adIds = @[@"adIds_example"]; // List of Ad Ids to use to filter the results.
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

OAIAdsApi*apiInstance = [[OAIAdsApi alloc] init];

// Get targeting analytics for ads
[apiInstance adTargetingAnalyticsGetWithAdAccountId:adAccountId
              adIds:adIds
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
                            NSLog(@"Error calling OAIAdsApi->adTargetingAnalyticsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **adIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Ad Ids to use to filter the results. | 
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

# **adsAnalytics**
```objc
-(NSURLSessionTask*) adsAnalyticsWithAdAccountId: (NSString*) adAccountId
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    adIds: (NSArray<NSString*>*) adIds
    columns: (NSArray<NSString*>*) columns
    granularity: (OAIGranularity) granularity
    clickWindowDays: (NSNumber*) clickWindowDays
    engagementWindowDays: (NSNumber*) engagementWindowDays
    viewWindowDays: (NSNumber*) viewWindowDays
    conversionReportTime: (NSString*) conversionReportTime
        completionHandler: (void (^)(NSArray<OAIAdsAnalyticsResponseInner>* output, NSError* error)) handler;
```

Get ad analytics

Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSDate* startDate = @"2013-10-20T19:20:30+01:00"; // Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
NSDate* endDate = @"2013-10-20T19:20:30+01:00"; // Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
NSArray<NSString*>* adIds = @[@"adIds_example"]; // List of Ad Ids to use to filter the results.
NSArray<NSString*>* columns = @[@"columns_example"]; // Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
OAIGranularity granularity = DAY; // TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
NSNumber* clickWindowDays = 1; // Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to @30)
NSNumber* engagementWindowDays = @30; // Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to @30)
NSNumber* viewWindowDays = @1; // Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to @1)
NSString* conversionReportTime = TIME_OF_AD_ACTION; // The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to @"TIME_OF_AD_ACTION")

OAIAdsApi*apiInstance = [[OAIAdsApi alloc] init];

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
          completionHandler: ^(NSArray<OAIAdsAnalyticsResponseInner>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdsApi->adsAnalytics: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **startDate** | **NSDate***| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **NSDate***| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **adIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Ad Ids to use to filter the results. | 
 **columns** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**OAIGranularity**](.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
 **clickWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
 **engagementWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
 **viewWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to @1]
 **conversionReportTime** | **NSString***| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to @&quot;TIME_OF_AD_ACTION&quot;]

### Return type

[**NSArray<OAIAdsAnalyticsResponseInner>***](OAIAdsAnalyticsResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adsCreate**
```objc
-(NSURLSessionTask*) adsCreateWithAdAccountId: (NSString*) adAccountId
    adCreateRequest: (NSArray<OAIAdCreateRequest>*) adCreateRequest
        completionHandler: (void (^)(OAIAdArrayResponse* output, NSError* error)) handler;
```

Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSArray<OAIAdCreateRequest>* adCreateRequest = @[[[OAIAdCreateRequest alloc] init]]; // List of ads to create, size limit [1, 30].

OAIAdsApi*apiInstance = [[OAIAdsApi alloc] init];

// Create ads
[apiInstance adsCreateWithAdAccountId:adAccountId
              adCreateRequest:adCreateRequest
          completionHandler: ^(OAIAdArrayResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdsApi->adsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **adCreateRequest** | [**NSArray&lt;OAIAdCreateRequest&gt;***](OAIAdCreateRequest.md)| List of ads to create, size limit [1, 30]. | 

### Return type

[**OAIAdArrayResponse***](OAIAdArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adsGet**
```objc
-(NSURLSessionTask*) adsGetWithAdAccountId: (NSString*) adAccountId
    adId: (NSString*) adId
        completionHandler: (void (^)(OAIAdResponse* output, NSError* error)) handler;
```

Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* adId = @"adId_example"; // Unique identifier of an ad.

OAIAdsApi*apiInstance = [[OAIAdsApi alloc] init];

// Get ad
[apiInstance adsGetWithAdAccountId:adAccountId
              adId:adId
          completionHandler: ^(OAIAdResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdsApi->adsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **adId** | **NSString***| Unique identifier of an ad. | 

### Return type

[**OAIAdResponse***](OAIAdResponse.md)

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
        completionHandler: (void (^)(OAIAdsList200Response* output, NSError* error)) handler;
```

List ads

List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.

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
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* order = ASCENDING; // The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)

OAIAdsApi*apiInstance = [[OAIAdsApi alloc] init];

// List ads
[apiInstance adsListWithAdAccountId:adAccountId
              campaignIds:campaignIds
              adGroupIds:adGroupIds
              adIds:adIds
              entityStatuses:entityStatuses
              pageSize:pageSize
              order:order
              bookmark:bookmark
          completionHandler: ^(OAIAdsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdsApi->adsList: %@", error);
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
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **order** | **NSString***| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 

### Return type

[**OAIAdsList200Response***](OAIAdsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adsUpdate**
```objc
-(NSURLSessionTask*) adsUpdateWithAdAccountId: (NSString*) adAccountId
    adUpdateRequest: (NSArray<OAIAdUpdateRequest>*) adUpdateRequest
        completionHandler: (void (^)(OAIAdArrayResponse* output, NSError* error)) handler;
```

Update ads

Update multiple existing ads

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSArray<OAIAdUpdateRequest>* adUpdateRequest = @[[[OAIAdUpdateRequest alloc] init]]; // List of ads to update, size limit [1, 30]

OAIAdsApi*apiInstance = [[OAIAdsApi alloc] init];

// Update ads
[apiInstance adsUpdateWithAdAccountId:adAccountId
              adUpdateRequest:adUpdateRequest
          completionHandler: ^(OAIAdArrayResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAdsApi->adsUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **adUpdateRequest** | [**NSArray&lt;OAIAdUpdateRequest&gt;***](OAIAdUpdateRequest.md)| List of ads to update, size limit [1, 30] | 

### Return type

[**OAIAdArrayResponse***](OAIAdArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

