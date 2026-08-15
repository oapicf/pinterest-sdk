//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics {
  /// Returns a new [AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics] instance.
  AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics({
    required this.customEventMetricsType,
    required this.customEventName,
  });

  /// Metrics for custom defined conversion event.
  AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum customEventMetricsType;

  /// Name of the advertiser-defined custom conversion event
  String customEventName;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics &&
    other.customEventMetricsType == customEventMetricsType &&
    other.customEventName == customEventName;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (customEventMetricsType.hashCode) +
    (customEventName.hashCode);

  @override
  String toString() => 'AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics[customEventMetricsType=$customEventMetricsType, customEventName=$customEventName]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'custom_event_metrics_type'] = this.customEventMetricsType;
      json[r'custom_event_name'] = this.customEventName;
    return json;
  }

  /// Returns a new [AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics(
        customEventMetricsType: AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.fromJson(json[r'custom_event_metrics_type'])!,
        customEventName: mapValueOfType<String>(json, r'custom_event_name')!,
      );
    }
    return null;
  }

  static List<AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics> mapFromJson(dynamic json) {
    final map = <String, AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics-objects as value to a dart map
  static Map<String, List<AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'custom_event_metrics_type',
    'custom_event_name',
  };
}

/// Metrics for custom defined conversion event.
class AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ADE_COST_PER_ACTION = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_COST_PER_ACTION');
  static const ADE_ROAS = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_ROAS');
  static const ADE_TOTAL_CONVERSIONS = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_CONVERSIONS');
  static const ADE_TOTAL_VALUE_IN_MICRO_DOLLAR = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_VALUE_IN_MICRO_DOLLAR');
  static const ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR');
  static const ADE_TOTAL_CLICK = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_CLICK');
  static const ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR');
  static const ADE_TOTAL_VIEW = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_VIEW');
  static const ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR');
  static const ADE_TOTAL_CONVERSION_RATE = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_CONVERSION_RATE');
  static const ADE_WEB_COST_PER_ACTION = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_WEB_COST_PER_ACTION');
  static const ADE_WEB_ROAS = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_WEB_ROAS');
  static const ADE_TOTAL_WEB_CONVERSIONS = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_WEB_CONVERSIONS');
  static const ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR');
  static const ADE_TOTAL_WEB_CLICK = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_WEB_CLICK');
  static const ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR');
  static const ADE_TOTAL_WEB_VIEW = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_WEB_VIEW');
  static const ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR');
  static const ADE_INAPP_COST_PER_ACTION = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_INAPP_COST_PER_ACTION');
  static const ADE_INAPP_ROAS = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_INAPP_ROAS');
  static const ADE_TOTAL_INAPP_CONVERSIONS = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_INAPP_CONVERSIONS');
  static const ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR');
  static const ADE_TOTAL_INAPP_CLICK = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_INAPP_CLICK');
  static const ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR');
  static const ADE_TOTAL_INAPP_VIEW = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_INAPP_VIEW');
  static const ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR');
  static const ADE_OFFLINE_COST_PER_ACTION = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_OFFLINE_COST_PER_ACTION');
  static const ADE_OFFLINE_ROAS = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_OFFLINE_ROAS');
  static const ADE_TOTAL_OFFLINE_CONVERSIONS = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_OFFLINE_CONVERSIONS');
  static const ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR');
  static const ADE_TOTAL_OFFLINE_CLICK = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_OFFLINE_CLICK');
  static const ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR');
  static const ADE_TOTAL_OFFLINE_VIEW = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_OFFLINE_VIEW');
  static const ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR');
  static const ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY');
  static const ADE_TOTAL_CONVERSION_PRODUCT_VALUE = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_CONVERSION_PRODUCT_VALUE');
  static const ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY');
  static const ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE');
  static const ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY');
  static const ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE');
  static const ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY');
  static const ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE');
  static const ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum._(r'ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');

  /// List of all possible values in this [enum][AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum].
  static const values = <AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum>[
    ADE_COST_PER_ACTION,
    ADE_ROAS,
    ADE_TOTAL_CONVERSIONS,
    ADE_TOTAL_VALUE_IN_MICRO_DOLLAR,
    ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR,
    ADE_TOTAL_CLICK,
    ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR,
    ADE_TOTAL_VIEW,
    ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR,
    ADE_TOTAL_CONVERSION_RATE,
    ADE_WEB_COST_PER_ACTION,
    ADE_WEB_ROAS,
    ADE_TOTAL_WEB_CONVERSIONS,
    ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR,
    ADE_TOTAL_WEB_CLICK,
    ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR,
    ADE_TOTAL_WEB_VIEW,
    ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR,
    ADE_INAPP_COST_PER_ACTION,
    ADE_INAPP_ROAS,
    ADE_TOTAL_INAPP_CONVERSIONS,
    ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR,
    ADE_TOTAL_INAPP_CLICK,
    ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR,
    ADE_TOTAL_INAPP_VIEW,
    ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR,
    ADE_OFFLINE_COST_PER_ACTION,
    ADE_OFFLINE_ROAS,
    ADE_TOTAL_OFFLINE_CONVERSIONS,
    ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR,
    ADE_TOTAL_OFFLINE_CLICK,
    ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR,
    ADE_TOTAL_OFFLINE_VIEW,
    ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR,
    ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY,
    ADE_TOTAL_CONVERSION_PRODUCT_VALUE,
    ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD,
    ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY,
    ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE,
    ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD,
    ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY,
    ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE,
    ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD,
    ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY,
    ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE,
    ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD,
    ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
  ];

  static AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum? fromJson(dynamic value) => AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnumTypeTransformer().decode(value);

  static List<AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum] to String,
