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
  /// Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.  Creating ad preview from catalog product group is currently in BETA and is not available to all users.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [AdPreviewRequest] adPreviewRequest (required):
  ///   Create ad preview with pin or image.
  Future<Response> adPreviewsCreateWithHttpInfo(String adAccountId, AdPreviewRequest adPreviewRequest,) async {
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
    );
  }

  /// Create ad preview with pin or image
  ///
  /// Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.  Creating ad preview from catalog product group is currently in BETA and is not available to all users.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [AdPreviewRequest] adPreviewRequest (required):
  ///   Create ad preview with pin or image.
  Future<AdPreviewURLResponse?> adPreviewsCreate(String adAccountId, AdPreviewRequest adPreviewRequest,) async {
    final response = await adPreviewsCreateWithHttpInfo(adAccountId, adPreviewRequest,);
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
  /// Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
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
  Future<Response> adTargetingAnalyticsGetWithHttpInfo(String adAccountId, List<String> adIds, DateTime startDate, DateTime endDate, List<AdsAnalyticsAdTargetingType> targetingTypes, List<String> columns, Granularity granularity, { int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, String? conversionReportTime, List<ConversionReportAttributionType>? attributionTypes, ReportingTimeZone? reportingTimezone, }) async {
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

  /// Get targeting analytics for ads
  ///
  /// Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
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
  Future<MetricsResponse?> adTargetingAnalyticsGet(String adAccountId, List<String> adIds, DateTime startDate, DateTime endDate, List<AdsAnalyticsAdTargetingType> targetingTypes, List<String> columns, Granularity granularity, { int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, String? conversionReportTime, List<ConversionReportAttributionType>? attributionTypes, ReportingTimeZone? reportingTimezone, }) async {
    final response = await adTargetingAnalyticsGetWithHttpInfo(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity,  clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime, attributionTypes: attributionTypes, reportingTimezone: reportingTimezone, );
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
  /// Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - The request must contain either ad_ids or both campaign_ids and pin_ids. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
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
  /// * [List<String>] adIds:
  ///   List of Ad Ids to use to filter the results.
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
  /// * [List<String>] pinIds:
  ///   List of Pin IDs.
  ///
  /// * [List<String>] campaignIds:
  ///   List of Campaign Ids to use to filter the results.
  ///
  /// * [ReportingTimeZone] reportingTimezone:
  ///   Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
  Future<Response> adsAnalyticsWithHttpInfo(String adAccountId, DateTime startDate, DateTime endDate, List<String> columns, Granularity granularity, { List<String>? adIds, int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, String? conversionReportTime, List<String>? pinIds, List<String>? campaignIds, ReportingTimeZone? reportingTimezone, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ads/analytics'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

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
    if (pinIds != null) {
      queryParams.addAll(_queryParams('multi', 'pin_ids', pinIds));
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
    );
  }

  /// Get ad analytics
  ///
  /// Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - The request must contain either ad_ids or both campaign_ids and pin_ids. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
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
  /// * [List<String>] adIds:
  ///   List of Ad Ids to use to filter the results.
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
  /// * [List<String>] pinIds:
  ///   List of Pin IDs.
  ///
  /// * [List<String>] campaignIds:
  ///   List of Campaign Ids to use to filter the results.
  ///
  /// * [ReportingTimeZone] reportingTimezone:
  ///   Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
  Future<List<AdsAnalyticsResponseInner>?> adsAnalytics(String adAccountId, DateTime startDate, DateTime endDate, List<String> columns, Granularity granularity, { List<String>? adIds, int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, String? conversionReportTime, List<String>? pinIds, List<String>? campaignIds, ReportingTimeZone? reportingTimezone, }) async {
    final response = await adsAnalyticsWithHttpInfo(adAccountId, startDate, endDate, columns, granularity,  adIds: adIds, clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime, pinIds: pinIds, campaignIds: campaignIds, reportingTimezone: reportingTimezone, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<AdsAnalyticsResponseInner>') as List)
        .cast<AdsAnalyticsResponseInner>()
        .toList(growable: false);

    }
    return null;
  }

  /// Create ads
  ///
  /// Create multiple new ads. Request must contain `ad_group_id`, `creative_type`, and the source Pin `pin_id`.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<AdCreateRequest>] adCreateRequest (required):
  ///   List of ads to create, size limit [1, 30].
  Future<Response> adsCreateWithHttpInfo(String adAccountId, List<AdCreateRequest> adCreateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ads'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = adCreateRequest;

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

  /// Create ads
  ///
  /// Create multiple new ads. Request must contain `ad_group_id`, `creative_type`, and the source Pin `pin_id`.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<AdCreateRequest>] adCreateRequest (required):
  ///   List of ads to create, size limit [1, 30].
  Future<AdArrayResponse?> adsCreate(String adAccountId, List<AdCreateRequest> adCreateRequest,) async {
    final response = await adsCreateWithHttpInfo(adAccountId, adCreateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdArrayResponse',) as AdArrayResponse;
    
    }
    return null;
  }

  /// Get ad
  ///
  /// Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] adId (required):
  ///   Unique identifier of an ad.
  Future<Response> adsGetWithHttpInfo(String adAccountId, String adId,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ads/{ad_id}'
      .replaceAll('{ad_account_id}', adAccountId)
      .replaceAll('{ad_id}', adId);

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

  /// Get ad
  ///
  /// Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] adId (required):
  ///   Unique identifier of an ad.
  Future<AdResponse?> adsGet(String adAccountId, String adId,) async {
    final response = await adsGetWithHttpInfo(adAccountId, adId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdResponse',) as AdResponse;
    
    }
    return null;
  }

  /// List ads
  ///
  /// List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<String>] campaignIds:
  ///   List of Campaign Ids to use to filter the results.
  ///
  /// * [List<String>] adGroupIds:
  ///   List of Ad group Ids to use to filter the results.
  ///
  /// * [List<String>] adIds:
  ///   List of Ad Ids to use to filter the results.
  ///
  /// * [List<String>] entityStatuses:
  ///   Entity status
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] order:
  ///   The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<Response> adsListWithHttpInfo(String adAccountId, { List<String>? campaignIds, List<String>? adGroupIds, List<String>? adIds, List<String>? entityStatuses, int? pageSize, String? order, String? bookmark, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ads'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

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

  /// List ads
  ///
  /// List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<String>] campaignIds:
  ///   List of Campaign Ids to use to filter the results.
  ///
  /// * [List<String>] adGroupIds:
  ///   List of Ad group Ids to use to filter the results.
  ///
  /// * [List<String>] adIds:
  ///   List of Ad Ids to use to filter the results.
  ///
  /// * [List<String>] entityStatuses:
  ///   Entity status
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] order:
  ///   The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<AdsList200Response?> adsList(String adAccountId, { List<String>? campaignIds, List<String>? adGroupIds, List<String>? adIds, List<String>? entityStatuses, int? pageSize, String? order, String? bookmark, }) async {
    final response = await adsListWithHttpInfo(adAccountId,  campaignIds: campaignIds, adGroupIds: adGroupIds, adIds: adIds, entityStatuses: entityStatuses, pageSize: pageSize, order: order, bookmark: bookmark, );
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
  /// * [List<AdUpdateRequest>] adUpdateRequest (required):
  ///   List of ads to update, size limit [1, 30]
  Future<Response> adsUpdateWithHttpInfo(String adAccountId, List<AdUpdateRequest> adUpdateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/ads'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = adUpdateRequest;

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

  /// Update ads
  ///
  /// Update multiple existing ads
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<AdUpdateRequest>] adUpdateRequest (required):
  ///   List of ads to update, size limit [1, 30]
  Future<AdArrayResponse?> adsUpdate(String adAccountId, List<AdUpdateRequest> adUpdateRequest,) async {
    final response = await adsUpdateWithHttpInfo(adAccountId, adUpdateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdArrayResponse',) as AdArrayResponse;
    
    }
    return null;
  }
}
