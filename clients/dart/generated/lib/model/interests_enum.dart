//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class InterestsEnum {
  /// Instantiate a new enum with the provided [value].
  const InterestsEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ALL = InterestsEnum._(r'ALL');
  static const ANIMALS = InterestsEnum._(r'ANIMALS');
  static const ARCHITECTURE = InterestsEnum._(r'ARCHITECTURE');
  static const ART = InterestsEnum._(r'ART');
  static const BEAUTY = InterestsEnum._(r'BEAUTY');
  static const DIY_AND_CRAFTS = InterestsEnum._(r'DIY_AND_CRAFTS');
  static const EDUCATION = InterestsEnum._(r'EDUCATION');
  static const EVENT_PLANNING = InterestsEnum._(r'EVENT_PLANNING');
  static const FASHION = InterestsEnum._(r'FASHION');
  static const FOOD_AND_DRINKS = InterestsEnum._(r'FOOD_AND_DRINKS');
  static const GARDENING = InterestsEnum._(r'GARDENING');
  static const HEALTH = InterestsEnum._(r'HEALTH');
  static const HOME_DECOR = InterestsEnum._(r'HOME_DECOR');
  static const PARENTING = InterestsEnum._(r'PARENTING');
  static const TRAVEL = InterestsEnum._(r'TRAVEL');
  static const WEDDING = InterestsEnum._(r'WEDDING');

  /// List of all possible values in this [enum][InterestsEnum].
  static const values = <InterestsEnum>[
    ALL,
    ANIMALS,
    ARCHITECTURE,
    ART,
    BEAUTY,
    DIY_AND_CRAFTS,
    EDUCATION,
    EVENT_PLANNING,
    FASHION,
    FOOD_AND_DRINKS,
    GARDENING,
    HEALTH,
    HOME_DECOR,
    PARENTING,
    TRAVEL,
    WEDDING,
  ];

  static InterestsEnum? fromJson(dynamic value) => InterestsEnumTypeTransformer().decode(value);

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

  String encode(InterestsEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a InterestsEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  InterestsEnum? decode(dynamic data, {bool allowNull = true}) {
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

  /// Singleton [InterestsEnumTypeTransformer] instance.
  static InterestsEnumTypeTransformer? _instance;
}

