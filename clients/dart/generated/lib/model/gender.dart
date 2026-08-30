//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum Gender {
  FEMALE._(r'FEMALE'),
  MALE._(r'MALE'),
  UNISEX._(r'UNISEX'),
  ;

  /// Instantiate a new enum with the provided value.
  const Gender._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [Gender] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static Gender? fromJson(dynamic value) => GenderTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [Gender]
  /// that were successfully decoded from the passed [JSON][json].
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

  /// Encodes this enum as a value suitable for JSON.
  String encode(Gender data) => data._value;

  /// Returns the instance of [Gender] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  Gender? decode(dynamic data, {bool allowNull = true}) {
    if (data is Gender) {
      return data;
    }
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

  /// The singleton instance of this transformer.
  static GenderTypeTransformer? _instance;
}

