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
class MetricsReportingLevel {
  /// Instantiate a new enum with the provided [value].
  const MetricsReportingLevel._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ADVERTISER = MetricsReportingLevel._(r'ADVERTISER');
  static const ADVERTISER_TARGETING = MetricsReportingLevel._(r'ADVERTISER_TARGETING');
  static const CAMPAIGN = MetricsReportingLevel._(r'CAMPAIGN');
  static const CAMPAIGN_TARGETING = MetricsReportingLevel._(r'CAMPAIGN_TARGETING');
  static const AD_GROUP = MetricsReportingLevel._(r'AD_GROUP');
  static const AD_GROUP_TARGETING = MetricsReportingLevel._(r'AD_GROUP_TARGETING');
  static const PIN_PROMOTION = MetricsReportingLevel._(r'PIN_PROMOTION');
  static const PIN_PROMOTION_TARGETING = MetricsReportingLevel._(r'PIN_PROMOTION_TARGETING');
  static const KEYWORD = MetricsReportingLevel._(r'KEYWORD');
  static const PRODUCT_GROUP = MetricsReportingLevel._(r'PRODUCT_GROUP');
  static const PRODUCT_GROUP_TARGETING = MetricsReportingLevel._(r'PRODUCT_GROUP_TARGETING');
  static const PRODUCT_ITEM = MetricsReportingLevel._(r'PRODUCT_ITEM');
  static const PRODUCT_ITEM_TARGETING = MetricsReportingLevel._(r'PRODUCT_ITEM_TARGETING');

  /// List of all possible values in this [enum][MetricsReportingLevel].
  static const values = <MetricsReportingLevel>[
    ADVERTISER,
    ADVERTISER_TARGETING,
    CAMPAIGN,
    CAMPAIGN_TARGETING,
    AD_GROUP,
    AD_GROUP_TARGETING,
    PIN_PROMOTION,
    PIN_PROMOTION_TARGETING,
    KEYWORD,
    PRODUCT_GROUP,
    PRODUCT_GROUP_TARGETING,
    PRODUCT_ITEM,
    PRODUCT_ITEM_TARGETING,
  ];

  static MetricsReportingLevel? fromJson(dynamic value) => MetricsReportingLevelTypeTransformer().decode(value);

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

  String encode(MetricsReportingLevel data) => data.value;

  /// Decodes a [dynamic value][data] to a MetricsReportingLevel.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MetricsReportingLevel? decode(dynamic data, {bool allowNull = true}) {
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

  /// Singleton [MetricsReportingLevelTypeTransformer] instance.
  static MetricsReportingLevelTypeTransformer? _instance;
}

