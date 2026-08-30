//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdsAnalyticsCreateAsyncRequest {
  /// Returns a new [AdsAnalyticsCreateAsyncRequest] instance.
  AdsAnalyticsCreateAsyncRequest({
    this.adGroupIds = const [],
    this.adGroupStatuses = const [],
    this.adIds = const [],
    this.adStatuses = const [],
    this.attributionTypes = const [],
    this.campaignBrandLabel,
    this.campaignCustomLabel,
    this.campaignIds = const [],
    this.campaignObjectiveTypes = const [],
    this.campaignStatuses = const [],
    this.clickWindowDays = 30,
    this.columns = const [],
    this.combineTargetingTypes = false,
    this.conversionReportTime = ConversionReportTimeType.TIME_OF_AD_ACTION,
    this.customConversionEventMetrics = const [],
    required this.endDate,
    this.endHour,
    this.engagementWindowDays = 30,
    required this.granularity,
    this.level,
    this.metricsFilters = const [],
    this.primarySort = PrimarySort.BY_ID,
    this.productGroupIds = const [],
    this.productGroupStatuses = const [],
    this.productItemIds = const [],
    this.reportFormat = DataOutputFormat.JSON,
    this.reportingTimezone,
    required this.startDate,
    this.startHour,
    this.targetingTypes = const [],
    this.viewWindowDays = 1,
  });

  /// List of ad group ids
  List<String> adGroupIds;

  /// List of values for filtering
  List<AdGroupSummaryStatus> adGroupStatuses;

  /// List of ad ids. This parameter is not supported for Product Item level reports.
  List<String> adIds;

  /// List of values for filtering. This parameter is not supported for Product Item level reports.
  List<PinPromotionSummaryStatus> adStatuses;

  /// List of attribution types for the conversion report.
  List<ConversionReportAttributionType> attributionTypes;

  /// Campaign brand label for filtering.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? campaignBrandLabel;

  /// Campaign custom label for filtering.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? campaignCustomLabel;

  /// List of campaign ids
  List<String> campaignIds;

  /// List of values for filtering. [\"WEB_SESSIONS\"] is in BETA.
  List<CampaignObjectiveType> campaignObjectiveTypes;

  /// List of status values for filtering
  List<CampaignSummaryStatus> campaignStatuses;

  /// Number of days to use as the conversion attribution window for a pin click action.
  ConversionAttributionWindowDays clickWindowDays;

  /// Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.
  List<ReportingColumnAsync> columns;

  /// Determines if the targeting types included in the request should be consolidated into a single breakdown.
  bool combineTargetingTypes;

  /// Date dimension for conversion metrics.
  ConversionReportTimeType conversionReportTime;

  /// List of advertiser-defined custom conversion event metrics to include in the report
  List<CustomConversionEventMetrics> customConversionEventMetrics;

  /// Metric report end date (UTC). Format: YYYY-MM-DD
  String endDate;

  /// Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.
  ///
  /// Minimum value: 0
  /// Maximum value: 23
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? endHour;

  /// Number of days to use as the conversion attribution window for an engagement action.
  ConversionAttributionWindowDays engagementWindowDays;

  ///   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.
  Granularity granularity;

  /// Level of the report
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  MetricsReportingLevel? level;

  /// List of metrics filters
  List<AdsAnalyticsMetricsFilter> metricsFilters;

  PrimarySort primarySort;

  /// List of product group ids
  List<String> productGroupIds;

  /// List of values for filtering
  List<ProductGroupSummaryStatus> productGroupStatuses;

  /// List of product item ids
  List<String> productItemIds;

  DataOutputFormat reportFormat;

  /// Specify the timezone to be applied for the reporting.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ReportingTimeZone? reportingTimezone;

  /// Metric report start date (UTC). Format: YYYY-MM-DD
  String startDate;

  /// Which hour of the start date to begin the report. Only allowed for hourly reports.
  ///
  /// Minimum value: 0
  /// Maximum value: 23
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? startHour;

  /// List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
  List<AdAdsAnalyticsAsyncTargetingTypes> targetingTypes;

  /// Number of days to use as the conversion attribution window for a view action.
  ConversionAttributionWindowDays viewWindowDays;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdsAnalyticsCreateAsyncRequest &&
    _deepEquality.equals(other.adGroupIds, adGroupIds) &&
    _deepEquality.equals(other.adGroupStatuses, adGroupStatuses) &&
    _deepEquality.equals(other.adIds, adIds) &&
    _deepEquality.equals(other.adStatuses, adStatuses) &&
    _deepEquality.equals(other.attributionTypes, attributionTypes) &&
    other.campaignBrandLabel == campaignBrandLabel &&
    other.campaignCustomLabel == campaignCustomLabel &&
    _deepEquality.equals(other.campaignIds, campaignIds) &&
    _deepEquality.equals(other.campaignObjectiveTypes, campaignObjectiveTypes) &&
    _deepEquality.equals(other.campaignStatuses, campaignStatuses) &&
    other.clickWindowDays == clickWindowDays &&
    _deepEquality.equals(other.columns, columns) &&
    other.combineTargetingTypes == combineTargetingTypes &&
    other.conversionReportTime == conversionReportTime &&
    _deepEquality.equals(other.customConversionEventMetrics, customConversionEventMetrics) &&
    other.endDate == endDate &&
    other.endHour == endHour &&
    other.engagementWindowDays == engagementWindowDays &&
    other.granularity == granularity &&
    other.level == level &&
    _deepEquality.equals(other.metricsFilters, metricsFilters) &&
    other.primarySort == primarySort &&
    _deepEquality.equals(other.productGroupIds, productGroupIds) &&
    _deepEquality.equals(other.productGroupStatuses, productGroupStatuses) &&
    _deepEquality.equals(other.productItemIds, productItemIds) &&
    other.reportFormat == reportFormat &&
    other.reportingTimezone == reportingTimezone &&
    other.startDate == startDate &&
    other.startHour == startHour &&
    _deepEquality.equals(other.targetingTypes, targetingTypes) &&
    other.viewWindowDays == viewWindowDays;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adGroupIds.hashCode) +
    (adGroupStatuses.hashCode) +
    (adIds.hashCode) +
    (adStatuses.hashCode) +
    (attributionTypes.hashCode) +
    (campaignBrandLabel == null ? 0 : campaignBrandLabel!.hashCode) +
    (campaignCustomLabel == null ? 0 : campaignCustomLabel!.hashCode) +
    (campaignIds.hashCode) +
    (campaignObjectiveTypes.hashCode) +
    (campaignStatuses.hashCode) +
    (clickWindowDays.hashCode) +
    (columns.hashCode) +
    (combineTargetingTypes.hashCode) +
    (conversionReportTime.hashCode) +
    (customConversionEventMetrics.hashCode) +
    (endDate.hashCode) +
    (endHour == null ? 0 : endHour!.hashCode) +
    (engagementWindowDays.hashCode) +
    (granularity.hashCode) +
    (level == null ? 0 : level!.hashCode) +
    (metricsFilters.hashCode) +
    (primarySort.hashCode) +
    (productGroupIds.hashCode) +
    (productGroupStatuses.hashCode) +
    (productItemIds.hashCode) +
    (reportFormat.hashCode) +
    (reportingTimezone == null ? 0 : reportingTimezone!.hashCode) +
    (startDate.hashCode) +
    (startHour == null ? 0 : startHour!.hashCode) +
    (targetingTypes.hashCode) +
    (viewWindowDays.hashCode);

  @override
  String toString() => 'AdsAnalyticsCreateAsyncRequest[adGroupIds=$adGroupIds, adGroupStatuses=$adGroupStatuses, adIds=$adIds, adStatuses=$adStatuses, attributionTypes=$attributionTypes, campaignBrandLabel=$campaignBrandLabel, campaignCustomLabel=$campaignCustomLabel, campaignIds=$campaignIds, campaignObjectiveTypes=$campaignObjectiveTypes, campaignStatuses=$campaignStatuses, clickWindowDays=$clickWindowDays, columns=$columns, combineTargetingTypes=$combineTargetingTypes, conversionReportTime=$conversionReportTime, customConversionEventMetrics=$customConversionEventMetrics, endDate=$endDate, endHour=$endHour, engagementWindowDays=$engagementWindowDays, granularity=$granularity, level=$level, metricsFilters=$metricsFilters, primarySort=$primarySort, productGroupIds=$productGroupIds, productGroupStatuses=$productGroupStatuses, productItemIds=$productItemIds, reportFormat=$reportFormat, reportingTimezone=$reportingTimezone, startDate=$startDate, startHour=$startHour, targetingTypes=$targetingTypes, viewWindowDays=$viewWindowDays]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ad_group_ids'] = this.adGroupIds;
      json[r'ad_group_statuses'] = this.adGroupStatuses;
      json[r'ad_ids'] = this.adIds;
      json[r'ad_statuses'] = this.adStatuses;
      json[r'attribution_types'] = this.attributionTypes;
    if (this.campaignBrandLabel != null) {
      json[r'campaign_brand_label'] = this.campaignBrandLabel;
    } else {
      json[r'campaign_brand_label'] = null;
    }
    if (this.campaignCustomLabel != null) {
      json[r'campaign_custom_label'] = this.campaignCustomLabel;
    } else {
      json[r'campaign_custom_label'] = null;
    }
      json[r'campaign_ids'] = this.campaignIds;
      json[r'campaign_objective_types'] = this.campaignObjectiveTypes;
      json[r'campaign_statuses'] = this.campaignStatuses;
      json[r'click_window_days'] = this.clickWindowDays;
      json[r'columns'] = this.columns;
      json[r'combine_targeting_types'] = this.combineTargetingTypes;
      json[r'conversion_report_time'] = this.conversionReportTime;
      json[r'custom_conversion_event_metrics'] = this.customConversionEventMetrics;
      json[r'end_date'] = this.endDate;
    if (this.endHour != null) {
      json[r'end_hour'] = this.endHour;
    } else {
      json[r'end_hour'] = null;
    }
      json[r'engagement_window_days'] = this.engagementWindowDays;
      json[r'granularity'] = this.granularity;
    if (this.level != null) {
      json[r'level'] = this.level;
    } else {
      json[r'level'] = null;
    }
      json[r'metrics_filters'] = this.metricsFilters;
      json[r'primary_sort'] = this.primarySort;
      json[r'product_group_ids'] = this.productGroupIds;
      json[r'product_group_statuses'] = this.productGroupStatuses;
      json[r'product_item_ids'] = this.productItemIds;
      json[r'report_format'] = this.reportFormat;
    if (this.reportingTimezone != null) {
      json[r'reporting_timezone'] = this.reportingTimezone;
    } else {
      json[r'reporting_timezone'] = null;
    }
      json[r'start_date'] = this.startDate;
    if (this.startHour != null) {
      json[r'start_hour'] = this.startHour;
    } else {
      json[r'start_hour'] = null;
    }
      json[r'targeting_types'] = this.targetingTypes;
      json[r'view_window_days'] = this.viewWindowDays;
    return json;
  }

  /// Returns a new [AdsAnalyticsCreateAsyncRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdsAnalyticsCreateAsyncRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'end_date'), 'Required key "AdsAnalyticsCreateAsyncRequest[end_date]" is missing from JSON.');
        assert(json[r'end_date'] != null, 'Required key "AdsAnalyticsCreateAsyncRequest[end_date]" has a null value in JSON.');
        assert(json.containsKey(r'granularity'), 'Required key "AdsAnalyticsCreateAsyncRequest[granularity]" is missing from JSON.');
        assert(json[r'granularity'] != null, 'Required key "AdsAnalyticsCreateAsyncRequest[granularity]" has a null value in JSON.');
        assert(json.containsKey(r'start_date'), 'Required key "AdsAnalyticsCreateAsyncRequest[start_date]" is missing from JSON.');
        assert(json[r'start_date'] != null, 'Required key "AdsAnalyticsCreateAsyncRequest[start_date]" has a null value in JSON.');
        return true;
      }());

      return AdsAnalyticsCreateAsyncRequest(
        adGroupIds: json[r'ad_group_ids'] is Iterable
            ? (json[r'ad_group_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        adGroupStatuses: AdGroupSummaryStatus.listFromJson(json[r'ad_group_statuses']),
        adIds: json[r'ad_ids'] is Iterable
            ? (json[r'ad_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        adStatuses: PinPromotionSummaryStatus.listFromJson(json[r'ad_statuses']),
        attributionTypes: ConversionReportAttributionType.listFromJson(json[r'attribution_types']),
        campaignBrandLabel: mapValueOfType<String>(json, r'campaign_brand_label'),
        campaignCustomLabel: mapValueOfType<String>(json, r'campaign_custom_label'),
        campaignIds: json[r'campaign_ids'] is Iterable
            ? (json[r'campaign_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        campaignObjectiveTypes: CampaignObjectiveType.listFromJson(json[r'campaign_objective_types']),
        campaignStatuses: CampaignSummaryStatus.listFromJson(json[r'campaign_statuses']),
        clickWindowDays: ConversionAttributionWindowDays.fromJson(json[r'click_window_days']) ?? 30,
        columns: ReportingColumnAsync.listFromJson(json[r'columns']),
        combineTargetingTypes: mapValueOfType<bool>(json, r'combine_targeting_types') ?? false,
        conversionReportTime: ConversionReportTimeType.fromJson(json[r'conversion_report_time']) ?? ConversionReportTimeType.TIME_OF_AD_ACTION,
        customConversionEventMetrics: CustomConversionEventMetrics.listFromJson(json[r'custom_conversion_event_metrics']),
        endDate: mapValueOfType<String>(json, r'end_date')!,
        endHour: mapValueOfType<int>(json, r'end_hour'),
        engagementWindowDays: ConversionAttributionWindowDays.fromJson(json[r'engagement_window_days']) ?? 30,
        granularity: Granularity.fromJson(json[r'granularity'])!,
        level: MetricsReportingLevel.fromJson(json[r'level']),
        metricsFilters: AdsAnalyticsMetricsFilter.listFromJson(json[r'metrics_filters']),
        primarySort: PrimarySort.fromJson(json[r'primary_sort']) ?? PrimarySort.BY_ID,
        productGroupIds: json[r'product_group_ids'] is Iterable
            ? (json[r'product_group_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        productGroupStatuses: ProductGroupSummaryStatus.listFromJson(json[r'product_group_statuses']),
        productItemIds: json[r'product_item_ids'] is Iterable
            ? (json[r'product_item_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        reportFormat: DataOutputFormat.fromJson(json[r'report_format']) ?? DataOutputFormat.JSON,
        reportingTimezone: ReportingTimeZone.fromJson(json[r'reporting_timezone']),
        startDate: mapValueOfType<String>(json, r'start_date')!,
        startHour: mapValueOfType<int>(json, r'start_hour'),
        targetingTypes: AdAdsAnalyticsAsyncTargetingTypes.listFromJson(json[r'targeting_types']),
        viewWindowDays: ConversionAttributionWindowDays.fromJson(json[r'view_window_days']) ?? 1,
      );
    }
    return null;
  }

  static List<AdsAnalyticsCreateAsyncRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdsAnalyticsCreateAsyncRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdsAnalyticsCreateAsyncRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdsAnalyticsCreateAsyncRequest> mapFromJson(dynamic json) {
    final map = <String, AdsAnalyticsCreateAsyncRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdsAnalyticsCreateAsyncRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdsAnalyticsCreateAsyncRequest-objects as value to a dart map
  static Map<String, List<AdsAnalyticsCreateAsyncRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdsAnalyticsCreateAsyncRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdsAnalyticsCreateAsyncRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'end_date',
    'granularity',
    'start_date',
  };
}

