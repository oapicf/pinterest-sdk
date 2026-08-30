//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum InterestsEnum {
  ALL._(r'ALL'),
  ANIMALS._(r'ANIMALS'),
  ARCHITECTURE._(r'ARCHITECTURE'),
  ART._(r'ART'),
  BEAUTY._(r'BEAUTY'),
  DIY_AND_CRAFTS._(r'DIY_AND_CRAFTS'),
  EDUCATION._(r'EDUCATION'),
  EVENT_PLANNING._(r'EVENT_PLANNING'),
  FASHION._(r'FASHION'),
  FOOD_AND_DRINKS._(r'FOOD_AND_DRINKS'),
  GARDENING._(r'GARDENING'),
  HEALTH._(r'HEALTH'),
  HOME_DECOR._(r'HOME_DECOR'),
  PARENTING._(r'PARENTING'),
  TRAVEL._(r'TRAVEL'),
  WEDDING._(r'WEDDING'),
  ;

  /// Instantiate a new enum with the provided value.
  const InterestsEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [InterestsEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static InterestsEnum? fromJson(dynamic value) => InterestsEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [InterestsEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<InterestsEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InterestsEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InterestsEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [InterestsEnum] to String,
/// and [decode] dynamic data back to [InterestsEnum].
class InterestsEnumTypeTransformer {
  factory InterestsEnumTypeTransformer() => _instance ??= const InterestsEnumTypeTransformer._();

  const InterestsEnumTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(InterestsEnum data) => data._value;

  /// Returns the instance of [InterestsEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  InterestsEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is InterestsEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'ALL': return InterestsEnum.ALL;
        case r'ANIMALS': return InterestsEnum.ANIMALS;
        case r'ARCHITECTURE': return InterestsEnum.ARCHITECTURE;
        case r'ART': return InterestsEnum.ART;
        case r'BEAUTY': return InterestsEnum.BEAUTY;
        case r'DIY_AND_CRAFTS': return InterestsEnum.DIY_AND_CRAFTS;
        case r'EDUCATION': return InterestsEnum.EDUCATION;
        case r'EVENT_PLANNING': return InterestsEnum.EVENT_PLANNING;
        case r'FASHION': return InterestsEnum.FASHION;
        case r'FOOD_AND_DRINKS': return InterestsEnum.FOOD_AND_DRINKS;
        case r'GARDENING': return InterestsEnum.GARDENING;
        case r'HEALTH': return InterestsEnum.HEALTH;
        case r'HOME_DECOR': return InterestsEnum.HOME_DECOR;
        case r'PARENTING': return InterestsEnum.PARENTING;
        case r'TRAVEL': return InterestsEnum.TRAVEL;
        case r'WEDDING': return InterestsEnum.WEDDING;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static InterestsEnumTypeTransformer? _instance;
}

