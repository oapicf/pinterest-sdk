//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class ProductGroupPromotionsApi {
  ProductGroupPromotionsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Create product group promotions
  ///
  /// Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [ProductGroupPromotionCreateRequest] productGroupPromotionCreateRequest (required):
  ///   List of Product Group Promotions to create, size limit [1, 30].
  Future<Response> productGroupPromotionsCreateWithHttpInfo(String adAccountId, ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/product_group_promotions'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = productGroupPromotionCreateRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Create product group promotions
  ///
  /// Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [ProductGroupPromotionCreateRequest] productGroupPromotionCreateRequest (required):
  ///   List of Product Group Promotions to create, size limit [1, 30].
  Future<ProductGroupPromotionResponse?> productGroupPromotionsCreate(String adAccountId, ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest,) async {
    final response = await productGroupPromotionsCreateWithHttpInfo(adAccountId, productGroupPromotionCreateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ProductGroupPromotionResponse',) as ProductGroupPromotionResponse;
    
    }
    return null;
  }

  /// Get a product group promotion by id
  ///
  /// Get a product group promotion by id
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] productGroupPromotionId (required):
  ///   Unique identifier of a product group promotion
  Future<Response> productGroupPromotionsGetWithHttpInfo(String adAccountId, String productGroupPromotionId,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}'
      .replaceAll('{ad_account_id}', adAccountId)
      .replaceAll('{product_group_promotion_id}', productGroupPromotionId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Get a product group promotion by id
  ///
  /// Get a product group promotion by id
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] productGroupPromotionId (required):
  ///   Unique identifier of a product group promotion
  Future<ProductGroupPromotion?> productGroupPromotionsGet(String adAccountId, String productGroupPromotionId,) async {
    final response = await productGroupPromotionsGetWithHttpInfo(adAccountId, productGroupPromotionId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ProductGroupPromotion',) as ProductGroupPromotion;
    
    }
    return null;
  }

  /// Get product group promotions
  ///
  /// List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<String>] productGroupPromotionIds:
  ///   List of Product group promotion Ids.
  ///
  /// * [List<String>] entityStatuses:
  ///   Entity status
  ///
  /// * [String] adGroupId:
  ///   Ad group Id.
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] order:
  ///   The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<Response> productGroupPromotionsListWithHttpInfo(String adAccountId, { List<String>? productGroupPromotionIds, List<String>? entityStatuses, String? adGroupId, int? pageSize, String? order, String? bookmark, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/product_group_promotions'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (productGroupPromotionIds != null) {
      queryParams.addAll(_queryParams('multi', 'product_group_promotion_ids', productGroupPromotionIds));
    }
    if (entityStatuses != null) {
      queryParams.addAll(_queryParams('multi', 'entity_statuses', entityStatuses));
    }
    if (adGroupId != null) {
      queryParams.addAll(_queryParams('', 'ad_group_id', adGroupId));
    }
    if (pageSize != null) {
      queryParams.addAll(_queryParams('', 'page_size', pageSize));
    }
    if (order != null) {
      queryParams.addAll(_queryParams('', 'order', order));
    }
    if (bookmark != null) {
      queryParams.addAll(_queryParams('', 'bookmark', bookmark));
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
    );
  }

  /// Get product group promotions
  ///
  /// List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<String>] productGroupPromotionIds:
  ///   List of Product group promotion Ids.
  ///
  /// * [List<String>] entityStatuses:
  ///   Entity status
  ///
  /// * [String] adGroupId:
  ///   Ad group Id.
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] order:
  ///   The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<ProductGroupPromotionsList200Response?> productGroupPromotionsList(String adAccountId, { List<String>? productGroupPromotionIds, List<String>? entityStatuses, String? adGroupId, int? pageSize, String? order, String? bookmark, }) async {
    final response = await productGroupPromotionsListWithHttpInfo(adAccountId,  productGroupPromotionIds: productGroupPromotionIds, entityStatuses: entityStatuses, adGroupId: adGroupId, pageSize: pageSize, order: order, bookmark: bookmark, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ProductGroupPromotionsList200Response',) as ProductGroupPromotionsList200Response;
    
    }
    return null;
  }

  /// Update product group promotions
  ///
  /// Update multiple existing Product Group Promotions (by product_group_id)
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [ProductGroupPromotionUpdateRequest] productGroupPromotionUpdateRequest (required):
  ///   Parameters to update Product group promotions
  Future<Response> productGroupPromotionsUpdateWithHttpInfo(String adAccountId, ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/product_group_promotions'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = productGroupPromotionUpdateRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'PATCH',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Update product group promotions
  ///
  /// Update multiple existing Product Group Promotions (by product_group_id)
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [ProductGroupPromotionUpdateRequest] productGroupPromotionUpdateRequest (required):
  ///   Parameters to update Product group promotions
  Future<ProductGroupPromotionResponse?> productGroupPromotionsUpdate(String adAccountId, ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest,) async {
    final response = await productGroupPromotionsUpdateWithHttpInfo(adAccountId, productGroupPromotionUpdateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ProductGroupPromotionResponse',) as ProductGroupPromotionResponse;
    
    }
    return null;
  }

  /// Get product group analytics
  ///
  /// Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [DateTime] startDate (required):
  ///   Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  ///
  /// * [DateTime] endDate (required):
  ///   Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  ///
  /// * [List<String>] productGroupIds (required):
  ///   List of Product group Ids to use to filter the results.
  ///
  /// * [List<String>] columns (required):
  ///   Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
  ///
  /// * [Granularity] granularity (required):
  ///   TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
  ///
  /// * [int] clickWindowDays:
  ///   Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  ///
  /// * [int] engagementWindowDays:
  ///   Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.<br> <strong>Note:</strong> This parameter no longer returns new data. However, you can still access historic data through <strong>Sept 30, 2027</strong>.
  ///
  /// * [int] viewWindowDays:
  ///   Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  ///
  /// * [String] conversionReportTime:
  ///   The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  ///
  /// * [ReportingTimeZone] reportingTimezone:
  ///   Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
  Future<Response> productGroupsAnalyticsWithHttpInfo(String adAccountId, DateTime startDate, DateTime endDate, List<String> productGroupIds, List<String> columns, Granularity granularity, { int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, String? conversionReportTime, ReportingTimeZone? reportingTimezone, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/product_groups/analytics'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'start_date', startDate));
      queryParams.addAll(_queryParams('', 'end_date', endDate));
      queryParams.addAll(_queryParams('multi', 'product_group_ids', productGroupIds));
      queryParams.addAll(_queryParams('csv', 'columns', columns));
      queryParams.addAll(_queryParams('', 'granularity', granularity));
    if (clickWindowDays != null) {
      queryParams.addAll(_queryParams('', 'click_window_days', clickWindowDays));
    }
    if (engagementWindowDays != null) {
      queryParams.addAll(_queryParams('', 'engagement_window_days', engagementWindowDays));
    }
    if (viewWindowDays != null) {
      queryParams.addAll(_queryParams('', 'view_window_days', viewWindowDays));
    }
    if (conversionReportTime != null) {
      queryParams.addAll(_queryParams('', 'conversion_report_time', conversionReportTime));
    }
    if (reportingTimezone != null) {
      queryParams.addAll(_queryParams('', 'reporting_timezone', reportingTimezone));
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
    );
  }

  /// Get product group analytics
  ///
  /// Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [DateTime] startDate (required):
  ///   Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  ///
  /// * [DateTime] endDate (required):
  ///   Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  ///
  /// * [List<String>] productGroupIds (required):
  ///   List of Product group Ids to use to filter the results.
  ///
  /// * [List<String>] columns (required):
  ///   Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
  ///
  /// * [Granularity] granularity (required):
  ///   TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
  ///
  /// * [int] clickWindowDays:
  ///   Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  ///
  /// * [int] engagementWindowDays:
  ///   Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.<br> <strong>Note:</strong> This parameter no longer returns new data. However, you can still access historic data through <strong>Sept 30, 2027</strong>.
  ///
  /// * [int] viewWindowDays:
  ///   Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  ///
  /// * [String] conversionReportTime:
  ///   The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  ///
  /// * [ReportingTimeZone] reportingTimezone:
  ///   Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
  Future<List<ProductGroupAnalyticsResponseInner>?> productGroupsAnalytics(String adAccountId, DateTime startDate, DateTime endDate, List<String> productGroupIds, List<String> columns, Granularity granularity, { int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, String? conversionReportTime, ReportingTimeZone? reportingTimezone, }) async {
    final response = await productGroupsAnalyticsWithHttpInfo(adAccountId, startDate, endDate, productGroupIds, columns, granularity,  clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime, reportingTimezone: reportingTimezone, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<ProductGroupAnalyticsResponseInner>') as List)
        .cast<ProductGroupAnalyticsResponseInner>()
        .toList(growable: false);

    }
    return null;
  }
}
