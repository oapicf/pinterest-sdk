//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum NumericFilterOperatorType {
  GREATER_THAN._(r'GREATER_THAN'),
  GREATER_THAN_OR_EQUALS._(r'GREATER_THAN_OR_EQUALS'),
  LESS_THAN._(r'LESS_THAN'),
  LESS_THAN_OR_EQUALS._(r'LESS_THAN_OR_EQUALS'),
  ;

  /// Instantiate a new enum with the provided value.
  const NumericFilterOperatorType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [NumericFilterOperatorType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static NumericFilterOperatorType? fromJson(dynamic value) => NumericFilterOperatorTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [NumericFilterOperatorType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<NumericFilterOperatorType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <NumericFilterOperatorType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = NumericFilterOperatorType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [NumericFilterOperatorType] to String,
/// and [decode] dynamic data back to [NumericFilterOperatorType].
class NumericFilterOperatorTypeTypeTransformer {
  factory NumericFilterOperatorTypeTypeTransformer() => _instance ??= const NumericFilterOperatorTypeTypeTransformer._();

  const NumericFilterOperatorTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(NumericFilterOperatorType data) => data._value;

  /// Returns the instance of [NumericFilterOperatorType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  NumericFilterOperatorType? decode(dynamic data, {bool allowNull = true}) {
    if (data is NumericFilterOperatorType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'GREATER_THAN': return NumericFilterOperatorType.GREATER_THAN;
        case r'GREATER_THAN_OR_EQUALS': return NumericFilterOperatorType.GREATER_THAN_OR_EQUALS;
        case r'LESS_THAN': return NumericFilterOperatorType.LESS_THAN;
        case r'LESS_THAN_OR_EQUALS': return NumericFilterOperatorType.LESS_THAN_OR_EQUALS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static NumericFilterOperatorTypeTypeTransformer? _instance;
}

