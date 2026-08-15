//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class AdAccountsApi {
  AdAccountsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Get ad account analytics
  ///
  /// Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.
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
  Future<Response> adAccountAnalyticsWithHttpInfo(String adAccountId, DateTime startDate, DateTime endDate, List<String> columns, Granularity granularity, { int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, String? conversionReportTime, ReportingTimeZone? reportingTimezone, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/analytics'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'start_date', startDate));
      queryParams.addAll(_queryParams('', 'end_date', endDate));
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

  /// Get ad account analytics
  ///
  /// Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.
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
  Future<List<AdAccountAnalyticsResponseInner>?> adAccountAnalytics(String adAccountId, DateTime startDate, DateTime endDate, List<String> columns, Granularity granularity, { int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, String? conversionReportTime, ReportingTimeZone? reportingTimezone, }) async {
    final response = await adAccountAnalyticsWithHttpInfo(adAccountId, startDate, endDate, columns, granularity,  clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime, reportingTimezone: reportingTimezone, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<AdAccountAnalyticsResponseInner>') as List)
        .cast<AdAccountAnalyticsResponseInner>()
        .toList(growable: false);

    }
    return null;
  }

  /// Get targeting analytics for an ad account
  ///
  /// Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
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
  /// * [List<AdsAnalyticsTargetingType>] targetingTypes (required):
  ///   Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
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
  /// * [List<ConversionReportAttributionType>] attributionTypes:
  ///   List of types of attribution for the conversion report
  ///
  /// * [ReportingTimeZone] reportingTimezone:
  ///   Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
  Future<Response> adAccountTargetingAnalyticsGetWithHttpInfo(String adAccountId, DateTime startDate, DateTime endDate, List<AdsAnalyticsTargetingType> targetingTypes, List<String> columns, Granularity granularity, { int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, String? conversionReportTime, List<ConversionReportAttributionType>? attributionTypes, ReportingTimeZone? reportingTimezone, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/targeting_analytics'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'start_date', startDate));
      queryParams.addAll(_queryParams('', 'end_date', endDate));
      queryParams.addAll(_queryParams('csv', 'targeting_types', targetingTypes));
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
    if (attributionTypes != null) {
      queryParams.addAll(_queryParams('csv', 'attribution_types', attributionTypes));
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

  /// Get targeting analytics for an ad account
  ///
  /// Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
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
  /// * [List<AdsAnalyticsTargetingType>] targetingTypes (required):
  ///   Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
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
  /// * [List<ConversionReportAttributionType>] attributionTypes:
  ///   List of types of attribution for the conversion report
  ///
  /// * [ReportingTimeZone] reportingTimezone:
  ///   Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
  Future<MetricsResponse?> adAccountTargetingAnalyticsGet(String adAccountId, DateTime startDate, DateTime endDate, List<AdsAnalyticsTargetingType> targetingTypes, List<String> columns, Granularity granularity, { int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, String? conversionReportTime, List<ConversionReportAttributionType>? attributionTypes, ReportingTimeZone? reportingTimezone, }) async {
    final response = await adAccountTargetingAnalyticsGetWithHttpInfo(adAccountId, startDate, endDate, targetingTypes, columns, granularity,  clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime, attributionTypes: attributionTypes, reportingTimezone: reportingTimezone, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'MetricsResponse',) as MetricsResponse;
    
    }
    return null;
  }

  /// Create ad account
  ///
  /// Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [AdAccountCreate] adAccountCreate (required):
  Future<Response> adAccountsCreateWithHttpInfo(AdAccountCreate adAccountCreate,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts';

    // ignore: prefer_final_locals
    Object? postBody = adAccountCreate;

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

  /// Create ad account
  ///
  /// Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).
  ///
  /// Parameters:
  ///
  /// * [AdAccountCreate] adAccountCreate (required):
  Future<AdAccount?> adAccountsCreate(AdAccountCreate adAccountCreate,) async {
    final response = await adAccountsCreateWithHttpInfo(adAccountCreate,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdAccount',) as AdAccount;
    
    }
    return null;
  }

  /// Get ad account
  ///
  /// Get an ad account
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  Future<Response> adAccountsGetWithHttpInfo(String adAccountId,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}'
      .replaceAll('{ad_account_id}', adAccountId);

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

  /// Get ad account
  ///
  /// Get an ad account
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  Future<AdAccount?> adAccountsGet(String adAccountId,) async {
    final response = await adAccountsGetWithHttpInfo(adAccountId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdAccount',) as AdAccount;
    
    }
    return null;
  }

  /// List ad accounts
  ///
  /// Get a list of the ad_accounts that the \"operation user_account\" has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [bool] includeSharedAccounts:
  ///   Include shared ad accounts
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<Response> adAccountsListWithHttpInfo({ bool? includeSharedAccounts, String? bookmark, int? pageSize, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (includeSharedAccounts != null) {
      queryParams.addAll(_queryParams('', 'include_shared_accounts', includeSharedAccounts));
    }
    if (bookmark != null) {
      queryParams.addAll(_queryParams('', 'bookmark', bookmark));
    }
    if (pageSize != null) {
      queryParams.addAll(_queryParams('', 'page_size', pageSize));
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

  /// List ad accounts
  ///
  /// Get a list of the ad_accounts that the \"operation user_account\" has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).
  ///
  /// Parameters:
  ///
  /// * [bool] includeSharedAccounts:
  ///   Include shared ad accounts
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  Future<AdAccountsList200Response?> adAccountsList({ bool? includeSharedAccounts, String? bookmark, int? pageSize, }) async {
    final response = await adAccountsListWithHttpInfo( includeSharedAccounts: includeSharedAccounts, bookmark: bookmark, pageSize: pageSize, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdAccountsList200Response',) as AdAccountsList200Response;
    
    }
    return null;
  }

  /// Create a request for a brand, category, SKU report
  ///
  /// <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [ConversionProductReportRequest] conversionProductReportRequest (required):
  Future<Response> analyticsCreateConversionProductReportWithHttpInfo(String adAccountId, ConversionProductReportRequest conversionProductReportRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/reports/brand_category_sku'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = conversionProductReportRequest;

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

  /// Create a request for a brand, category, SKU report
  ///
  /// <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [ConversionProductReportRequest] conversionProductReportRequest (required):
  Future<AdsAnalyticsCreateAsyncResponse?> analyticsCreateConversionProductReport(String adAccountId, ConversionProductReportRequest conversionProductReportRequest,) async {
    final response = await analyticsCreateConversionProductReportWithHttpInfo(adAccountId, conversionProductReportRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdsAnalyticsCreateAsyncResponse',) as AdsAnalyticsCreateAsyncResponse;
    
    }
    return null;
  }

  /// Create a request for a Marketing Mix Modeling (MMM) report
  ///
  /// This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it's in beta release.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [CreateMMMReportRequest] createMMMReportRequest (required):
  Future<Response> analyticsCreateMmmReportWithHttpInfo(String adAccountId, CreateMMMReportRequest createMMMReportRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/mmm_reports'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = createMMMReportRequest;

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

  /// Create a request for a Marketing Mix Modeling (MMM) report
  ///
  /// This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it's in beta release.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [CreateMMMReportRequest] createMMMReportRequest (required):
  Future<CreateMMMReportResponse?> analyticsCreateMmmReport(String adAccountId, CreateMMMReportRequest createMMMReportRequest,) async {
    final response = await analyticsCreateMmmReportWithHttpInfo(adAccountId, createMMMReportRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CreateMMMReportResponse',) as CreateMMMReportResponse;
    
    }
    return null;
  }

  /// Create async request for an account analytics report
  ///
  /// This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [AdsAnalyticsCreateAsyncRequest] adsAnalyticsCreateAsyncRequest (required):
  Future<Response> analyticsCreateReportWithHttpInfo(String adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/reports'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = adsAnalyticsCreateAsyncRequest;

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

  /// Create async request for an account analytics report
  ///
  /// This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days. - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [AdsAnalyticsCreateAsyncRequest] adsAnalyticsCreateAsyncRequest (required):
  Future<AdsAnalyticsCreateAsyncResponse?> analyticsCreateReport(String adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest,) async {
    final response = await analyticsCreateReportWithHttpInfo(adAccountId, adsAnalyticsCreateAsyncRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdsAnalyticsCreateAsyncResponse',) as AdsAnalyticsCreateAsyncResponse;
    
    }
    return null;
  }

  /// Create async request for an analytics report using a template
  ///
  ///    This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///
  /// * [String] templateId (required):
  ///   Unique identifier of a template.
  ///
  /// * [DateTime] startDate:
  ///   Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.
  ///
  /// * [DateTime] endDate:
  ///   Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.
  ///
  /// * [Granularity] granularity:
  ///      TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEKLY - metrics are broken down weekly.    MONTHLY - metrics are broken down monthly
  Future<Response> analyticsCreateTemplateReportWithHttpInfo(String adAccountId, String templateId, { DateTime? startDate, DateTime? endDate, Granularity? granularity, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/templates/{template_id}/reports'
      .replaceAll('{ad_account_id}', adAccountId)
      .replaceAll('{template_id}', templateId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (startDate != null) {
      queryParams.addAll(_queryParams('', 'start_date', startDate));
    }
    if (endDate != null) {
      queryParams.addAll(_queryParams('', 'end_date', endDate));
    }
    if (granularity != null) {
      queryParams.addAll(_queryParams('', 'granularity', granularity));
    }

    const contentTypes = <String>[];


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

  /// Create async request for an analytics report using a template
  ///
  ///    This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///
  /// * [String] templateId (required):
  ///   Unique identifier of a template.
  ///
  /// * [DateTime] startDate:
  ///   Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.
  ///
  /// * [DateTime] endDate:
  ///   Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.
  ///
  /// * [Granularity] granularity:
  ///      TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEKLY - metrics are broken down weekly.    MONTHLY - metrics are broken down monthly
  Future<TemplateBasedReport?> analyticsCreateTemplateReport(String adAccountId, String templateId, { DateTime? startDate, DateTime? endDate, Granularity? granularity, }) async {
    final response = await analyticsCreateTemplateReportWithHttpInfo(adAccountId, templateId,  startDate: startDate, endDate: endDate, granularity: granularity, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'TemplateBasedReport',) as TemplateBasedReport;
    
    }
    return null;
  }

  /// Get advertiser brand, category, SKU report
  ///
  /// <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] token (required):
  ///   Token returned from the post request creation call
  Future<Response> analyticsGetConversionProductReportWithHttpInfo(String adAccountId, String token,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/reports/brand_category_sku'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'token', token));

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

  /// Get advertiser brand, category, SKU report
  ///
  /// <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] token (required):
  ///   Token returned from the post request creation call
  Future<AdsAnalyticsGetAsyncResponse?> analyticsGetConversionProductReport(String adAccountId, String token,) async {
    final response = await analyticsGetConversionProductReportWithHttpInfo(adAccountId, token,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdsAnalyticsGetAsyncResponse',) as AdsAnalyticsGetAsyncResponse;
    
    }
    return null;
  }

  /// Get advertiser Marketing Mix Modeling (MMM) report.
  ///
  /// Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] token (required):
  ///   Token returned from the post request creation call
  Future<Response> analyticsGetMmmReportWithHttpInfo(String adAccountId, String token,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/mmm_reports'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'token', token));

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

  /// Get advertiser Marketing Mix Modeling (MMM) report.
  ///
  /// Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] token (required):
  ///   Token returned from the post request creation call
  Future<GetMMMReportResponse?> analyticsGetMmmReport(String adAccountId, String token,) async {
    final response = await analyticsGetMmmReportWithHttpInfo(adAccountId, token,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'GetMMMReportResponse',) as GetMMMReportResponse;
    
    }
    return null;
  }

  /// Get the account analytics report created by the async call
  ///
  /// This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] token (required):
  ///   Token returned from the post request creation call
  Future<Response> analyticsGetReportWithHttpInfo(String adAccountId, String token,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/reports'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'token', token));

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

  /// Get the account analytics report created by the async call
  ///
  /// This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] token (required):
  ///   Token returned from the post request creation call
  Future<AdsAnalyticsGetAsyncResponse?> analyticsGetReport(String adAccountId, String token,) async {
    final response = await analyticsGetReportWithHttpInfo(adAccountId, token,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdsAnalyticsGetAsyncResponse',) as AdsAnalyticsGetAsyncResponse;
    
    }
    return null;
  }

  /// Delete ads data for ad account in API Sandbox
  ///
  /// Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  Future<Response> sandboxDeleteWithHttpInfo(String adAccountId,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/sandbox'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'DELETE',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Delete ads data for ad account in API Sandbox
  ///
  /// Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  Future<String?> sandboxDelete(String adAccountId,) async {
    final response = await sandboxDeleteWithHttpInfo(adAccountId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'String',) as String;
    
    }
    return null;
  }

  /// List templates
  ///
  /// Gets all Templates associated with an ad account ID.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] order:
  ///   The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<Response> templatesListWithHttpInfo(String adAccountId, { int? pageSize, String? order, String? bookmark, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/templates'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

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

  /// List templates
  ///
  /// Gets all Templates associated with an ad account ID.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] order:
  ///   The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<TemplatesList200Response?> templatesList(String adAccountId, { int? pageSize, String? order, String? bookmark, }) async {
    final response = await templatesListWithHttpInfo(adAccountId,  pageSize: pageSize, order: order, bookmark: bookmark, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'TemplatesList200Response',) as TemplatesList200Response;
    
    }
    return null;
  }
}
