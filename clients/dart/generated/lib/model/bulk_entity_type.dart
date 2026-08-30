//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Refers ads entity type.
enum BulkEntityType {
  CAMPAIGN._(r'CAMPAIGN'),
  AD_GROUP._(r'AD_GROUP'),
  PRODUCT_GROUP._(r'PRODUCT_GROUP'),
  AD._(r'AD'),
  KEYWORD._(r'KEYWORD'),
  LABEL._(r'LABEL'),
  SCHEDULE._(r'SCHEDULE'),
  ENTITY_HISTORY._(r'ENTITY_HISTORY'),
  ;

  /// Instantiate a new enum with the provided value.
  const BulkEntityType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [BulkEntityType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static BulkEntityType? fromJson(dynamic value) => BulkEntityTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [BulkEntityType]
  /// that were successfully decoded from the passed [JSON][json].
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

  /// Encodes this enum as a value suitable for JSON.
  String encode(BulkEntityType data) => data._value;

  /// Returns the instance of [BulkEntityType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BulkEntityType? decode(dynamic data, {bool allowNull = true}) {
    if (data is BulkEntityType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CAMPAIGN': return BulkEntityType.CAMPAIGN;
        case r'AD_GROUP': return BulkEntityType.AD_GROUP;
        case r'PRODUCT_GROUP': return BulkEntityType.PRODUCT_GROUP;
        case r'AD': return BulkEntityType.AD;
        case r'KEYWORD': return BulkEntityType.KEYWORD;
        case r'LABEL': return BulkEntityType.LABEL;
        case r'SCHEDULE': return BulkEntityType.SCHEDULE;
        case r'ENTITY_HISTORY': return BulkEntityType.ENTITY_HISTORY;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static BulkEntityTypeTypeTransformer? _instance;
}

