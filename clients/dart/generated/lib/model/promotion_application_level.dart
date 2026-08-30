//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Specify if the promotion is applied at ad group or item level.
enum PromotionApplicationLevel {
  NONE._(r'NONE'),
  ITEM._(r'ITEM'),
  AD_GROUP._(r'AD_GROUP'),
  ;

  /// Instantiate a new enum with the provided value.
  const PromotionApplicationLevel._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [PromotionApplicationLevel] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static PromotionApplicationLevel? fromJson(dynamic value) => PromotionApplicationLevelTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [PromotionApplicationLevel]
  /// that were successfully decoded from the passed [JSON][json].
  static List<PromotionApplicationLevel> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PromotionApplicationLevel>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PromotionApplicationLevel.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PromotionApplicationLevel] to String,
/// and [decode] dynamic data back to [PromotionApplicationLevel].
class PromotionApplicationLevelTypeTransformer {
  factory PromotionApplicationLevelTypeTransformer() => _instance ??= const PromotionApplicationLevelTypeTransformer._();

  const PromotionApplicationLevelTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(PromotionApplicationLevel data) => data._value;

  /// Returns the instance of [PromotionApplicationLevel] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PromotionApplicationLevel? decode(dynamic data, {bool allowNull = true}) {
    if (data is PromotionApplicationLevel) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'NONE': return PromotionApplicationLevel.NONE;
        case r'ITEM': return PromotionApplicationLevel.ITEM;
        case r'AD_GROUP': return PromotionApplicationLevel.AD_GROUP;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static PromotionApplicationLevelTypeTransformer? _instance;
}

