# OAIProductGroupPromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productGroupPromotionsCreate**](OAIProductGroupPromotionsApi.md#productgrouppromotionscreate) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions
[**productGroupPromotionsGet**](OAIProductGroupPromotionsApi.md#productgrouppromotionsget) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id
[**productGroupPromotionsList**](OAIProductGroupPromotionsApi.md#productgrouppromotionslist) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions
[**productGroupPromotionsUpdate**](OAIProductGroupPromotionsApi.md#productgrouppromotionsupdate) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions
[**productGroupsAnalytics**](OAIProductGroupPromotionsApi.md#productgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics


# **productGroupPromotionsCreate**
```objc
-(NSURLSessionTask*) productGroupPromotionsCreateWithAdAccountId: (NSString*) adAccountId
    productGroupPromotionCreateRequest: (OAIProductGroupPromotionCreateRequest*) productGroupPromotionCreateRequest
        completionHandler: (void (^)(OAIProductGroupPromotionResponse* output, NSError* error)) handler;
```

Create product group promotions

Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAIProductGroupPromotionCreateRequest* productGroupPromotionCreateRequest = [[OAIProductGroupPromotionCreateRequest alloc] init]; // List of Product Group Promotions to create, size limit [1, 30].

OAIProductGroupPromotionsApi*apiInstance = [[OAIProductGroupPromotionsApi alloc] init];

// Create product group promotions
[apiInstance productGroupPromotionsCreateWithAdAccountId:adAccountId
              productGroupPromotionCreateRequest:productGroupPromotionCreateRequest
          completionHandler: ^(OAIProductGroupPromotionResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProductGroupPromotionsApi->productGroupPromotionsCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **productGroupPromotionCreateRequest** | [**OAIProductGroupPromotionCreateRequest***](OAIProductGroupPromotionCreateRequest.md)| List of Product Group Promotions to create, size limit [1, 30]. | 

### Return type

[**OAIProductGroupPromotionResponse***](OAIProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **productGroupPromotionsGet**
```objc
-(NSURLSessionTask*) productGroupPromotionsGetWithAdAccountId: (NSString*) adAccountId
    productGroupPromotionId: (NSString*) productGroupPromotionId
        completionHandler: (void (^)(OAIProductGroupPromotionResponse* output, NSError* error)) handler;
```

Get a product group promotion by id

Get a product group promotion by id

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSString* productGroupPromotionId = @"productGroupPromotionId_example"; // Unique identifier of a product group promotion

OAIProductGroupPromotionsApi*apiInstance = [[OAIProductGroupPromotionsApi alloc] init];

// Get a product group promotion by id
[apiInstance productGroupPromotionsGetWithAdAccountId:adAccountId
              productGroupPromotionId:productGroupPromotionId
          completionHandler: ^(OAIProductGroupPromotionResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProductGroupPromotionsApi->productGroupPromotionsGet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **productGroupPromotionId** | **NSString***| Unique identifier of a product group promotion | 

### Return type

[**OAIProductGroupPromotionResponse***](OAIProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **productGroupPromotionsList**
```objc
-(NSURLSessionTask*) productGroupPromotionsListWithAdAccountId: (NSString*) adAccountId
    productGroupPromotionIds: (NSArray<NSString*>*) productGroupPromotionIds
    entityStatuses: (NSArray<NSString*>*) entityStatuses
    adGroupId: (NSString*) adGroupId
    pageSize: (NSNumber*) pageSize
    order: (NSString*) order
    bookmark: (NSString*) bookmark
        completionHandler: (void (^)(OAIProductGroupPromotionsList200Response* output, NSError* error)) handler;
```

Get product group promotions

List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSArray<NSString*>* productGroupPromotionIds = @[@"productGroupPromotionIds_example"]; // List of Product group promotion Ids. (optional)
NSArray<NSString*>* entityStatuses = @[@"entityStatuses_example"]; // Entity status (optional)
NSString* adGroupId = 123123123; // Ad group Id. (optional)
NSNumber* pageSize = @25; // Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to @25)
NSString* order = ASCENDING; // The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
NSString* bookmark = @"bookmark_example"; // Cursor used to fetch the next page of items (optional)

OAIProductGroupPromotionsApi*apiInstance = [[OAIProductGroupPromotionsApi alloc] init];

// Get product group promotions
[apiInstance productGroupPromotionsListWithAdAccountId:adAccountId
              productGroupPromotionIds:productGroupPromotionIds
              entityStatuses:entityStatuses
              adGroupId:adGroupId
              pageSize:pageSize
              order:order
              bookmark:bookmark
          completionHandler: ^(OAIProductGroupPromotionsList200Response* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProductGroupPromotionsApi->productGroupPromotionsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **productGroupPromotionIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Product group promotion Ids. | [optional] 
 **entityStatuses** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Entity status | [optional] 
 **adGroupId** | **NSString***| Ad group Id. | [optional] 
 **pageSize** | **NSNumber***| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to @25]
 **order** | **NSString***| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **NSString***| Cursor used to fetch the next page of items | [optional] 

### Return type

[**OAIProductGroupPromotionsList200Response***](OAIProductGroupPromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **productGroupPromotionsUpdate**
```objc
-(NSURLSessionTask*) productGroupPromotionsUpdateWithAdAccountId: (NSString*) adAccountId
    productGroupPromotionUpdateRequest: (OAIProductGroupPromotionUpdateRequest*) productGroupPromotionUpdateRequest
        completionHandler: (void (^)(OAIProductGroupPromotionResponse* output, NSError* error)) handler;
```

Update product group promotions

Update multiple existing Product Group Promotions (by product_group_id)

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
OAIProductGroupPromotionUpdateRequest* productGroupPromotionUpdateRequest = [[OAIProductGroupPromotionUpdateRequest alloc] init]; // Parameters to update Product group promotions

OAIProductGroupPromotionsApi*apiInstance = [[OAIProductGroupPromotionsApi alloc] init];

// Update product group promotions
[apiInstance productGroupPromotionsUpdateWithAdAccountId:adAccountId
              productGroupPromotionUpdateRequest:productGroupPromotionUpdateRequest
          completionHandler: ^(OAIProductGroupPromotionResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProductGroupPromotionsApi->productGroupPromotionsUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **productGroupPromotionUpdateRequest** | [**OAIProductGroupPromotionUpdateRequest***](OAIProductGroupPromotionUpdateRequest.md)| Parameters to update Product group promotions | 

### Return type

[**OAIProductGroupPromotionResponse***](OAIProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **productGroupsAnalytics**
```objc
-(NSURLSessionTask*) productGroupsAnalyticsWithAdAccountId: (NSString*) adAccountId
    startDate: (NSDate*) startDate
    endDate: (NSDate*) endDate
    productGroupIds: (NSArray<NSString*>*) productGroupIds
    columns: (NSArray<NSString*>*) columns
    granularity: (OAIGranularity) granularity
    clickWindowDays: (NSNumber*) clickWindowDays
    engagementWindowDays: (NSNumber*) engagementWindowDays
    viewWindowDays: (NSNumber*) viewWindowDays
    conversionReportTime: (NSString*) conversionReportTime
        completionHandler: (void (^)(NSArray<OAIProductGroupAnalyticsResponseInner>* output, NSError* error)) handler;
```

Get product group analytics

Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* adAccountId = @"adAccountId_example"; // Unique identifier of an ad account.
NSDate* startDate = @"2013-10-20T19:20:30+01:00"; // Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
NSDate* endDate = @"2013-10-20T19:20:30+01:00"; // Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
NSArray<NSString*>* productGroupIds = @[@"productGroupIds_example"]; // List of Product group Ids to use to filter the results.
NSArray<NSString*>* columns = @[@"columns_example"]; // Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
OAIGranularity granularity = DAY; // TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
NSNumber* clickWindowDays = 1; // Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to @30)
NSNumber* engagementWindowDays = @30; // Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to @30)
NSNumber* viewWindowDays = @1; // Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to @1)
NSString* conversionReportTime = TIME_OF_AD_ACTION; // The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to @"TIME_OF_AD_ACTION")

OAIProductGroupPromotionsApi*apiInstance = [[OAIProductGroupPromotionsApi alloc] init];

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
          completionHandler: ^(NSArray<OAIProductGroupAnalyticsResponseInner>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProductGroupPromotionsApi->productGroupsAnalytics: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **NSString***| Unique identifier of an ad account. | 
 **startDate** | **NSDate***| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **NSDate***| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **productGroupIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| List of Product group Ids to use to filter the results. | 
 **columns** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**OAIGranularity**](.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
 **clickWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
 **engagementWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
 **viewWindowDays** | **NSNumber***| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to @1]
 **conversionReportTime** | **NSString***| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to @&quot;TIME_OF_AD_ACTION&quot;]

### Return type

[**NSArray<OAIProductGroupAnalyticsResponseInner>***](OAIProductGroupAnalyticsResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

