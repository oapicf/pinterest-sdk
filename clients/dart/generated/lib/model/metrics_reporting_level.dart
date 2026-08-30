//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Level of the reporting request
enum MetricsReportingLevel {
  ADVERTISER._(r'ADVERTISER'),
  ADVERTISER_TARGETING._(r'ADVERTISER_TARGETING'),
  CAMPAIGN._(r'CAMPAIGN'),
  CAMPAIGN_TARGETING._(r'CAMPAIGN_TARGETING'),
  AD_GROUP._(r'AD_GROUP'),
  AD_GROUP_TARGETING._(r'AD_GROUP_TARGETING'),
  PIN_PROMOTION._(r'PIN_PROMOTION'),
  PIN_PROMOTION_TARGETING._(r'PIN_PROMOTION_TARGETING'),
  KEYWORD._(r'KEYWORD'),
  PRODUCT_GROUP._(r'PRODUCT_GROUP'),
  PRODUCT_GROUP_TARGETING._(r'PRODUCT_GROUP_TARGETING'),
  PRODUCT_ITEM._(r'PRODUCT_ITEM'),
  PRODUCT_ITEM_TARGETING._(r'PRODUCT_ITEM_TARGETING'),
  ;

  /// Instantiate a new enum with the provided value.
  const MetricsReportingLevel._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [MetricsReportingLevel] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static MetricsReportingLevel? fromJson(dynamic value) => MetricsReportingLevelTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [MetricsReportingLevel]
  /// that were successfully decoded from the passed [JSON][json].
  static List<MetricsReportingLevel> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MetricsReportingLevel>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MetricsReportingLevel.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MetricsReportingLevel] to String,
/// and [decode] dynamic data back to [MetricsReportingLevel].
class MetricsReportingLevelTypeTransformer {
  factory MetricsReportingLevelTypeTransformer() => _instance ??= const MetricsReportingLevelTypeTransformer._();

  const MetricsReportingLevelTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(MetricsReportingLevel data) => data._value;

  /// Returns the instance of [MetricsReportingLevel] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MetricsReportingLevel? decode(dynamic data, {bool allowNull = true}) {
    if (data is MetricsReportingLevel) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'ADVERTISER': return MetricsReportingLevel.ADVERTISER;
        case r'ADVERTISER_TARGETING': return MetricsReportingLevel.ADVERTISER_TARGETING;
        case r'CAMPAIGN': return MetricsReportingLevel.CAMPAIGN;
        case r'CAMPAIGN_TARGETING': return MetricsReportingLevel.CAMPAIGN_TARGETING;
        case r'AD_GROUP': return MetricsReportingLevel.AD_GROUP;
        case r'AD_GROUP_TARGETING': return MetricsReportingLevel.AD_GROUP_TARGETING;
        case r'PIN_PROMOTION': return MetricsReportingLevel.PIN_PROMOTION;
        case r'PIN_PROMOTION_TARGETING': return MetricsReportingLevel.PIN_PROMOTION_TARGETING;
        case r'KEYWORD': return MetricsReportingLevel.KEYWORD;
        case r'PRODUCT_GROUP': return MetricsReportingLevel.PRODUCT_GROUP;
        case r'PRODUCT_GROUP_TARGETING': return MetricsReportingLevel.PRODUCT_GROUP_TARGETING;
        case r'PRODUCT_ITEM': return MetricsReportingLevel.PRODUCT_ITEM;
        case r'PRODUCT_ITEM_TARGETING': return MetricsReportingLevel.PRODUCT_ITEM_TARGETING;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static MetricsReportingLevelTypeTransformer? _instance;
}

