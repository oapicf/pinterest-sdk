//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class Gender {
  /// Instantiate a new enum with the provided [value].
  const Gender._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const FEMALE = Gender._(r'FEMALE');
  static const MALE = Gender._(r'MALE');
  static const UNISEX = Gender._(r'UNISEX');

  /// List of all possible values in this [enum][Gender].
  static const values = <Gender>[
    FEMALE,
    MALE,
    UNISEX,
  ];

  static Gender? fromJson(dynamic value) => GenderTypeTransformer().decode(value);

  static List<Gender> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Gender>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Gender.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [Gender] to String,
/// and [decode] dynamic data back to [Gender].
class GenderTypeTransformer {
  factory GenderTypeTransformer() => _instance ??= const GenderTypeTransformer._();

  const GenderTypeTransformer._();

  String encode(Gender data) => data.value;

  /// Decodes a [dynamic value][data] to a Gender.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  Gender? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'FEMALE': return Gender.FEMALE;
        case r'MALE': return Gender.MALE;
        case r'UNISEX': return Gender.UNISEX;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [GenderTypeTransformer] instance.
  static GenderTypeTransformer? _instance;
}

