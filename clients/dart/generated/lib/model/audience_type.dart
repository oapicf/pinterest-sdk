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
enum AudienceType {
  CUSTOMER_LIST._(r'CUSTOMER_LIST'),
  VISITOR._(r'VISITOR'),
  ENGAGEMENT._(r'ENGAGEMENT'),
  ACTALIKE._(r'ACTALIKE'),
  PERSONA._(r'PERSONA'),
  ;

  /// Instantiate a new enum with the provided value.
  const AudienceType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AudienceType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AudienceType? fromJson(dynamic value) => AudienceTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AudienceType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AudienceType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AudienceType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AudienceType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AudienceType] to String,
/// and [decode] dynamic data back to [AudienceType].
class AudienceTypeTypeTransformer {
  factory AudienceTypeTypeTransformer() => _instance ??= const AudienceTypeTypeTransformer._();

  const AudienceTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AudienceType data) => data._value;

  /// Returns the instance of [AudienceType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AudienceType? decode(dynamic data, {bool allowNull = true}) {
    if (data is AudienceType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CUSTOMER_LIST': return AudienceType.CUSTOMER_LIST;
        case r'VISITOR': return AudienceType.VISITOR;
        case r'ENGAGEMENT': return AudienceType.ENGAGEMENT;
        case r'ACTALIKE': return AudienceType.ACTALIKE;
        case r'PERSONA': return AudienceType.PERSONA;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AudienceTypeTypeTransformer? _instance;
}

