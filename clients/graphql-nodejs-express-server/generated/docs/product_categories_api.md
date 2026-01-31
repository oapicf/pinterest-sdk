# product_categories_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TrendsFeaturedTopicsList**](product_categories_api.md#TrendsFeaturedTopicsList) | **GET** /trends/topics/featured | Get featured topics
[**TrendsProductCategoriesDetailsList**](product_categories_api.md#TrendsProductCategoriesDetailsList) | **GET** /trends/product_categories/details | Get product category details
[**TrendsProductCategoriesTrendingList**](product_categories_api.md#TrendsProductCategoriesTrendingList) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories


<a name="TrendsFeaturedTopicsList"></a>
# **TrendsFeaturedTopicsList**
> FeaturedTrend TrendsFeaturedTopicsList(region, interest)

Get featured topics

  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
<a name="TrendsProductCategoriesDetailsList"></a>
# **TrendsProductCategoriesDetailsList**
> ProductCategoryDetails TrendsProductCategoriesDetailsList(productCategories, region, lookbackWindow, engagementType)

Get product category details

  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
<a name="TrendsProductCategoriesTrendingList"></a>
# **TrendsProductCategoriesTrendingList**
> TrendingProductCategory TrendsProductCategoriesTrendingList(region, verticals, ages, genders, engagementType)

Get a list of growing Shopping Product Categories

  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
