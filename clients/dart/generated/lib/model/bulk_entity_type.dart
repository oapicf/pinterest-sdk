//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Refers ads entity type. Schedule enum is only applicable to beta users
class BulkEntityType {
  /// Instantiate a new enum with the provided [value].
  const BulkEntityType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CAMPAIGN = BulkEntityType._(r'CAMPAIGN');
  static const AD_GROUP = BulkEntityType._(r'AD_GROUP');
  static const PRODUCT_GROUP = BulkEntityType._(r'PRODUCT_GROUP');
  static const AD = BulkEntityType._(r'AD');
  static const KEYWORD = BulkEntityType._(r'KEYWORD');
  static const LABEL = BulkEntityType._(r'LABEL');
  static const SCHEDULE = BulkEntityType._(r'SCHEDULE');

  /// List of all possible values in this [enum][BulkEntityType].
  static const values = <BulkEntityType>[
    CAMPAIGN,
    AD_GROUP,
    PRODUCT_GROUP,
    AD,
    KEYWORD,
    LABEL,
    SCHEDULE,
  ];

  static BulkEntityType? fromJson(dynamic value) => BulkEntityTypeTypeTransformer().decode(value);

  static List<BulkEntityType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BulkEntityType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BulkEntityType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BulkEntityType] to String,
/// and [decode] dynamic data back to [BulkEntityType].
class BulkEntityTypeTypeTransformer {
  factory BulkEntityTypeTypeTransformer() => _instance ??= const BulkEntityTypeTypeTransformer._();

  const BulkEntityTypeTypeTransformer._();

  String encode(BulkEntityType data) => data.value;

  /// Decodes a [dynamic value][data] to a BulkEntityType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BulkEntityType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CAMPAIGN': return BulkEntityType.CAMPAIGN;
        case r'AD_GROUP': return BulkEntityType.AD_GROUP;
        case r'PRODUCT_GROUP': return BulkEntityType.PRODUCT_GROUP;
        case r'AD': return BulkEntityType.AD;
        case r'KEYWORD': return BulkEntityType.KEYWORD;
        case r'LABEL': return BulkEntityType.LABEL;
        case r'SCHEDULE': return BulkEntityType.SCHEDULE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [BulkEntityTypeTypeTransformer] instance.
  static BulkEntityTypeTypeTransformer? _instance;
}

