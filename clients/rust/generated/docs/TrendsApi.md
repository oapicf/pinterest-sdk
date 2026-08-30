# \TrendsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**trends_editorial_articles_slash_list**](TrendsApi.md#trends_editorial_articles_slash_list) | **GET** /trends/editorial_articles | Returns editorial articles for a given region
[**trends_featured_topics_slash_list**](TrendsApi.md#trends_featured_topics_slash_list) | **GET** /trends/topics/featured | Get featured topics
[**trends_product_categories_details_slash_list**](TrendsApi.md#trends_product_categories_details_slash_list) | **GET** /trends/product_categories/details | Get product category details
[**trends_product_categories_trending_slash_list**](TrendsApi.md#trends_product_categories_trending_slash_list) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories



## trends_editorial_articles_slash_list

> Vec<models::TrendsEditorial> trends_editorial_articles_slash_list(region)
Returns editorial articles for a given region

  Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**region** | [**ProductCategoryRegion**](ProductCategoryRegion.md) |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada | [required] |

### Return type

[**Vec<models::TrendsEditorial>**](TrendsEditorial.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## trends_featured_topics_slash_list

> Vec<models::FeaturedTrend> trends_featured_topics_slash_list(region, interest)
Get featured topics

  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**region** | [**ProductCategoryRegion**](ProductCategoryRegion.md) |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada | [required] |
**interest** | Option<[**InterestsEnum**](InterestsEnum.md)> | Interest to filter by |  |

### Return type

[**Vec<models::FeaturedTrend>**](FeaturedTrend.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## trends_product_categories_details_slash_list

> Vec<models::ProductCategoryDetails> trends_product_categories_details_slash_list(product_categories, region, lookback_window, engagement_type)
Get product category details

  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**product_categories** | [**Vec<models::ProductCategoryEnum>**](Models__ProductCategoryEnum.md) | List of product categories | [required] |
**region** | [**ProductCategoryRegion**](ProductCategoryRegion.md) |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada | [required] |
**lookback_window** | Option<[**ProductCategoryDetailLookbackWindow**](ProductCategoryDetailLookbackWindow.md)> |   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years) |  |
**engagement_type** | Option<[**ProductCategoriesEngagementType**](ProductCategoriesEngagementType.md)> |     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves |  |

### Return type

[**Vec<models::ProductCategoryDetails>**](ProductCategoryDetails.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## trends_product_categories_trending_slash_list

> Vec<models::TrendingProductCategory> trends_product_categories_trending_slash_list(region, verticals, ages, genders, engagement_type)
Get a list of growing Shopping Product Categories

  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**region** | [**ProductCategoryRegion**](ProductCategoryRegion.md) |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada | [required] |
**verticals** | Option<[**Vec<models::VerticalProductCategory>**](Models__VerticalProductCategory.md)> | List of verticals to filter by |  |
**ages** | Option<[**Vec<models::AgeTrendsBucket>**](Models__AgeTrendsBucket.md)> | Age to filter by. If not provided, the results will be filtered by all ages. |  |
**genders** | Option<[**Vec<models::GenderBucket>**](Models__GenderBucket.md)> | Gender to filter by, If not provided, the results will be filtered by all genders. |  |
**engagement_type** | Option<[**ProductCategoriesEngagementType**](ProductCategoriesEngagementType.md)> |     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves |  |

### Return type

[**Vec<models::TrendingProductCategory>**](TrendingProductCategory.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

