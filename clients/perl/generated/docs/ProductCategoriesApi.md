# WWW::OpenAPIClient::ProductCategoriesApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ProductCategoriesApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**trends_featured_topics_list**](ProductCategoriesApi.md#trends_featured_topics_list) | **GET** /trends/topics/featured | Get featured topics
[**trends_product_categories_details_list**](ProductCategoriesApi.md#trends_product_categories_details_list) | **GET** /trends/product_categories/details | Get product category details
[**trends_product_categories_trending_list**](ProductCategoriesApi.md#trends_product_categories_trending_list) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories


# **trends_featured_topics_list**
> ARRAY[FeaturedTrend] trends_featured_topics_list(region => $region, interest => $interest)

Get featured topics

  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProductCategoriesApi;
my $api_instance = WWW::OpenAPIClient::ProductCategoriesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $region = new WWW::OpenAPIClient.ProductCategoryRegion(); # ProductCategoryRegion |       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
my $interest = new WWW::OpenAPIClient.InterestsEnum(); # InterestsEnum | Interest to filter by

eval {
    my $result = $api_instance->trends_featured_topics_list(region => $region, interest => $interest);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductCategoriesApi->trends_featured_topics_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**ProductCategoryRegion**](.md)|       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **interest** | [**InterestsEnum**](.md)| Interest to filter by | [optional] 

### Return type

[**ARRAY[FeaturedTrend]**](FeaturedTrend.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **trends_product_categories_details_list**
> ARRAY[ProductCategoryDetails] trends_product_categories_details_list(product_categories => $product_categories, region => $region, lookback_window => $lookback_window, engagement_type => $engagement_type)

Get product category details

  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProductCategoriesApi;
my $api_instance = WWW::OpenAPIClient::ProductCategoriesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $product_categories = [(new WWW::OpenAPIClient.ProductCategoryEnum())]; # ARRAY[ProductCategoryEnum] | List of product categories
my $region = new WWW::OpenAPIClient.ProductCategoryRegion(); # ProductCategoryRegion |       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
my $lookback_window = new WWW::OpenAPIClient.ProductCategoryDetailLookbackWindow(); # ProductCategoryDetailLookbackWindow |    Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years)
my $engagement_type = new WWW::OpenAPIClient.ProductCategoriesEngagementType(); # ProductCategoriesEngagementType |      Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves

eval {
    my $result = $api_instance->trends_product_categories_details_list(product_categories => $product_categories, region => $region, lookback_window => $lookback_window, engagement_type => $engagement_type);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductCategoriesApi->trends_product_categories_details_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_categories** | [**ARRAY[ProductCategoryEnum]**](ProductCategoryEnum.md)| List of product categories | 
 **region** | [**ProductCategoryRegion**](.md)|       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **lookback_window** | [**ProductCategoryDetailLookbackWindow**](.md)|    Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years) | [optional] 
 **engagement_type** | [**ProductCategoriesEngagementType**](.md)|      Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] 

### Return type

[**ARRAY[ProductCategoryDetails]**](ProductCategoryDetails.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **trends_product_categories_trending_list**
> ARRAY[TrendingProductCategory] trends_product_categories_trending_list(region => $region, verticals => $verticals, ages => $ages, genders => $genders, engagement_type => $engagement_type)

Get a list of growing Shopping Product Categories

  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProductCategoriesApi;
my $api_instance = WWW::OpenAPIClient::ProductCategoriesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $region = new WWW::OpenAPIClient.ProductCategoryRegion(); # ProductCategoryRegion |       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
my $verticals = [(new WWW::OpenAPIClient.VerticalProductCategory())]; # ARRAY[VerticalProductCategory] | List of verticals to filter by
my $ages = [(new WWW::OpenAPIClient.AgeTrendsBucket())]; # ARRAY[AgeTrendsBucket] | Age to filter by. If not provided, the results will be filtered by all ages.
my $genders = [(new WWW::OpenAPIClient.GenderBucket())]; # ARRAY[GenderBucket] | Gender to filter by, If not provided, the results will be filtered by all genders.
my $engagement_type = new WWW::OpenAPIClient.ProductCategoriesEngagementType(); # ProductCategoriesEngagementType |      Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves

eval {
    my $result = $api_instance->trends_product_categories_trending_list(region => $region, verticals => $verticals, ages => $ages, genders => $genders, engagement_type => $engagement_type);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductCategoriesApi->trends_product_categories_trending_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**ProductCategoryRegion**](.md)|       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **verticals** | [**ARRAY[VerticalProductCategory]**](VerticalProductCategory.md)| List of verticals to filter by | [optional] 
 **ages** | [**ARRAY[AgeTrendsBucket]**](AgeTrendsBucket.md)| Age to filter by. If not provided, the results will be filtered by all ages. | [optional] 
 **genders** | [**ARRAY[GenderBucket]**](GenderBucket.md)| Gender to filter by, If not provided, the results will be filtered by all genders. | [optional] 
 **engagement_type** | [**ProductCategoriesEngagementType**](.md)|      Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] 

### Return type

[**ARRAY[TrendingProductCategory]**](TrendingProductCategory.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

