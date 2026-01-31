# OAIProductCategoriesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**trendsFeaturedTopicsList**](OAIProductCategoriesApi.md#trendsfeaturedtopicslist) | **GET** /trends/topics/featured | Get featured topics
[**trendsProductCategoriesDetailsList**](OAIProductCategoriesApi.md#trendsproductcategoriesdetailslist) | **GET** /trends/product_categories/details | Get product category details
[**trendsProductCategoriesTrendingList**](OAIProductCategoriesApi.md#trendsproductcategoriestrendinglist) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories


# **trendsFeaturedTopicsList**
```objc
-(NSURLSessionTask*) trendsFeaturedTopicsListWithRegion: (OAIProductCategoryRegion) region
    interest: (OAIInterestsEnum) interest
        completionHandler: (void (^)(NSArray<OAIFeaturedTrend>* output, NSError* error)) handler;
```

Get featured topics

  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIProductCategoryRegion region = [[OAIProductCategoryRegion alloc] init]; //       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
OAIInterestsEnum interest = [[OAIInterestsEnum alloc] init]; // Interest to filter by (optional)

OAIProductCategoriesApi*apiInstance = [[OAIProductCategoriesApi alloc] init];

// Get featured topics
[apiInstance trendsFeaturedTopicsListWithRegion:region
              interest:interest
          completionHandler: ^(NSArray<OAIFeaturedTrend>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProductCategoriesApi->trendsFeaturedTopicsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**OAIProductCategoryRegion**](.md)|       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **interest** | [**OAIInterestsEnum**](.md)| Interest to filter by | [optional] 

### Return type

[**NSArray<OAIFeaturedTrend>***](OAIFeaturedTrend.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **trendsProductCategoriesDetailsList**
```objc
-(NSURLSessionTask*) trendsProductCategoriesDetailsListWithProductCategories: (NSArray<OAIProductCategoryEnum>*) productCategories
    region: (OAIProductCategoryRegion) region
    lookbackWindow: (OAIProductCategoryDetailLookbackWindow) lookbackWindow
    engagementType: (OAIProductCategoriesEngagementType) engagementType
        completionHandler: (void (^)(NSArray<OAIProductCategoryDetails>* output, NSError* error)) handler;
```

Get product category details

  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSArray<OAIProductCategoryEnum>* productCategories = @[[[OAIProductCategoryEnum alloc] init]]; // List of product categories
OAIProductCategoryRegion region = [[OAIProductCategoryRegion alloc] init]; //       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
OAIProductCategoryDetailLookbackWindow lookbackWindow = [[OAIProductCategoryDetailLookbackWindow alloc] init]; //    Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years) (optional)
OAIProductCategoriesEngagementType engagementType = [[OAIProductCategoriesEngagementType alloc] init]; //      Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves (optional)

OAIProductCategoriesApi*apiInstance = [[OAIProductCategoriesApi alloc] init];

// Get product category details
[apiInstance trendsProductCategoriesDetailsListWithProductCategories:productCategories
              region:region
              lookbackWindow:lookbackWindow
              engagementType:engagementType
          completionHandler: ^(NSArray<OAIProductCategoryDetails>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProductCategoriesApi->trendsProductCategoriesDetailsList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productCategories** | [**NSArray&lt;OAIProductCategoryEnum&gt;***](OAIProductCategoryEnum*.md)| List of product categories | 
 **region** | [**OAIProductCategoryRegion**](.md)|       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **lookbackWindow** | [**OAIProductCategoryDetailLookbackWindow**](.md)|    Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years) | [optional] 
 **engagementType** | [**OAIProductCategoriesEngagementType**](.md)|      Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] 

### Return type

[**NSArray<OAIProductCategoryDetails>***](OAIProductCategoryDetails.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **trendsProductCategoriesTrendingList**
```objc
-(NSURLSessionTask*) trendsProductCategoriesTrendingListWithRegion: (OAIProductCategoryRegion) region
    verticals: (NSArray<OAIVerticalProductCategory>*) verticals
    ages: (NSArray<OAIAgeTrendsBucket>*) ages
    genders: (NSArray<OAIGenderBucket>*) genders
    engagementType: (OAIProductCategoriesEngagementType) engagementType
        completionHandler: (void (^)(NSArray<OAITrendingProductCategory>* output, NSError* error)) handler;
```

Get a list of growing Shopping Product Categories

  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIProductCategoryRegion region = [[OAIProductCategoryRegion alloc] init]; //       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
NSArray<OAIVerticalProductCategory>* verticals = @[[[OAIVerticalProductCategory alloc] init]]; // List of verticals to filter by (optional)
NSArray<OAIAgeTrendsBucket>* ages = @[[[OAIAgeTrendsBucket alloc] init]]; // Age to filter by. If not provided, the results will be filtered by all ages. (optional)
NSArray<OAIGenderBucket>* genders = @[[[OAIGenderBucket alloc] init]]; // Gender to filter by, If not provided, the results will be filtered by all genders. (optional)
OAIProductCategoriesEngagementType engagementType = [[OAIProductCategoriesEngagementType alloc] init]; //      Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves (optional)

OAIProductCategoriesApi*apiInstance = [[OAIProductCategoriesApi alloc] init];

// Get a list of growing Shopping Product Categories
[apiInstance trendsProductCategoriesTrendingListWithRegion:region
              verticals:verticals
              ages:ages
              genders:genders
              engagementType:engagementType
          completionHandler: ^(NSArray<OAITrendingProductCategory>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProductCategoriesApi->trendsProductCategoriesTrendingList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**OAIProductCategoryRegion**](.md)|       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **verticals** | [**NSArray&lt;OAIVerticalProductCategory&gt;***](OAIVerticalProductCategory*.md)| List of verticals to filter by | [optional] 
 **ages** | [**NSArray&lt;OAIAgeTrendsBucket&gt;***](OAIAgeTrendsBucket*.md)| Age to filter by. If not provided, the results will be filtered by all ages. | [optional] 
 **genders** | [**NSArray&lt;OAIGenderBucket&gt;***](OAIGenderBucket*.md)| Gender to filter by, If not provided, the results will be filtered by all genders. | [optional] 
 **engagementType** | [**OAIProductCategoriesEngagementType**](.md)|      Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] 

### Return type

[**NSArray<OAITrendingProductCategory>***](OAITrendingProductCategory.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