/// and [decode] dynamic data back to [AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum].
class AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnumTypeTransformer {
  factory AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnumTypeTransformer() => _instance ??= const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnumTypeTransformer._();

  const AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnumTypeTransformer._();

  String encode(AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ADE_COST_PER_ACTION': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_COST_PER_ACTION;
        case r'ADE_ROAS': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_ROAS;
        case r'ADE_TOTAL_CONVERSIONS': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_CONVERSIONS;
        case r'ADE_TOTAL_VALUE_IN_MICRO_DOLLAR': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_VALUE_IN_MICRO_DOLLAR;
        case r'ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_AVERAGE_VALUE_IN_MICRO_DOLLAR;
        case r'ADE_TOTAL_CLICK': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_CLICK;
        case r'ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_CLICK_VALUE_IN_MICRO_DOLLAR;
        case r'ADE_TOTAL_VIEW': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_VIEW;
        case r'ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_VIEW_VALUE_IN_MICRO_DOLLAR;
        case r'ADE_TOTAL_CONVERSION_RATE': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_CONVERSION_RATE;
        case r'ADE_WEB_COST_PER_ACTION': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_WEB_COST_PER_ACTION;
        case r'ADE_WEB_ROAS': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_WEB_ROAS;
        case r'ADE_TOTAL_WEB_CONVERSIONS': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_WEB_CONVERSIONS;
        case r'ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_WEB_VALUE_IN_MICRO_DOLLAR;
        case r'ADE_TOTAL_WEB_CLICK': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_WEB_CLICK;
        case r'ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_WEB_CLICK_VALUE_IN_MICRO_DOLLAR;
        case r'ADE_TOTAL_WEB_VIEW': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_WEB_VIEW;
        case r'ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_WEB_VIEW_VALUE_IN_MICRO_DOLLAR;
        case r'ADE_INAPP_COST_PER_ACTION': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_INAPP_COST_PER_ACTION;
        case r'ADE_INAPP_ROAS': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_INAPP_ROAS;
        case r'ADE_TOTAL_INAPP_CONVERSIONS': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_INAPP_CONVERSIONS;
        case r'ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_INAPP_VALUE_IN_MICRO_DOLLAR;
        case r'ADE_TOTAL_INAPP_CLICK': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_INAPP_CLICK;
        case r'ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_INAPP_CLICK_VALUE_IN_MICRO_DOLLAR;
        case r'ADE_TOTAL_INAPP_VIEW': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_INAPP_VIEW;
        case r'ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_INAPP_VIEW_VALUE_IN_MICRO_DOLLAR;
        case r'ADE_OFFLINE_COST_PER_ACTION': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_OFFLINE_COST_PER_ACTION;
        case r'ADE_OFFLINE_ROAS': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_OFFLINE_ROAS;
        case r'ADE_TOTAL_OFFLINE_CONVERSIONS': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_OFFLINE_CONVERSIONS;
        case r'ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_OFFLINE_VALUE_IN_MICRO_DOLLAR;
        case r'ADE_TOTAL_OFFLINE_CLICK': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_OFFLINE_CLICK;
        case r'ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_OFFLINE_CLICK_VALUE_IN_MICRO_DOLLAR;
        case r'ADE_TOTAL_OFFLINE_VIEW': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_OFFLINE_VIEW;
        case r'ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_OFFLINE_VIEW_VALUE_IN_MICRO_DOLLAR;
        case r'ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_CONVERSION_PRODUCT_QUANTITY;
        case r'ADE_TOTAL_CONVERSION_PRODUCT_VALUE': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_CONVERSION_PRODUCT_VALUE;
        case r'ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY;
        case r'ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE;
        case r'ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY;
        case r'ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE;
        case r'ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY;
        case r'ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE;
        case r'ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnum.ADE_TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnumTypeTransformer] instance.
  static AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetricsCustomEventMetricsTypeEnumTypeTransformer? _instance;
}


