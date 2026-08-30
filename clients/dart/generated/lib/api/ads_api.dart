//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class AdsApi {
  AdsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Create ad preview with pin or image
  ///
  /// Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [AdPreviewRequest] adPreviewRequest (required):
  Future<Response> adPreviewsCreateWithHttpInfo(String adAccountId, AdPreviewRequest adPreviewRequest, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ad_previews'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = adPreviewRequest;

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
      abortTrigger: abortTrigger,
    );
  }

  /// Create ad preview with pin or image
  ///
  /// Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [AdPreviewRequest] adPreviewRequest (required):
  Future<AdPreviewURLResponse?> adPreviewsCreate(String adAccountId, AdPreviewRequest adPreviewRequest, { Future<void>? abortTrigger, }) async {
    final response = await adPreviewsCreateWithHttpInfo(adAccountId, adPreviewRequest, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdPreviewURLResponse',) as AdPreviewURLResponse;
    
    }
    return null;
  }

  /// Get targeting analytics for ads
  ///
  /// Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<String>] adIds (required):
  ///   List of Ad Ids to use to filter the results.
  ///
  /// * [DateTime] startDate (required):
  ///   Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  ///
  /// * [DateTime] endDate (required):
  ///   Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  ///
  /// * [List<AdsAnalyticsAdTargetingType>] targetingTypes (required):
  ///   Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
  ///
  /// * [List<ReportingColumnSync>] columns (required):
  ///   Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
  ///
  /// * [Granularity] granularity (required):
  ///     TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
  ///
  /// * [ConversionAttributionWindowDays] clickWindowDays:
  ///   Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  ///
  /// * [ConversionAttributionWindowDays] engagementWindowDays:
  ///   Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
  ///
  /// * [ConversionAttributionWindowDays] viewWindowDays:
  ///   Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  ///
  /// * [ConversionReportTimeType] conversionReportTime:
  ///   The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  ///
  /// * [List<ConversionReportAttributionType>] attributionTypes:
  ///   List of types of attribution for the conversion report
  ///
  /// * [ReportingTimeZone] reportingTimezone:
  ///   Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
  ///
  /// * [List<String>] sortColumns:
  ///   Sort Columns.
  ///
  /// * [bool] sortAscending:
  ///   Sort ascending.
  Future<Response> adTargetingAnalyticsGetWithHttpInfo(String adAccountId, List<String> adIds, DateTime startDate, DateTime endDate, List<AdsAnalyticsAdTargetingType> targetingTypes, List<ReportingColumnSync> columns, Granularity granularity, { ConversionAttributionWindowDays? clickWindowDays, ConversionAttributionWindowDays? engagementWindowDays, ConversionAttributionWindowDays? viewWindowDays, ConversionReportTimeType? conversionReportTime, List<ConversionReportAttributionType>? attributionTypes, ReportingTimeZone? reportingTimezone, List<String>? sortColumns, bool? sortAscending, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ads/targeting_analytics'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('multi', 'ad_ids', adIds));
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
    if (sortColumns != null) {
      queryParams.addAll(_queryParams('multi', 'sort_columns', sortColumns));
    }
    if (sortAscending != null) {
      queryParams.addAll(_queryParams('', 'sort_ascending', sortAscending));
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

  /// Get targeting analytics for ads
  ///
  /// Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<String>] adIds (required):
  ///   List of Ad Ids to use to filter the results.
  ///
  /// * [DateTime] startDate (required):
  ///   Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  ///
  /// * [DateTime] endDate (required):
  ///   Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  ///
  /// * [List<AdsAnalyticsAdTargetingType>] targetingTypes (required):
  ///   Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
  ///
  /// * [List<ReportingColumnSync>] columns (required):
  ///   Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
  ///
  /// * [Granularity] granularity (required):
  ///     TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
  ///
  /// * [ConversionAttributionWindowDays] clickWindowDays:
  ///   Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  ///
  /// * [ConversionAttributionWindowDays] engagementWindowDays:
  ///   Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
  ///
  /// * [ConversionAttributionWindowDays] viewWindowDays:
  ///   Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  ///
  /// * [ConversionReportTimeType] conversionReportTime:
  ///   The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  ///
  /// * [List<ConversionReportAttributionType>] attributionTypes:
  ///   List of types of attribution for the conversion report
  ///
  /// * [ReportingTimeZone] reportingTimezone:
  ///   Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
  ///
  /// * [List<String>] sortColumns:
  ///   Sort Columns.
  ///
  /// * [bool] sortAscending:
  ///   Sort ascending.
  Future<MetricsResponse?> adTargetingAnalyticsGet(String adAccountId, List<String> adIds, DateTime startDate, DateTime endDate, List<AdsAnalyticsAdTargetingType> targetingTypes, List<ReportingColumnSync> columns, Granularity granularity, { ConversionAttributionWindowDays? clickWindowDays, ConversionAttributionWindowDays? engagementWindowDays, ConversionAttributionWindowDays? viewWindowDays, ConversionReportTimeType? conversionReportTime, List<ConversionReportAttributionType>? attributionTypes, ReportingTimeZone? reportingTimezone, List<String>? sortColumns, bool? sortAscending, Future<void>? abortTrigger, }) async {
    final response = await adTargetingAnalyticsGetWithHttpInfo(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime, attributionTypes: attributionTypes, reportingTimezone: reportingTimezone, sortColumns: sortColumns, sortAscending: sortAscending, abortTrigger: abortTrigger,);
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

  /// Get ad analytics
  ///
  ///     Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.     - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [DateTime] startDate (required):
  ///   Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  ///
  /// * [DateTime] endDate (required):
  ///   Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  ///
  /// * [List<ReportingColumnSync>] columns (required):
  ///   Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
  ///
  /// * [Granularity] granularity (required):
  ///     TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<String>] pinIds:
  ///   List of Pin IDs.
  ///
  /// * [List<String>] adIds:
  ///   List of Ad Ids to use to filter the results.
  ///
  /// * [num] clickWindowDays:
  ///   Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  ///
  /// * [num] engagementWindowDays:
  ///   Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
  ///
  /// * [num] viewWindowDays:
  ///   Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  ///
  /// * [String] conversionReportTime:
  ///   The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  ///
  /// * [List<String>] campaignIds:
  ///   List of Campaign Ids to use to filter the results.
  ///
  /// * [ReportingTimeZone] reportingTimezone:
  ///   Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
  Future<Response> adsAnalyticsWithHttpInfo(DateTime startDate, DateTime endDate, List<ReportingColumnSync> columns, Granularity granularity, String adAccountId, { List<String>? pinIds, List<String>? adIds, num? clickWindowDays, num? engagementWindowDays, num? viewWindowDays, String? conversionReportTime, List<String>? campaignIds, ReportingTimeZone? reportingTimezone, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ads/analytics'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (pinIds != null) {
      queryParams.addAll(_queryParams('multi', 'pin_ids', pinIds));
    }
      queryParams.addAll(_queryParams('', 'start_date', startDate));
      queryParams.addAll(_queryParams('', 'end_date', endDate));
    if (adIds != null) {
      queryParams.addAll(_queryParams('multi', 'ad_ids', adIds));
    }
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
    if (campaignIds != null) {
      queryParams.addAll(_queryParams('multi', 'campaign_ids', campaignIds));
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
      abortTrigger: abortTrigger,
    );
  }

  /// Get ad analytics
  ///
  ///     Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.     - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
  ///
  /// Parameters:
  ///
  /// * [DateTime] startDate (required):
  ///   Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  ///
  /// * [DateTime] endDate (required):
  ///   Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  ///
  /// * [List<ReportingColumnSync>] columns (required):
  ///   Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
  ///
  /// * [Granularity] granularity (required):
  ///     TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<String>] pinIds:
  ///   List of Pin IDs.
  ///
  /// * [List<String>] adIds:
  ///   List of Ad Ids to use to filter the results.
  ///
  /// * [num] clickWindowDays:
  ///   Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  ///
  /// * [num] engagementWindowDays:
  ///   Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
  ///
  /// * [num] viewWindowDays:
  ///   Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  ///
  /// * [String] conversionReportTime:
  ///   The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  ///
  /// * [List<String>] campaignIds:
  ///   List of Campaign Ids to use to filter the results.
  ///
  /// * [ReportingTimeZone] reportingTimezone:
  ///   Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
  Future<List<AdsAnalytics>?> adsAnalytics(DateTime startDate, DateTime endDate, List<ReportingColumnSync> columns, Granularity granularity, String adAccountId, { List<String>? pinIds, List<String>? adIds, num? clickWindowDays, num? engagementWindowDays, num? viewWindowDays, String? conversionReportTime, List<String>? campaignIds, ReportingTimeZone? reportingTimezone, Future<void>? abortTrigger, }) async {
    final response = await adsAnalyticsWithHttpInfo(startDate, endDate, columns, granularity, adAccountId, pinIds: pinIds, adIds: adIds, clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime, campaignIds: campaignIds, reportingTimezone: reportingTimezone, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<AdsAnalytics>') as List)
        .cast<AdsAnalytics>()
        .toList(growable: false);

    }
    return null;
  }

  /// Create ads
  ///
  /// Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<AdCreate>] adCreate (required):
  Future<Response> adsCreateWithHttpInfo(String adAccountId, List<AdCreate> adCreate, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ads'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = adCreate;

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
      abortTrigger: abortTrigger,
    );
  }

  /// Create ads
  ///
  /// Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<AdCreate>] adCreate (required):
  Future<AdBatchWriteResponseModel?> adsCreate(String adAccountId, List<AdCreate> adCreate, { Future<void>? abortTrigger, }) async {
    final response = await adsCreateWithHttpInfo(adAccountId, adCreate, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdBatchWriteResponseModel',) as AdBatchWriteResponseModel;
    
    }
    return null;
  }

  /// Get ad
  ///
  /// Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adId (required):
  ///   The ID of this ad.
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  Future<Response> adsGetWithHttpInfo(String adId, String adAccountId, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ads/{ad_id}'
      .replaceAll('{ad_id}', adId)
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
      abortTrigger: abortTrigger,
    );
  }

  /// Get ad
  ///
  /// Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).
  ///
  /// Parameters:
  ///
  /// * [String] adId (required):
  ///   The ID of this ad.
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  Future<Ad?> adsGet(String adId, String adAccountId, { Future<void>? abortTrigger, }) async {
    final response = await adsGetWithHttpInfo(adId, adAccountId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'Ad',) as Ad;
    
    }
    return null;
  }

  /// List ads
  ///
  /// List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  ///
  /// * [PinterestLibPaginationOrder] order:
  ///   The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
  ///
  /// * [List<String>] campaignIds:
  ///   List of Campaign Ids to use to filter the results.
  ///
  /// * [List<String>] adGroupIds:
  ///   List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
  ///
  /// * [List<String>] adIds:
  ///   List of Ad Ids to use to filter the results.
  ///
  /// * [List<EntityStatus>] entityStatuses:
  ///   Entity status
  Future<Response> adsListWithHttpInfo(String adAccountId, { String? bookmark, int? pageSize, PinterestLibPaginationOrder? order, List<String>? campaignIds, List<String>? adGroupIds, List<String>? adIds, List<EntityStatus>? entityStatuses, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ads'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (bookmark != null) {
      queryParams.addAll(_queryParams('', 'bookmark', bookmark));
    }
    if (pageSize != null) {
      queryParams.addAll(_queryParams('', 'page_size', pageSize));
    }
    if (order != null) {
      queryParams.addAll(_queryParams('', 'order', order));
    }
    if (campaignIds != null) {
      queryParams.addAll(_queryParams('multi', 'campaign_ids', campaignIds));
    }
    if (adGroupIds != null) {
      queryParams.addAll(_queryParams('multi', 'ad_group_ids', adGroupIds));
    }
    if (adIds != null) {
      queryParams.addAll(_queryParams('multi', 'ad_ids', adIds));
    }
    if (entityStatuses != null) {
      queryParams.addAll(_queryParams('multi', 'entity_statuses', entityStatuses));
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

  /// List ads
  ///
  /// List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  ///
  /// * [PinterestLibPaginationOrder] order:
  ///   The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
  ///
  /// * [List<String>] campaignIds:
  ///   List of Campaign Ids to use to filter the results.
  ///
  /// * [List<String>] adGroupIds:
  ///   List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
  ///
  /// * [List<String>] adIds:
  ///   List of Ad Ids to use to filter the results.
  ///
  /// * [List<EntityStatus>] entityStatuses:
  ///   Entity status
  Future<AdsList200Response?> adsList(String adAccountId, { String? bookmark, int? pageSize, PinterestLibPaginationOrder? order, List<String>? campaignIds, List<String>? adGroupIds, List<String>? adIds, List<EntityStatus>? entityStatuses, Future<void>? abortTrigger, }) async {
    final response = await adsListWithHttpInfo(adAccountId, bookmark: bookmark, pageSize: pageSize, order: order, campaignIds: campaignIds, adGroupIds: adGroupIds, adIds: adIds, entityStatuses: entityStatuses, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdsList200Response',) as AdsList200Response;
    
    }
    return null;
  }

  /// Update ads
  ///
  /// Update multiple existing ads
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<AdBatchUpdate>] adBatchUpdate (required):
  Future<Response> adsUpdateWithHttpInfo(String adAccountId, List<AdBatchUpdate> adBatchUpdate, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ads'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = adBatchUpdate;

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
      abortTrigger: abortTrigger,
    );
  }

  /// Update ads
  ///
  /// Update multiple existing ads
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<AdBatchUpdate>] adBatchUpdate (required):
  Future<AdBatchWriteResponseModel?> adsUpdate(String adAccountId, List<AdBatchUpdate> adBatchUpdate, { Future<void>? abortTrigger, }) async {
    final response = await adsUpdateWithHttpInfo(adAccountId, adBatchUpdate, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdBatchWriteResponseModel',) as AdBatchWriteResponseModel;
    
    }
    return null;
  }

  /// Create ad preview records for one or more ad groups
  ///
  /// Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<CampaignAdPreviewCreate>] campaignAdPreviewCreate (required):
  Future<Response> campaignAdPreviewCreateWithHttpInfo(String adAccountId, List<CampaignAdPreviewCreate> campaignAdPreviewCreate, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/campaign_ad_preview'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = campaignAdPreviewCreate;

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
      abortTrigger: abortTrigger,
    );
  }

  /// Create ad preview records for one or more ad groups
  ///
  /// Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<CampaignAdPreviewCreate>] campaignAdPreviewCreate (required):
  Future<List<CampaignAdPreviewCreate200ResponseInner>?> campaignAdPreviewCreate(String adAccountId, List<CampaignAdPreviewCreate> campaignAdPreviewCreate, { Future<void>? abortTrigger, }) async {
    final response = await campaignAdPreviewCreateWithHttpInfo(adAccountId, campaignAdPreviewCreate, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<CampaignAdPreviewCreate200ResponseInner>') as List)
        .cast<CampaignAdPreviewCreate200ResponseInner>()
        .toList(growable: false);

    }
    return null;
  }

  /// Delete ad preview records for one or more ad groups
  ///
  /// Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [List<String>] adGroupIds (required):
  ///   List of Ad group Ids to use to filter the results.
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  Future<Response> campaignAdPreviewDeleteWithHttpInfo(List<String> adGroupIds, String adAccountId, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/campaign_ad_preview'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('multi', 'ad_group_ids', adGroupIds));

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'DELETE',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Delete ad preview records for one or more ad groups
  ///
  /// Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.
  ///
  /// Parameters:
  ///
  /// * [List<String>] adGroupIds (required):
  ///   List of Ad group Ids to use to filter the results.
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  Future<List<CampaignAdPreviewDelete200ResponseInner>?> campaignAdPreviewDelete(List<String> adGroupIds, String adAccountId, { Future<void>? abortTrigger, }) async {
    final response = await campaignAdPreviewDeleteWithHttpInfo(adGroupIds, adAccountId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<CampaignAdPreviewDelete200ResponseInner>') as List)
        .cast<CampaignAdPreviewDelete200ResponseInner>()
        .toList(growable: false);

    }
    return null;
  }

  /// Fetch ad preview records for one or more ad groups
  ///
  /// Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [List<String>] adGroupIds (required):
  ///   List of Ad group Ids to use to filter the results.
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  Future<Response> campaignAdPreviewReadWithHttpInfo(List<String> adGroupIds, String adAccountId, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/campaign_ad_preview'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('multi', 'ad_group_ids', adGroupIds));

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

  /// Fetch ad preview records for one or more ad groups
  ///
  /// Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.
  ///
  /// Parameters:
  ///
  /// * [List<String>] adGroupIds (required):
  ///   List of Ad group Ids to use to filter the results.
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  Future<List<CampaignAdPreview>?> campaignAdPreviewRead(List<String> adGroupIds, String adAccountId, { Future<void>? abortTrigger, }) async {
    final response = await campaignAdPreviewReadWithHttpInfo(adGroupIds, adAccountId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<CampaignAdPreview>') as List)
        .cast<CampaignAdPreview>()
        .toList(growable: false);

    }
    return null;
  }
}
