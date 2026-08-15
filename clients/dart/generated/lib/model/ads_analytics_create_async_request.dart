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
    this.attributionTypes = const [],
    this.clickWindowDays = ConversionAttributionWindowDays.number30,
    this.conversionReportTime = 'TIME_OF_AD_ACTION',
    required this.endDate,
    this.engagementWindowDays = ConversionAttributionWindowDays.number30,
    required this.granularity,
    required this.startDate,
    this.viewWindowDays = ConversionAttributionWindowDays.number1,
    this.campaignIds = const [],
    this.campaignStatuses = const [],
    this.campaignObjectiveTypes = const [],
    this.campaignBrandLabel,
    this.adGroupIds = const [],
    this.adGroupStatuses = const [],
    this.adIds = const [],
    this.adStatuses = const [],
    this.productGroupIds = const [],
    this.productGroupStatuses = const [],
    this.productItemIds = const [],
    this.targetingTypes = const [],
    this.metricsFilters = const [],
    this.columns = const [],
    this.combineTargetingTypes = false,
    this.customConversionEventMetrics = const [],
    this.endHour,
    required this.level,
    this.primarySort,
    this.reportFormat = 'JSON',
    this.reportingTimezone,
    this.startHour,
  });

  /// List of types of attribution for the conversion report
  List<ConversionReportAttributionType> attributionTypes;

  /// Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  ConversionAttributionWindowDays clickWindowDays;

  /// The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  ConversionReportTimeType conversionReportTime;

  /// Metric report end date (UTC). Format: YYYY-MM-DD
  String endDate;

  /// Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  ConversionAttributionWindowDays engagementWindowDays;

  /// TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
  Granularity granularity;

  /// Metric report start date (UTC). Format: YYYY-MM-DD
  String startDate;

  /// Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  ConversionAttributionWindowDays viewWindowDays;

  /// List of campaign ids
  List<String> campaignIds;

  /// List of status values for filtering
  List<CampaignSummaryStatus> campaignStatuses;

  /// List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
  List<ObjectiveType> campaignObjectiveTypes;

  /// Campaign brand label for filtering.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? campaignBrandLabel;

  /// List of ad group ids
  List<String> adGroupIds;

  /// List of values for filtering
  List<AdGroupSummaryStatus> adGroupStatuses;

  /// List of ad ids [This parameter is no supported for Product Item Level Reports]
  List<String> adIds;

  /// List of values for filtering [This parameter is not supported for Product Item Level Reports]
  List<PinPromotionSummaryStatus> adStatuses;

  /// List of product group ids
  List<String> productGroupIds;

  /// List of values for filtering
  List<ProductGroupSummaryStatus> productGroupStatuses;

  /// List of product item ids
  List<String> productItemIds;

  /// List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
  List<AdsAnalyticsCreateAsyncRequestTargetingTypesEnum> targetingTypes;

  /// List of metrics filters
  List<AdsAnalyticsMetricsFilter> metricsFilters;

  /// Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports.
  List<ReportingColumnAsync> columns;

  /// Determines if the targeting types included in the request should be consolidated into a single breakdown. For example, when combine_targeting_types is set to true, if GENDER and COUNTRY are targeting types in the request, the response will have a targeting type of GENDER_AND_COUNTRY and targeting values such as female&US. This feature is currently in BETA and is not available to all users.
  bool combineTargetingTypes;

  /// List of advertiser-defined custom conversion event metrics to include in the report
  List<AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics> customConversionEventMetrics;

  /// Which hour of the end date to stop the report (inclusive). For example, with an end_date of '2020-01-01' and end_hour of '15', the report will contain metrics up to '2020-01-01 14:59:59'. The entire day will be included if no end hour is provided. Only allowed for hourly reports.
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

  /// Level of the report
  MetricsReportingLevel level;

  /// Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests.
  AdsAnalyticsCreateAsyncRequestPrimarySortEnum? primarySort;

  /// Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0.
  DataOutputFormat reportFormat;

  /// Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ReportingTimeZone? reportingTimezone;

  /// Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports.
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

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdsAnalyticsCreateAsyncRequest &&
    _deepEquality.equals(other.attributionTypes, attributionTypes) &&
    other.clickWindowDays == clickWindowDays &&
    other.conversionReportTime == conversionReportTime &&
    other.endDate == endDate &&
    other.engagementWindowDays == engagementWindowDays &&
    other.granularity == granularity &&
    other.startDate == startDate &&
    other.viewWindowDays == viewWindowDays &&
    _deepEquality.equals(other.campaignIds, campaignIds) &&
    _deepEquality.equals(other.campaignStatuses, campaignStatuses) &&
    _deepEquality.equals(other.campaignObjectiveTypes, campaignObjectiveTypes) &&
    other.campaignBrandLabel == campaignBrandLabel &&
    _deepEquality.equals(other.adGroupIds, adGroupIds) &&
    _deepEquality.equals(other.adGroupStatuses, adGroupStatuses) &&
    _deepEquality.equals(other.adIds, adIds) &&
    _deepEquality.equals(other.adStatuses, adStatuses) &&
    _deepEquality.equals(other.productGroupIds, productGroupIds) &&
    _deepEquality.equals(other.productGroupStatuses, productGroupStatuses) &&
    _deepEquality.equals(other.productItemIds, productItemIds) &&
    _deepEquality.equals(other.targetingTypes, targetingTypes) &&
    _deepEquality.equals(other.metricsFilters, metricsFilters) &&
    _deepEquality.equals(other.columns, columns) &&
    other.combineTargetingTypes == combineTargetingTypes &&
    _deepEquality.equals(other.customConversionEventMetrics, customConversionEventMetrics) &&
    other.endHour == endHour &&
    other.level == level &&
    other.primarySort == primarySort &&
    other.reportFormat == reportFormat &&
    other.reportingTimezone == reportingTimezone &&
    other.startHour == startHour;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (attributionTypes.hashCode) +
    (clickWindowDays.hashCode) +
    (conversionReportTime.hashCode) +
    (endDate.hashCode) +
    (engagementWindowDays.hashCode) +
    (granularity.hashCode) +
    (startDate.hashCode) +
    (viewWindowDays.hashCode) +
    (campaignIds.hashCode) +
    (campaignStatuses.hashCode) +
    (campaignObjectiveTypes.hashCode) +
    (campaignBrandLabel == null ? 0 : campaignBrandLabel!.hashCode) +
    (adGroupIds.hashCode) +
    (adGroupStatuses.hashCode) +
    (adIds.hashCode) +
    (adStatuses.hashCode) +
    (productGroupIds.hashCode) +
    (productGroupStatuses.hashCode) +
    (productItemIds.hashCode) +
    (targetingTypes.hashCode) +
    (metricsFilters.hashCode) +
    (columns.hashCode) +
    (combineTargetingTypes.hashCode) +
    (customConversionEventMetrics.hashCode) +
    (endHour == null ? 0 : endHour!.hashCode) +
    (level.hashCode) +
    (primarySort == null ? 0 : primarySort!.hashCode) +
    (reportFormat.hashCode) +
    (reportingTimezone == null ? 0 : reportingTimezone!.hashCode) +
    (startHour == null ? 0 : startHour!.hashCode);

  @override
  String toString() => 'AdsAnalyticsCreateAsyncRequest[attributionTypes=$attributionTypes, clickWindowDays=$clickWindowDays, conversionReportTime=$conversionReportTime, endDate=$endDate, engagementWindowDays=$engagementWindowDays, granularity=$granularity, startDate=$startDate, viewWindowDays=$viewWindowDays, campaignIds=$campaignIds, campaignStatuses=$campaignStatuses, campaignObjectiveTypes=$campaignObjectiveTypes, campaignBrandLabel=$campaignBrandLabel, adGroupIds=$adGroupIds, adGroupStatuses=$adGroupStatuses, adIds=$adIds, adStatuses=$adStatuses, productGroupIds=$productGroupIds, productGroupStatuses=$productGroupStatuses, productItemIds=$productItemIds, targetingTypes=$targetingTypes, metricsFilters=$metricsFilters, columns=$columns, combineTargetingTypes=$combineTargetingTypes, customConversionEventMetrics=$customConversionEventMetrics, endHour=$endHour, level=$level, primarySort=$primarySort, reportFormat=$reportFormat, reportingTimezone=$reportingTimezone, startHour=$startHour]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'attribution_types'] = this.attributionTypes;
      json[r'click_window_days'] = this.clickWindowDays;
      json[r'conversion_report_time'] = this.conversionReportTime;
      json[r'end_date'] = this.endDate;
      json[r'engagement_window_days'] = this.engagementWindowDays;
      json[r'granularity'] = this.granularity;
      json[r'start_date'] = this.startDate;
      json[r'view_window_days'] = this.viewWindowDays;
      json[r'campaign_ids'] = this.campaignIds;
      json[r'campaign_statuses'] = this.campaignStatuses;
      json[r'campaign_objective_types'] = this.campaignObjectiveTypes;
    if (this.campaignBrandLabel != null) {
      json[r'campaign_brand_label'] = this.campaignBrandLabel;
    } else {
      json[r'campaign_brand_label'] = null;
    }
      json[r'ad_group_ids'] = this.adGroupIds;
      json[r'ad_group_statuses'] = this.adGroupStatuses;
      json[r'ad_ids'] = this.adIds;
      json[r'ad_statuses'] = this.adStatuses;
      json[r'product_group_ids'] = this.productGroupIds;
      json[r'product_group_statuses'] = this.productGroupStatuses;
      json[r'product_item_ids'] = this.productItemIds;
      json[r'targeting_types'] = this.targetingTypes;
      json[r'metrics_filters'] = this.metricsFilters;
      json[r'columns'] = this.columns;
      json[r'combine_targeting_types'] = this.combineTargetingTypes;
      json[r'custom_conversion_event_metrics'] = this.customConversionEventMetrics;
    if (this.endHour != null) {
      json[r'end_hour'] = this.endHour;
    } else {
      json[r'end_hour'] = null;
    }
      json[r'level'] = this.level;
    if (this.primarySort != null) {
      json[r'primary_sort'] = this.primarySort;
    } else {
      json[r'primary_sort'] = null;
    }
      json[r'report_format'] = this.reportFormat;
    if (this.reportingTimezone != null) {
      json[r'reporting_timezone'] = this.reportingTimezone;
    } else {
      json[r'reporting_timezone'] = null;
    }
    if (this.startHour != null) {
      json[r'start_hour'] = this.startHour;
    } else {
      json[r'start_hour'] = null;
    }
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
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AdsAnalyticsCreateAsyncRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AdsAnalyticsCreateAsyncRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AdsAnalyticsCreateAsyncRequest(
        attributionTypes: ConversionReportAttributionType.listFromJson(json[r'attribution_types']),
        clickWindowDays: ConversionAttributionWindowDays.fromJson(json[r'click_window_days']) ?? ConversionAttributionWindowDays.number30,
        conversionReportTime: ConversionReportTimeType.fromJson(json[r'conversion_report_time']) ?? 'TIME_OF_AD_ACTION',
        endDate: mapValueOfType<String>(json, r'end_date')!,
        engagementWindowDays: ConversionAttributionWindowDays.fromJson(json[r'engagement_window_days']) ?? ConversionAttributionWindowDays.number30,
        granularity: Granularity.fromJson(json[r'granularity'])!,
        startDate: mapValueOfType<String>(json, r'start_date')!,
        viewWindowDays: ConversionAttributionWindowDays.fromJson(json[r'view_window_days']) ?? ConversionAttributionWindowDays.number1,
        campaignIds: json[r'campaign_ids'] is Iterable
            ? (json[r'campaign_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        campaignStatuses: CampaignSummaryStatus.listFromJson(json[r'campaign_statuses']),
        campaignObjectiveTypes: ObjectiveType.listFromJson(json[r'campaign_objective_types']),
        campaignBrandLabel: mapValueOfType<String>(json, r'campaign_brand_label'),
        adGroupIds: json[r'ad_group_ids'] is Iterable
            ? (json[r'ad_group_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        adGroupStatuses: AdGroupSummaryStatus.listFromJson(json[r'ad_group_statuses']),
        adIds: json[r'ad_ids'] is Iterable
            ? (json[r'ad_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        adStatuses: PinPromotionSummaryStatus.listFromJson(json[r'ad_statuses']),
        productGroupIds: json[r'product_group_ids'] is Iterable
            ? (json[r'product_group_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        productGroupStatuses: ProductGroupSummaryStatus.listFromJson(json[r'product_group_statuses']),
        productItemIds: json[r'product_item_ids'] is Iterable
            ? (json[r'product_item_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        targetingTypes: AdsAnalyticsCreateAsyncRequestTargetingTypesEnum.listFromJson(json[r'targeting_types']),
        metricsFilters: AdsAnalyticsMetricsFilter.listFromJson(json[r'metrics_filters']),
        columns: ReportingColumnAsync.listFromJson(json[r'columns']),
        combineTargetingTypes: mapValueOfType<bool>(json, r'combine_targeting_types') ?? false,
        customConversionEventMetrics: AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics.listFromJson(json[r'custom_conversion_event_metrics']),
        endHour: mapValueOfType<int>(json, r'end_hour'),
        level: MetricsReportingLevel.fromJson(json[r'level'])!,
        primarySort: AdsAnalyticsCreateAsyncRequestPrimarySortEnum.fromJson(json[r'primary_sort']),
        reportFormat: DataOutputFormat.fromJson(json[r'report_format']) ?? 'JSON',
        reportingTimezone: ReportingTimeZone.fromJson(json[r'reporting_timezone']),
        startHour: mapValueOfType<int>(json, r'start_hour'),
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
    'columns',
    'level',
  };
}

/// Reporting targeting type
class AdsAnalyticsCreateAsyncRequestTargetingTypesEnum {
  /// Instantiate a new enum with the provided [value].
  const AdsAnalyticsCreateAsyncRequestTargetingTypesEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const KEYWORD = AdsAnalyticsCreateAsyncRequestTargetingTypesEnum._(r'KEYWORD');
  static const APPTYPE = AdsAnalyticsCreateAsyncRequestTargetingTypesEnum._(r'APPTYPE');
  static const GENDER = AdsAnalyticsCreateAsyncRequestTargetingTypesEnum._(r'GENDER');
  static const LOCATION = AdsAnalyticsCreateAsyncRequestTargetingTypesEnum._(r'LOCATION');
  static const PLACEMENT = AdsAnalyticsCreateAsyncRequestTargetingTypesEnum._(r'PLACEMENT');
  static const COUNTRY = AdsAnalyticsCreateAsyncRequestTargetingTypesEnum._(r'COUNTRY');
  static const TARGETED_INTEREST = AdsAnalyticsCreateAsyncRequestTargetingTypesEnum._(r'TARGETED_INTEREST');
  static const PINNER_INTEREST = AdsAnalyticsCreateAsyncRequestTargetingTypesEnum._(r'PINNER_INTEREST');
  static const AUDIENCE_INCLUDE = AdsAnalyticsCreateAsyncRequestTargetingTypesEnum._(r'AUDIENCE_INCLUDE');
  static const GEO = AdsAnalyticsCreateAsyncRequestTargetingTypesEnum._(r'GEO');
  static const AGE_BUCKET = AdsAnalyticsCreateAsyncRequestTargetingTypesEnum._(r'AGE_BUCKET');
  static const REGION = AdsAnalyticsCreateAsyncRequestTargetingTypesEnum._(r'REGION');
  static const MEDIA_TYPE = AdsAnalyticsCreateAsyncRequestTargetingTypesEnum._(r'MEDIA_TYPE');
  static const AGE_BUCKET_AND_GENDER = AdsAnalyticsCreateAsyncRequestTargetingTypesEnum._(r'AGE_BUCKET_AND_GENDER');
  static const AUDIENCE_MULTIPLIER = AdsAnalyticsCreateAsyncRequestTargetingTypesEnum._(r'AUDIENCE_MULTIPLIER');
  static const CREATIVE_ENHANCEMENTS = AdsAnalyticsCreateAsyncRequestTargetingTypesEnum._(r'CREATIVE_ENHANCEMENTS');
  static const LOCAL_ADS_STORE_CODE = AdsAnalyticsCreateAsyncRequestTargetingTypesEnum._(r'LOCAL_ADS_STORE_CODE');

  /// List of all possible values in this [enum][AdsAnalyticsCreateAsyncRequestTargetingTypesEnum].
  static const values = <AdsAnalyticsCreateAsyncRequestTargetingTypesEnum>[
    KEYWORD,
    APPTYPE,
    GENDER,
    LOCATION,
    PLACEMENT,
    COUNTRY,
    TARGETED_INTEREST,
    PINNER_INTEREST,
    AUDIENCE_INCLUDE,
    GEO,
    AGE_BUCKET,
    REGION,
    MEDIA_TYPE,
    AGE_BUCKET_AND_GENDER,
    AUDIENCE_MULTIPLIER,
    CREATIVE_ENHANCEMENTS,
    LOCAL_ADS_STORE_CODE,
  ];

  static AdsAnalyticsCreateAsyncRequestTargetingTypesEnum? fromJson(dynamic value) => AdsAnalyticsCreateAsyncRequestTargetingTypesEnumTypeTransformer().decode(value);

  static List<AdsAnalyticsCreateAsyncRequestTargetingTypesEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdsAnalyticsCreateAsyncRequestTargetingTypesEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdsAnalyticsCreateAsyncRequestTargetingTypesEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdsAnalyticsCreateAsyncRequestTargetingTypesEnum] to String,
/// and [decode] dynamic data back to [AdsAnalyticsCreateAsyncRequestTargetingTypesEnum].
class AdsAnalyticsCreateAsyncRequestTargetingTypesEnumTypeTransformer {
  factory AdsAnalyticsCreateAsyncRequestTargetingTypesEnumTypeTransformer() => _instance ??= const AdsAnalyticsCreateAsyncRequestTargetingTypesEnumTypeTransformer._();

  const AdsAnalyticsCreateAsyncRequestTargetingTypesEnumTypeTransformer._();

  String encode(AdsAnalyticsCreateAsyncRequestTargetingTypesEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AdsAnalyticsCreateAsyncRequestTargetingTypesEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdsAnalyticsCreateAsyncRequestTargetingTypesEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'KEYWORD': return AdsAnalyticsCreateAsyncRequestTargetingTypesEnum.KEYWORD;
        case r'APPTYPE': return AdsAnalyticsCreateAsyncRequestTargetingTypesEnum.APPTYPE;
        case r'GENDER': return AdsAnalyticsCreateAsyncRequestTargetingTypesEnum.GENDER;
        case r'LOCATION': return AdsAnalyticsCreateAsyncRequestTargetingTypesEnum.LOCATION;
        case r'PLACEMENT': return AdsAnalyticsCreateAsyncRequestTargetingTypesEnum.PLACEMENT;
        case r'COUNTRY': return AdsAnalyticsCreateAsyncRequestTargetingTypesEnum.COUNTRY;
        case r'TARGETED_INTEREST': return AdsAnalyticsCreateAsyncRequestTargetingTypesEnum.TARGETED_INTEREST;
        case r'PINNER_INTEREST': return AdsAnalyticsCreateAsyncRequestTargetingTypesEnum.PINNER_INTEREST;
        case r'AUDIENCE_INCLUDE': return AdsAnalyticsCreateAsyncRequestTargetingTypesEnum.AUDIENCE_INCLUDE;
        case r'GEO': return AdsAnalyticsCreateAsyncRequestTargetingTypesEnum.GEO;
        case r'AGE_BUCKET': return AdsAnalyticsCreateAsyncRequestTargetingTypesEnum.AGE_BUCKET;
        case r'REGION': return AdsAnalyticsCreateAsyncRequestTargetingTypesEnum.REGION;
        case r'MEDIA_TYPE': return AdsAnalyticsCreateAsyncRequestTargetingTypesEnum.MEDIA_TYPE;
        case r'AGE_BUCKET_AND_GENDER': return AdsAnalyticsCreateAsyncRequestTargetingTypesEnum.AGE_BUCKET_AND_GENDER;
        case r'AUDIENCE_MULTIPLIER': return AdsAnalyticsCreateAsyncRequestTargetingTypesEnum.AUDIENCE_MULTIPLIER;
        case r'CREATIVE_ENHANCEMENTS': return AdsAnalyticsCreateAsyncRequestTargetingTypesEnum.CREATIVE_ENHANCEMENTS;
        case r'LOCAL_ADS_STORE_CODE': return AdsAnalyticsCreateAsyncRequestTargetingTypesEnum.LOCAL_ADS_STORE_CODE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AdsAnalyticsCreateAsyncRequestTargetingTypesEnumTypeTransformer] instance.
  static AdsAnalyticsCreateAsyncRequestTargetingTypesEnumTypeTransformer? _instance;
}


/// Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests.
class AdsAnalyticsCreateAsyncRequestPrimarySortEnum {
  /// Instantiate a new enum with the provided [value].
  const AdsAnalyticsCreateAsyncRequestPrimarySortEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const BY_ID = AdsAnalyticsCreateAsyncRequestPrimarySortEnum._(r'BY_ID');
  static const BY_DATE = AdsAnalyticsCreateAsyncRequestPrimarySortEnum._(r'BY_DATE');

  /// List of all possible values in this [enum][AdsAnalyticsCreateAsyncRequestPrimarySortEnum].
  static const values = <AdsAnalyticsCreateAsyncRequestPrimarySortEnum>[
    BY_ID,
    BY_DATE,
  ];

  static AdsAnalyticsCreateAsyncRequestPrimarySortEnum? fromJson(dynamic value) => AdsAnalyticsCreateAsyncRequestPrimarySortEnumTypeTransformer().decode(value);

  static List<AdsAnalyticsCreateAsyncRequestPrimarySortEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdsAnalyticsCreateAsyncRequestPrimarySortEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdsAnalyticsCreateAsyncRequestPrimarySortEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdsAnalyticsCreateAsyncRequestPrimarySortEnum] to String,
/// and [decode] dynamic data back to [AdsAnalyticsCreateAsyncRequestPrimarySortEnum].
class AdsAnalyticsCreateAsyncRequestPrimarySortEnumTypeTransformer {
  factory AdsAnalyticsCreateAsyncRequestPrimarySortEnumTypeTransformer() => _instance ??= const AdsAnalyticsCreateAsyncRequestPrimarySortEnumTypeTransformer._();

  const AdsAnalyticsCreateAsyncRequestPrimarySortEnumTypeTransformer._();

  String encode(AdsAnalyticsCreateAsyncRequestPrimarySortEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AdsAnalyticsCreateAsyncRequestPrimarySortEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdsAnalyticsCreateAsyncRequestPrimarySortEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'BY_ID': return AdsAnalyticsCreateAsyncRequestPrimarySortEnum.BY_ID;
        case r'BY_DATE': return AdsAnalyticsCreateAsyncRequestPrimarySortEnum.BY_DATE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AdsAnalyticsCreateAsyncRequestPrimarySortEnumTypeTransformer] instance.
  static AdsAnalyticsCreateAsyncRequestPrimarySortEnumTypeTransformer? _instance;
}


