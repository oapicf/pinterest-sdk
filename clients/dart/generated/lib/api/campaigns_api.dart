//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class CampaignsApi {
  CampaignsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Get pins analytics
  ///
  /// Get analytics for the pins given a campaign and pins in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] campaignId (required):
  ///   Campaign Id to use to filter the results.
  ///
  /// * [List<String>] pinIds (required):
  ///   List of Pin IDs.
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
  Future<Response> adPinsAnalyticsWithHttpInfo(String adAccountId, String campaignId, List<String> pinIds, DateTime startDate, DateTime endDate, List<String> columns, Granularity granularity, { int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, String? conversionReportTime, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/pins/analytics'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'campaign_id', campaignId));
      queryParams.addAll(_queryParams('multi', 'pin_ids', pinIds));
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

  /// Get pins analytics
  ///
  /// Get analytics for the pins given a campaign and pins in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] campaignId (required):
  ///   Campaign Id to use to filter the results.
  ///
  /// * [List<String>] pinIds (required):
  ///   List of Pin IDs.
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
  Future<List<AdPinAnalytics>?> adPinsAnalytics(String adAccountId, String campaignId, List<String> pinIds, DateTime startDate, DateTime endDate, List<String> columns, Granularity granularity, { int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, String? conversionReportTime, }) async {
    final response = await adPinsAnalyticsWithHttpInfo(adAccountId, campaignId, pinIds, startDate, endDate, columns, granularity,  clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<AdPinAnalytics>') as List)
        .cast<AdPinAnalytics>()
        .toList(growable: false);

    }
    return null;
  }

  /// Get targeting analytics for campaigns
  ///
  /// Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<String>] campaignIds (required):
  ///   List of Campaign Ids to use to filter the results.
  ///
  /// * [DateTime] startDate (required):
  ///   Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  ///
  /// * [DateTime] endDate (required):
  ///   Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  ///
  /// * [List<AdsAnalyticsCampaignTargetingType>] targetingTypes (required):
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
  Future<Response> campaignTargetingAnalyticsGetWithHttpInfo(String adAccountId, List<String> campaignIds, DateTime startDate, DateTime endDate, List<AdsAnalyticsCampaignTargetingType> targetingTypes, List<String> columns, Granularity granularity, { int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, String? conversionReportTime, List<ConversionReportAttributionType>? attributionTypes, ReportingTimeZone? reportingTimezone, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/campaigns/targeting_analytics'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('multi', 'campaign_ids', campaignIds));
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

  /// Get targeting analytics for campaigns
  ///
  /// Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<String>] campaignIds (required):
  ///   List of Campaign Ids to use to filter the results.
  ///
  /// * [DateTime] startDate (required):
  ///   Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  ///
  /// * [DateTime] endDate (required):
  ///   Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  ///
  /// * [List<AdsAnalyticsCampaignTargetingType>] targetingTypes (required):
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
  Future<MetricsResponse?> campaignTargetingAnalyticsGet(String adAccountId, List<String> campaignIds, DateTime startDate, DateTime endDate, List<AdsAnalyticsCampaignTargetingType> targetingTypes, List<String> columns, Granularity granularity, { int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, String? conversionReportTime, List<ConversionReportAttributionType>? attributionTypes, ReportingTimeZone? reportingTimezone, }) async {
    final response = await campaignTargetingAnalyticsGetWithHttpInfo(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity,  clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime, attributionTypes: attributionTypes, reportingTimezone: reportingTimezone, );
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

  /// Get campaign analytics
  ///
  /// Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
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
  /// * [List<String>] campaignIds (required):
  ///   List of Campaign Ids to use to filter the results.
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
  /// * [bool] aggregateReportRows:
  ///   Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.
  ///
  /// * [ReportingTimeZone] reportingTimezone:
  ///   Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
  Future<Response> campaignsAnalyticsWithHttpInfo(String adAccountId, DateTime startDate, DateTime endDate, List<String> campaignIds, List<String> columns, Granularity granularity, { int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, String? conversionReportTime, bool? aggregateReportRows, ReportingTimeZone? reportingTimezone, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/campaigns/analytics'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'start_date', startDate));
      queryParams.addAll(_queryParams('', 'end_date', endDate));
      queryParams.addAll(_queryParams('multi', 'campaign_ids', campaignIds));
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
    if (aggregateReportRows != null) {
      queryParams.addAll(_queryParams('', 'aggregate_report_rows', aggregateReportRows));
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

  /// Get campaign analytics
  ///
  /// Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
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
  /// * [List<String>] campaignIds (required):
  ///   List of Campaign Ids to use to filter the results.
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
  /// * [bool] aggregateReportRows:
  ///   Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.
  ///
  /// * [ReportingTimeZone] reportingTimezone:
  ///   Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
  Future<List<CampaignsAnalyticsResponseInner>?> campaignsAnalytics(String adAccountId, DateTime startDate, DateTime endDate, List<String> campaignIds, List<String> columns, Granularity granularity, { int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, String? conversionReportTime, bool? aggregateReportRows, ReportingTimeZone? reportingTimezone, }) async {
    final response = await campaignsAnalyticsWithHttpInfo(adAccountId, startDate, endDate, campaignIds, columns, granularity,  clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime, aggregateReportRows: aggregateReportRows, reportingTimezone: reportingTimezone, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<CampaignsAnalyticsResponseInner>') as List)
        .cast<CampaignsAnalyticsResponseInner>()
        .toList(growable: false);

    }
    return null;
  }

  /// Create campaigns
  ///
  /// Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<CampaignCreateRequest>] campaignCreateRequest (required):
  ///   Array of campaigns.
  Future<Response> campaignsCreateWithHttpInfo(String adAccountId, List<CampaignCreateRequest> campaignCreateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/campaigns'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = campaignCreateRequest;

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

  /// Create campaigns
  ///
  /// Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<CampaignCreateRequest>] campaignCreateRequest (required):
  ///   Array of campaigns.
  Future<CampaignCreateResponse?> campaignsCreate(String adAccountId, List<CampaignCreateRequest> campaignCreateRequest,) async {
    final response = await campaignsCreateWithHttpInfo(adAccountId, campaignCreateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CampaignCreateResponse',) as CampaignCreateResponse;
    
    }
    return null;
  }

  /// Get campaign
  ///
  /// Get a specific campaign given the campaign ID.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] campaignId (required):
  ///   Campaign ID, must be associated with the ad account ID provided in the path.
  Future<Response> campaignsGetWithHttpInfo(String adAccountId, String campaignId,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/campaigns/{campaign_id}'
      .replaceAll('{ad_account_id}', adAccountId)
      .replaceAll('{campaign_id}', campaignId);

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

  /// Get campaign
  ///
  /// Get a specific campaign given the campaign ID.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] campaignId (required):
  ///   Campaign ID, must be associated with the ad account ID provided in the path.
  Future<CampaignResponse?> campaignsGet(String adAccountId, String campaignId,) async {
    final response = await campaignsGetWithHttpInfo(adAccountId, campaignId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CampaignResponse',) as CampaignResponse;
    
    }
    return null;
  }

  /// List campaigns
  ///
  /// Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
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
  Future<Response> campaignsListWithHttpInfo(String adAccountId, { List<String>? campaignIds, List<String>? entityStatuses, int? pageSize, String? order, String? bookmark, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/campaigns'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (campaignIds != null) {
      queryParams.addAll(_queryParams('multi', 'campaign_ids', campaignIds));
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

  /// List campaigns
  ///
  /// Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<String>] campaignIds:
  ///   List of Campaign Ids to use to filter the results.
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
  Future<CampaignsList200Response?> campaignsList(String adAccountId, { List<String>? campaignIds, List<String>? entityStatuses, int? pageSize, String? order, String? bookmark, }) async {
    final response = await campaignsListWithHttpInfo(adAccountId,  campaignIds: campaignIds, entityStatuses: entityStatuses, pageSize: pageSize, order: order, bookmark: bookmark, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CampaignsList200Response',) as CampaignsList200Response;
    
    }
    return null;
  }

  /// Update campaigns
  ///
  /// <p>Update multiple ad campaigns based on campaign_ids. </p> <p><strong>Note:</strong></p> - <p>The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<CampaignUpdateRequest>] campaignUpdateRequest (required):
  ///   Array of campaigns.
  Future<Response> campaignsUpdateWithHttpInfo(String adAccountId, List<CampaignUpdateRequest> campaignUpdateRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/campaigns'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = campaignUpdateRequest;

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

  /// Update campaigns
  ///
  /// <p>Update multiple ad campaigns based on campaign_ids. </p> <p><strong>Note:</strong></p> - <p>The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<CampaignUpdateRequest>] campaignUpdateRequest (required):
  ///   Array of campaigns.
  Future<CampaignUpdateResponse?> campaignsUpdate(String adAccountId, List<CampaignUpdateRequest> campaignUpdateRequest,) async {
    final response = await campaignsUpdateWithHttpInfo(adAccountId, campaignUpdateRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'CampaignUpdateResponse',) as CampaignUpdateResponse;
    
    }
    return null;
  }
}
