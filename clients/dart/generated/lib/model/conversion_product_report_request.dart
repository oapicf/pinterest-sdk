//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionProductReportRequest {
  /// Returns a new [ConversionProductReportRequest] instance.
  ConversionProductReportRequest({
    this.adGroupIds = const [],
    this.campaignIds = const [],
    this.campaignObjectiveTypes = const [],
    this.clickWindowDays = ConversionAttributionWindowDays.number30,
    this.columns = const [],
    this.conversionProductAttributionType,
    this.conversionProductBreakdown,
    this.conversionReportTime = 'TIME_OF_AD_ACTION',
    required this.endDate,
    required this.granularity,
    required this.level,
    this.productSkuIds = const [],
    required this.reportName,
    required this.startDate,
    this.viewWindowDays = ConversionAttributionWindowDays.number30,
  });

  /// List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP.
  List<String> adGroupIds;

  /// List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN.
  List<String> campaignIds;

  /// List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
  List<ObjectiveType> campaignObjectiveTypes;

  /// Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  ConversionAttributionWindowDays clickWindowDays;

  /// Metric and entity columns
  List<ConversionProductReportingColumn> columns;

  ConversionProductReportRequestConversionProductAttributionTypeEnum? conversionProductAttributionType;

  ConversionProductReportRequestConversionProductBreakdownEnum? conversionProductBreakdown;

  /// The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  ConversionReportTimeType conversionReportTime;

  /// Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports.
  String endDate;

  /// TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.
  ConversionProductReportRequestGranularityEnum granularity;

  /// Level of the report
  ConversionProductReportRequestLevelEnum level;

  /// List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
  List<String> productSkuIds;

  /// Name of the conversion product report.
  String reportName;

  /// Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required.
  String startDate;

  /// Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day.
  ConversionAttributionWindowDays viewWindowDays;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionProductReportRequest &&
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
    (conversionProductAttributionType == null ? 0 : conversionProductAttributionType!.hashCode) +
    (conversionProductBreakdown == null ? 0 : conversionProductBreakdown!.hashCode) +
    (conversionReportTime.hashCode) +
    (endDate.hashCode) +
    (granularity.hashCode) +
    (level.hashCode) +
    (productSkuIds.hashCode) +
    (reportName.hashCode) +
    (startDate.hashCode) +
    (viewWindowDays.hashCode);

  @override
  String toString() => 'ConversionProductReportRequest[adGroupIds=$adGroupIds, campaignIds=$campaignIds, campaignObjectiveTypes=$campaignObjectiveTypes, clickWindowDays=$clickWindowDays, columns=$columns, conversionProductAttributionType=$conversionProductAttributionType, conversionProductBreakdown=$conversionProductBreakdown, conversionReportTime=$conversionReportTime, endDate=$endDate, granularity=$granularity, level=$level, productSkuIds=$productSkuIds, reportName=$reportName, startDate=$startDate, viewWindowDays=$viewWindowDays]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ad_group_ids'] = this.adGroupIds;
      json[r'campaign_ids'] = this.campaignIds;
      json[r'campaign_objective_types'] = this.campaignObjectiveTypes;
      json[r'click_window_days'] = this.clickWindowDays;
      json[r'columns'] = this.columns;
    if (this.conversionProductAttributionType != null) {
      json[r'conversion_product_attribution_type'] = this.conversionProductAttributionType;
    } else {
      json[r'conversion_product_attribution_type'] = null;
    }
    if (this.conversionProductBreakdown != null) {
      json[r'conversion_product_breakdown'] = this.conversionProductBreakdown;
    } else {
      json[r'conversion_product_breakdown'] = null;
    }
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

  /// Returns a new [ConversionProductReportRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionProductReportRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ConversionProductReportRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ConversionProductReportRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ConversionProductReportRequest(
        adGroupIds: json[r'ad_group_ids'] is Iterable
            ? (json[r'ad_group_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        campaignIds: json[r'campaign_ids'] is Iterable
            ? (json[r'campaign_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        campaignObjectiveTypes: ObjectiveType.listFromJson(json[r'campaign_objective_types']),
        clickWindowDays: ConversionAttributionWindowDays.fromJson(json[r'click_window_days']) ?? ConversionAttributionWindowDays.number30,
        columns: ConversionProductReportingColumn.listFromJson(json[r'columns']),
        conversionProductAttributionType: ConversionProductReportRequestConversionProductAttributionTypeEnum.fromJson(json[r'conversion_product_attribution_type']),
        conversionProductBreakdown: ConversionProductReportRequestConversionProductBreakdownEnum.fromJson(json[r'conversion_product_breakdown']),
        conversionReportTime: ConversionReportTimeType.fromJson(json[r'conversion_report_time']) ?? 'TIME_OF_AD_ACTION',
        endDate: mapValueOfType<String>(json, r'end_date')!,
        granularity: ConversionProductReportRequestGranularityEnum.fromJson(json[r'granularity'])!,
        level: ConversionProductReportRequestLevelEnum.fromJson(json[r'level'])!,
        productSkuIds: json[r'product_sku_ids'] is Iterable
            ? (json[r'product_sku_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        reportName: mapValueOfType<String>(json, r'report_name')!,
        startDate: mapValueOfType<String>(json, r'start_date')!,
        viewWindowDays: ConversionAttributionWindowDays.fromJson(json[r'view_window_days']) ?? ConversionAttributionWindowDays.number30,
      );
    }
    return null;
  }

  static List<ConversionProductReportRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionProductReportRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionProductReportRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionProductReportRequest> mapFromJson(dynamic json) {
    final map = <String, ConversionProductReportRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionProductReportRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionProductReportRequest-objects as value to a dart map
  static Map<String, List<ConversionProductReportRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionProductReportRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionProductReportRequest.listFromJson(entry.value, growable: growable,);
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


class ConversionProductReportRequestConversionProductAttributionTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const ConversionProductReportRequestConversionProductAttributionTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const DEFAULT = ConversionProductReportRequestConversionProductAttributionTypeEnum._(r'DEFAULT');
  static const BRAND_ATTRIBUTION = ConversionProductReportRequestConversionProductAttributionTypeEnum._(r'BRAND_ATTRIBUTION');

  /// List of all possible values in this [enum][ConversionProductReportRequestConversionProductAttributionTypeEnum].
  static const values = <ConversionProductReportRequestConversionProductAttributionTypeEnum>[
    DEFAULT,
    BRAND_ATTRIBUTION,
  ];

  static ConversionProductReportRequestConversionProductAttributionTypeEnum? fromJson(dynamic value) => ConversionProductReportRequestConversionProductAttributionTypeEnumTypeTransformer().decode(value);

  static List<ConversionProductReportRequestConversionProductAttributionTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionProductReportRequestConversionProductAttributionTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionProductReportRequestConversionProductAttributionTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ConversionProductReportRequestConversionProductAttributionTypeEnum] to String,
/// and [decode] dynamic data back to [ConversionProductReportRequestConversionProductAttributionTypeEnum].
class ConversionProductReportRequestConversionProductAttributionTypeEnumTypeTransformer {
  factory ConversionProductReportRequestConversionProductAttributionTypeEnumTypeTransformer() => _instance ??= const ConversionProductReportRequestConversionProductAttributionTypeEnumTypeTransformer._();

  const ConversionProductReportRequestConversionProductAttributionTypeEnumTypeTransformer._();

  String encode(ConversionProductReportRequestConversionProductAttributionTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ConversionProductReportRequestConversionProductAttributionTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ConversionProductReportRequestConversionProductAttributionTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'DEFAULT': return ConversionProductReportRequestConversionProductAttributionTypeEnum.DEFAULT;
        case r'BRAND_ATTRIBUTION': return ConversionProductReportRequestConversionProductAttributionTypeEnum.BRAND_ATTRIBUTION;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ConversionProductReportRequestConversionProductAttributionTypeEnumTypeTransformer] instance.
  static ConversionProductReportRequestConversionProductAttributionTypeEnumTypeTransformer? _instance;
}



class ConversionProductReportRequestConversionProductBreakdownEnum {
  /// Instantiate a new enum with the provided [value].
  const ConversionProductReportRequestConversionProductBreakdownEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PRODUCT_BRAND = ConversionProductReportRequestConversionProductBreakdownEnum._(r'PRODUCT_BRAND');
  static const PRODUCT_CATEGORY = ConversionProductReportRequestConversionProductBreakdownEnum._(r'PRODUCT_CATEGORY');
  static const PRODUCT_BRAND_AND_CATEGORY = ConversionProductReportRequestConversionProductBreakdownEnum._(r'PRODUCT_BRAND_AND_CATEGORY');
  static const PRODUCT_SKU = ConversionProductReportRequestConversionProductBreakdownEnum._(r'PRODUCT_SKU');
  static const PRODUCT_SKU_GROUP = ConversionProductReportRequestConversionProductBreakdownEnum._(r'PRODUCT_SKU_GROUP');

  /// List of all possible values in this [enum][ConversionProductReportRequestConversionProductBreakdownEnum].
  static const values = <ConversionProductReportRequestConversionProductBreakdownEnum>[
    PRODUCT_BRAND,
    PRODUCT_CATEGORY,
    PRODUCT_BRAND_AND_CATEGORY,
    PRODUCT_SKU,
    PRODUCT_SKU_GROUP,
  ];

  static ConversionProductReportRequestConversionProductBreakdownEnum? fromJson(dynamic value) => ConversionProductReportRequestConversionProductBreakdownEnumTypeTransformer().decode(value);

  static List<ConversionProductReportRequestConversionProductBreakdownEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionProductReportRequestConversionProductBreakdownEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionProductReportRequestConversionProductBreakdownEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ConversionProductReportRequestConversionProductBreakdownEnum] to String,
/// and [decode] dynamic data back to [ConversionProductReportRequestConversionProductBreakdownEnum].
class ConversionProductReportRequestConversionProductBreakdownEnumTypeTransformer {
  factory ConversionProductReportRequestConversionProductBreakdownEnumTypeTransformer() => _instance ??= const ConversionProductReportRequestConversionProductBreakdownEnumTypeTransformer._();

  const ConversionProductReportRequestConversionProductBreakdownEnumTypeTransformer._();

  String encode(ConversionProductReportRequestConversionProductBreakdownEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ConversionProductReportRequestConversionProductBreakdownEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ConversionProductReportRequestConversionProductBreakdownEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'PRODUCT_BRAND': return ConversionProductReportRequestConversionProductBreakdownEnum.PRODUCT_BRAND;
        case r'PRODUCT_CATEGORY': return ConversionProductReportRequestConversionProductBreakdownEnum.PRODUCT_CATEGORY;
        case r'PRODUCT_BRAND_AND_CATEGORY': return ConversionProductReportRequestConversionProductBreakdownEnum.PRODUCT_BRAND_AND_CATEGORY;
        case r'PRODUCT_SKU': return ConversionProductReportRequestConversionProductBreakdownEnum.PRODUCT_SKU;
        case r'PRODUCT_SKU_GROUP': return ConversionProductReportRequestConversionProductBreakdownEnum.PRODUCT_SKU_GROUP;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ConversionProductReportRequestConversionProductBreakdownEnumTypeTransformer] instance.
  static ConversionProductReportRequestConversionProductBreakdownEnumTypeTransformer? _instance;
}


/// TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.
class ConversionProductReportRequestGranularityEnum {
  /// Instantiate a new enum with the provided [value].
  const ConversionProductReportRequestGranularityEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const WEEK = ConversionProductReportRequestGranularityEnum._(r'WEEK');
  static const MONTH = ConversionProductReportRequestGranularityEnum._(r'MONTH');
  static const TOTAL = ConversionProductReportRequestGranularityEnum._(r'TOTAL');

  /// List of all possible values in this [enum][ConversionProductReportRequestGranularityEnum].
  static const values = <ConversionProductReportRequestGranularityEnum>[
    WEEK,
    MONTH,
    TOTAL,
  ];

  static ConversionProductReportRequestGranularityEnum? fromJson(dynamic value) => ConversionProductReportRequestGranularityEnumTypeTransformer().decode(value);

  static List<ConversionProductReportRequestGranularityEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionProductReportRequestGranularityEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionProductReportRequestGranularityEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ConversionProductReportRequestGranularityEnum] to String,
/// and [decode] dynamic data back to [ConversionProductReportRequestGranularityEnum].
class ConversionProductReportRequestGranularityEnumTypeTransformer {
  factory ConversionProductReportRequestGranularityEnumTypeTransformer() => _instance ??= const ConversionProductReportRequestGranularityEnumTypeTransformer._();

  const ConversionProductReportRequestGranularityEnumTypeTransformer._();

  String encode(ConversionProductReportRequestGranularityEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ConversionProductReportRequestGranularityEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ConversionProductReportRequestGranularityEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'WEEK': return ConversionProductReportRequestGranularityEnum.WEEK;
        case r'MONTH': return ConversionProductReportRequestGranularityEnum.MONTH;
        case r'TOTAL': return ConversionProductReportRequestGranularityEnum.TOTAL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ConversionProductReportRequestGranularityEnumTypeTransformer] instance.
  static ConversionProductReportRequestGranularityEnumTypeTransformer? _instance;
}


/// Level of the report
class ConversionProductReportRequestLevelEnum {
  /// Instantiate a new enum with the provided [value].
  const ConversionProductReportRequestLevelEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ADVERTISER = ConversionProductReportRequestLevelEnum._(r'ADVERTISER');
  static const CAMPAIGN = ConversionProductReportRequestLevelEnum._(r'CAMPAIGN');
  static const AD_GROUP = ConversionProductReportRequestLevelEnum._(r'AD_GROUP');

  /// List of all possible values in this [enum][ConversionProductReportRequestLevelEnum].
  static const values = <ConversionProductReportRequestLevelEnum>[
    ADVERTISER,
    CAMPAIGN,
    AD_GROUP,
  ];

  static ConversionProductReportRequestLevelEnum? fromJson(dynamic value) => ConversionProductReportRequestLevelEnumTypeTransformer().decode(value);

  static List<ConversionProductReportRequestLevelEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionProductReportRequestLevelEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionProductReportRequestLevelEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ConversionProductReportRequestLevelEnum] to String,
/// and [decode] dynamic data back to [ConversionProductReportRequestLevelEnum].
class ConversionProductReportRequestLevelEnumTypeTransformer {
  factory ConversionProductReportRequestLevelEnumTypeTransformer() => _instance ??= const ConversionProductReportRequestLevelEnumTypeTransformer._();

  const ConversionProductReportRequestLevelEnumTypeTransformer._();

  String encode(ConversionProductReportRequestLevelEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ConversionProductReportRequestLevelEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ConversionProductReportRequestLevelEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ADVERTISER': return ConversionProductReportRequestLevelEnum.ADVERTISER;
        case r'CAMPAIGN': return ConversionProductReportRequestLevelEnum.CAMPAIGN;
        case r'AD_GROUP': return ConversionProductReportRequestLevelEnum.AD_GROUP;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ConversionProductReportRequestLevelEnumTypeTransformer] instance.
  static ConversionProductReportRequestLevelEnumTypeTransformer? _instance;
}


