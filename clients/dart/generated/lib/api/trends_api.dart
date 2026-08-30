//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class TrendsApi {
  TrendsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Returns editorial articles for a given region
  ///
  ///   Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [ProductCategoryRegion] region (required):
  ///        The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
  Future<Response> trendsEditorialArticlesListWithHttpInfo(ProductCategoryRegion region, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/trends/editorial_articles';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'region', region));

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Returns editorial articles for a given region
  ///
  ///   Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.
  ///
  /// Parameters:
  ///
  /// * [ProductCategoryRegion] region (required):
  ///        The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
  Future<List<TrendsEditorial>?> trendsEditorialArticlesList(ProductCategoryRegion region, { Future<void>? abortTrigger, }) async {
    final response = await trendsEditorialArticlesListWithHttpInfo(region, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<TrendsEditorial>') as List)
        .cast<TrendsEditorial>()
        .toList(growable: false);

    }
    return null;
  }

  /// Get featured topics
  ///
  ///   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [ProductCategoryRegion] region (required):
  ///        The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
  ///
  /// * [InterestsEnum] interest:
  ///   Interest to filter by
  Future<Response> trendsFeaturedTopicsListWithHttpInfo(ProductCategoryRegion region, { InterestsEnum? interest, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/trends/topics/featured';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (interest != null) {
      queryParams.addAll(_queryParams('', 'interest', interest));
    }
      queryParams.addAll(_queryParams('', 'region', region));

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Get featured topics
  ///
  ///   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
  ///
  /// Parameters:
  ///
  /// * [ProductCategoryRegion] region (required):
  ///        The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
  ///
  /// * [InterestsEnum] interest:
  ///   Interest to filter by
  Future<List<FeaturedTrend>?> trendsFeaturedTopicsList(ProductCategoryRegion region, { InterestsEnum? interest, Future<void>? abortTrigger, }) async {
    final response = await trendsFeaturedTopicsListWithHttpInfo(region, interest: interest, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<FeaturedTrend>') as List)
        .cast<FeaturedTrend>()
        .toList(growable: false);

    }
    return null;
  }

  /// Get product category details
  ///
  ///   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [List<ProductCategoryEnum>] productCategories (required):
  ///   List of product categories
  ///
  /// * [ProductCategoryRegion] region (required):
  ///        The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
  ///
  /// * [ProductCategoryDetailLookbackWindow] lookbackWindow:
  ///     Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years)
  ///
  /// * [ProductCategoriesEngagementType] engagementType:
  ///       Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
  Future<Response> trendsProductCategoriesDetailsListWithHttpInfo(List<ProductCategoryEnum> productCategories, ProductCategoryRegion region, { ProductCategoryDetailLookbackWindow? lookbackWindow, ProductCategoriesEngagementType? engagementType, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/trends/product_categories/details';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('multi', 'product_categories', productCategories));
      queryParams.addAll(_queryParams('', 'region', region));
    if (lookbackWindow != null) {
      queryParams.addAll(_queryParams('', 'lookback_window', lookbackWindow));
    }
    if (engagementType != null) {
      queryParams.addAll(_queryParams('', 'engagement_type', engagementType));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Get product category details
  ///
  ///   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
  ///
  /// Parameters:
  ///
  /// * [List<ProductCategoryEnum>] productCategories (required):
  ///   List of product categories
  ///
  /// * [ProductCategoryRegion] region (required):
  ///        The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
  ///
  /// * [ProductCategoryDetailLookbackWindow] lookbackWindow:
  ///     Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years)
  ///
  /// * [ProductCategoriesEngagementType] engagementType:
  ///       Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
  Future<List<ProductCategoryDetails>?> trendsProductCategoriesDetailsList(List<ProductCategoryEnum> productCategories, ProductCategoryRegion region, { ProductCategoryDetailLookbackWindow? lookbackWindow, ProductCategoriesEngagementType? engagementType, Future<void>? abortTrigger, }) async {
    final response = await trendsProductCategoriesDetailsListWithHttpInfo(productCategories, region, lookbackWindow: lookbackWindow, engagementType: engagementType, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<ProductCategoryDetails>') as List)
        .cast<ProductCategoryDetails>()
        .toList(growable: false);

    }
    return null;
  }

  /// Get a list of growing Shopping Product Categories
  ///
  ///   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [ProductCategoryRegion] region (required):
  ///        The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
  ///
  /// * [List<VerticalProductCategory>] verticals:
  ///   List of verticals to filter by
  ///
  /// * [List<AgeTrendsBucket>] ages:
  ///   Age to filter by. If not provided, the results will be filtered by all ages.
  ///
  /// * [List<GenderBucket>] genders:
  ///   Gender to filter by, If not provided, the results will be filtered by all genders.
  ///
  /// * [ProductCategoriesEngagementType] engagementType:
  ///       Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
  Future<Response> trendsProductCategoriesTrendingListWithHttpInfo(ProductCategoryRegion region, { List<VerticalProductCategory>? verticals, List<AgeTrendsBucket>? ages, List<GenderBucket>? genders, ProductCategoriesEngagementType? engagementType, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/trends/product_categories/trending';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'region', region));
    if (verticals != null) {
      queryParams.addAll(_queryParams('multi', 'verticals', verticals));
    }
    if (ages != null) {
      queryParams.addAll(_queryParams('multi', 'ages', ages));
    }
    if (genders != null) {
      queryParams.addAll(_queryParams('multi', 'genders', genders));
    }
    if (engagementType != null) {
      queryParams.addAll(_queryParams('', 'engagement_type', engagementType));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Get a list of growing Shopping Product Categories
  ///
  ///   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
  ///
  /// Parameters:
  ///
  /// * [ProductCategoryRegion] region (required):
  ///        The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
  ///
  /// * [List<VerticalProductCategory>] verticals:
  ///   List of verticals to filter by
  ///
  /// * [List<AgeTrendsBucket>] ages:
  ///   Age to filter by. If not provided, the results will be filtered by all ages.
  ///
  /// * [List<GenderBucket>] genders:
  ///   Gender to filter by, If not provided, the results will be filtered by all genders.
  ///
  /// * [ProductCategoriesEngagementType] engagementType:
  ///       Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
  Future<List<TrendingProductCategory>?> trendsProductCategoriesTrendingList(ProductCategoryRegion region, { List<VerticalProductCategory>? verticals, List<AgeTrendsBucket>? ages, List<GenderBucket>? genders, ProductCategoriesEngagementType? engagementType, Future<void>? abortTrigger, }) async {
    final response = await trendsProductCategoriesTrendingListWithHttpInfo(region, verticals: verticals, ages: ages, genders: genders, engagementType: engagementType, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<TrendingProductCategory>') as List)
        .cast<TrendingProductCategory>()
        .toList(growable: false);

    }
    return null;
  }
}
