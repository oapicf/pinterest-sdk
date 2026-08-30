//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Audience type
enum PinnerListType {
  CUSTOMER_LIST._(r'CUSTOMER_LIST'),
  VISITOR._(r'VISITOR'),
  ENGAGEMENT._(r'ENGAGEMENT'),
  LOOKALIKE._(r'LOOKALIKE'),
  ACTALIKE._(r'ACTALIKE'),
  PERSONA._(r'PERSONA'),
  ;

  /// Instantiate a new enum with the provided value.
  const PinnerListType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [PinnerListType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static PinnerListType? fromJson(dynamic value) => PinnerListTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [PinnerListType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<PinnerListType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinnerListType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinnerListType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PinnerListType] to String,
/// and [decode] dynamic data back to [PinnerListType].
class PinnerListTypeTypeTransformer {
  factory PinnerListTypeTypeTransformer() => _instance ??= const PinnerListTypeTypeTransformer._();

  const PinnerListTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(PinnerListType data) => data._value;

  /// Returns the instance of [PinnerListType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PinnerListType? decode(dynamic data, {bool allowNull = true}) {
    if (data is PinnerListType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CUSTOMER_LIST': return PinnerListType.CUSTOMER_LIST;
        case r'VISITOR': return PinnerListType.VISITOR;
        case r'ENGAGEMENT': return PinnerListType.ENGAGEMENT;
        case r'LOOKALIKE': return PinnerListType.LOOKALIKE;
        case r'ACTALIKE': return PinnerListType.ACTALIKE;
        case r'PERSONA': return PinnerListType.PERSONA;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static PinnerListTypeTypeTransformer? _instance;
}

