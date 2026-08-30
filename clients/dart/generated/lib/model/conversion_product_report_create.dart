//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionProductReportCreate {
  /// Returns a new [ConversionProductReportCreate] instance.
  ConversionProductReportCreate({
    this.adGroupIds = const [],
    this.campaignIds = const [],
    this.campaignObjectiveTypes = const [],
    this.clickWindowDays = 30,
    this.columns = const [],
    this.conversionProductAttributionType = ConversionProductAttributionType.DEFAULT,
    this.conversionProductBreakdown = ConversionProductReportBreakdownType.PRODUCT_BRAND,
    this.conversionReportTime = ConversionReportTimeType.TIME_OF_AD_ACTION,
    required this.endDate,
    required this.granularity,
    required this.level,
    this.productSkuIds = const [],
    required this.reportName,
    required this.startDate,
    this.viewWindowDays = 30,
  });

  ///   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.
  List<String> adGroupIds;

  ///   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.
  List<String> campaignIds;

  /// List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
  List<ConversionObjectiveType> campaignObjectiveTypes;

  /// Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  ConversionAttributionWindowDays clickWindowDays;

  /// Metric and entity columns
  List<ConversionProductReportingColumn> columns;

  ///   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.
  ConversionProductAttributionType conversionProductAttributionType;

  /// Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.
  ConversionProductReportBreakdownType conversionProductBreakdown;

  /// The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  ConversionReportTimeType conversionReportTime;

  ///   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.
  String endDate;

  /// Report granularity for time-based metric aggregation
  ConversionProductReportGranularity granularity;

  /// Level of the report
  ConversionProductReportLevel level;

  ///   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
  List<String> productSkuIds;

  /// Name of the conversion product report
  String reportName;

  ///   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.
  String startDate;

  /// Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  ConversionAttributionWindowDays viewWindowDays;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionProductReportCreate &&
    _deepEquality.equals(other.adGroupIds, adGroupIds) &&
    _deepEquality.equals(other.campaignIds, campaignIds) &&
    _deepEquality.equals(other.campaignObjectiveTypes, campaignObjectiveTypes) &&
    other.clickWindowDays == clickWindowDays &&
    _deepEquality.equals(other.columns, columns) &&
    other.conversionProductAttributionType == conversionProductAttributionType &&
    other.conversionProductBreakdown == conversionProductBreakdown &&
    other.conversionReportTime == conversionReportTime &&
    other.endDate == endDate &&
    other.granularity == granularity &&
    other.level == level &&
    _deepEquality.equals(other.productSkuIds, productSkuIds) &&
    other.reportName == reportName &&
    other.startDate == startDate &&
    other.viewWindowDays == viewWindowDays;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adGroupIds.hashCode) +
    (campaignIds.hashCode) +
    (campaignObjectiveTypes.hashCode) +
    (clickWindowDays.hashCode) +
    (columns.hashCode) +
    (conversionProductAttributionType.hashCode) +
    (conversionProductBreakdown.hashCode) +
    (conversionReportTime.hashCode) +
    (endDate.hashCode) +
    (granularity.hashCode) +
    (level.hashCode) +
    (productSkuIds.hashCode) +
    (reportName.hashCode) +
    (startDate.hashCode) +
    (viewWindowDays.hashCode);

  @override
  String toString() => 'ConversionProductReportCreate[adGroupIds=$adGroupIds, campaignIds=$campaignIds, campaignObjectiveTypes=$campaignObjectiveTypes, clickWindowDays=$clickWindowDays, columns=$columns, conversionProductAttributionType=$conversionProductAttributionType, conversionProductBreakdown=$conversionProductBreakdown, conversionReportTime=$conversionReportTime, endDate=$endDate, granularity=$granularity, level=$level, productSkuIds=$productSkuIds, reportName=$reportName, startDate=$startDate, viewWindowDays=$viewWindowDays]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ad_group_ids'] = this.adGroupIds;
      json[r'campaign_ids'] = this.campaignIds;
      json[r'campaign_objective_types'] = this.campaignObjectiveTypes;
      json[r'click_window_days'] = this.clickWindowDays;
      json[r'columns'] = this.columns;
      json[r'conversion_product_attribution_type'] = this.conversionProductAttributionType;
      json[r'conversion_product_breakdown'] = this.conversionProductBreakdown;
      json[r'conversion_report_time'] = this.conversionReportTime;
      json[r'end_date'] = this.endDate;
      json[r'granularity'] = this.granularity;
      json[r'level'] = this.level;
      json[r'product_sku_ids'] = this.productSkuIds;
      json[r'report_name'] = this.reportName;
      json[r'start_date'] = this.startDate;
      json[r'view_window_days'] = this.viewWindowDays;
    return json;
  }

  /// Returns a new [ConversionProductReportCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionProductReportCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'columns'), 'Required key "ConversionProductReportCreate[columns]" is missing from JSON.');
        assert(json[r'columns'] != null, 'Required key "ConversionProductReportCreate[columns]" has a null value in JSON.');
        assert(json.containsKey(r'end_date'), 'Required key "ConversionProductReportCreate[end_date]" is missing from JSON.');
        assert(json[r'end_date'] != null, 'Required key "ConversionProductReportCreate[end_date]" has a null value in JSON.');
        assert(json.containsKey(r'granularity'), 'Required key "ConversionProductReportCreate[granularity]" is missing from JSON.');
        assert(json[r'granularity'] != null, 'Required key "ConversionProductReportCreate[granularity]" has a null value in JSON.');
        assert(json.containsKey(r'level'), 'Required key "ConversionProductReportCreate[level]" is missing from JSON.');
        assert(json[r'level'] != null, 'Required key "ConversionProductReportCreate[level]" has a null value in JSON.');
        assert(json.containsKey(r'report_name'), 'Required key "ConversionProductReportCreate[report_name]" is missing from JSON.');
        assert(json[r'report_name'] != null, 'Required key "ConversionProductReportCreate[report_name]" has a null value in JSON.');
        assert(json.containsKey(r'start_date'), 'Required key "ConversionProductReportCreate[start_date]" is missing from JSON.');
        assert(json[r'start_date'] != null, 'Required key "ConversionProductReportCreate[start_date]" has a null value in JSON.');
        return true;
      }());

      return ConversionProductReportCreate(
        adGroupIds: json[r'ad_group_ids'] is Iterable
            ? (json[r'ad_group_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        campaignIds: json[r'campaign_ids'] is Iterable
            ? (json[r'campaign_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        campaignObjectiveTypes: ConversionObjectiveType.listFromJson(json[r'campaign_objective_types']),
        clickWindowDays: ConversionAttributionWindowDays.fromJson(json[r'click_window_days']) ?? 30,
        columns: ConversionProductReportingColumn.listFromJson(json[r'columns']),
        conversionProductAttributionType: ConversionProductAttributionType.fromJson(json[r'conversion_product_attribution_type']) ?? ConversionProductAttributionType.DEFAULT,
        conversionProductBreakdown: ConversionProductReportBreakdownType.fromJson(json[r'conversion_product_breakdown']) ?? ConversionProductReportBreakdownType.PRODUCT_BRAND,
        conversionReportTime: ConversionReportTimeType.fromJson(json[r'conversion_report_time']) ?? ConversionReportTimeType.TIME_OF_AD_ACTION,
        endDate: mapValueOfType<String>(json, r'end_date')!,
        granularity: ConversionProductReportGranularity.fromJson(json[r'granularity'])!,
        level: ConversionProductReportLevel.fromJson(json[r'level'])!,
        productSkuIds: json[r'product_sku_ids'] is Iterable
            ? (json[r'product_sku_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        reportName: mapValueOfType<String>(json, r'report_name')!,
        startDate: mapValueOfType<String>(json, r'start_date')!,
        viewWindowDays: ConversionAttributionWindowDays.fromJson(json[r'view_window_days']) ?? 30,
      );
    }
    return null;
  }

  static List<ConversionProductReportCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionProductReportCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionProductReportCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionProductReportCreate> mapFromJson(dynamic json) {
    final map = <String, ConversionProductReportCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionProductReportCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionProductReportCreate-objects as value to a dart map
  static Map<String, List<ConversionProductReportCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionProductReportCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionProductReportCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'columns',
    'end_date',
    'granularity',
    'level',
    'report_name',
    'start_date',
  };
}

