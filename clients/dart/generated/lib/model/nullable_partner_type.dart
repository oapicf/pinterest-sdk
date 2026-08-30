//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum NullablePartnerType {
  INTERNAL._(r'INTERNAL'),
  EXTERNAL._(r'EXTERNAL'),
  ;

  /// Instantiate a new enum with the provided value.
  const NullablePartnerType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [NullablePartnerType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static NullablePartnerType? fromJson(dynamic value) => NullablePartnerTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [NullablePartnerType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<NullablePartnerType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <NullablePartnerType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = NullablePartnerType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [NullablePartnerType] to String,
/// and [decode] dynamic data back to [NullablePartnerType].
class NullablePartnerTypeTypeTransformer {
  factory NullablePartnerTypeTypeTransformer() => _instance ??= const NullablePartnerTypeTypeTransformer._();

  const NullablePartnerTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(NullablePartnerType data) => data._value;

  /// Returns the instance of [NullablePartnerType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  NullablePartnerType? decode(dynamic data, {bool allowNull = true}) {
    if (data is NullablePartnerType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'INTERNAL': return NullablePartnerType.INTERNAL;
        case r'EXTERNAL': return NullablePartnerType.EXTERNAL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static NullablePartnerTypeTypeTransformer? _instance;
}

