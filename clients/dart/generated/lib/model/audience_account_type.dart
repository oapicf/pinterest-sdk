//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Account type filter for audience sharing.
enum AudienceAccountType {
  AD_ACCOUNT._(r'AD_ACCOUNT'),
  BUSINESS_ACCOUNT._(r'BUSINESS_ACCOUNT'),
  ;

  /// Instantiate a new enum with the provided value.
  const AudienceAccountType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AudienceAccountType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AudienceAccountType? fromJson(dynamic value) => AudienceAccountTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AudienceAccountType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AudienceAccountType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AudienceAccountType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AudienceAccountType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AudienceAccountType] to String,
/// and [decode] dynamic data back to [AudienceAccountType].
class AudienceAccountTypeTypeTransformer {
  factory AudienceAccountTypeTypeTransformer() => _instance ??= const AudienceAccountTypeTypeTransformer._();

  const AudienceAccountTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AudienceAccountType data) => data._value;

  /// Returns the instance of [AudienceAccountType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AudienceAccountType? decode(dynamic data, {bool allowNull = true}) {
    if (data is AudienceAccountType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'AD_ACCOUNT': return AudienceAccountType.AD_ACCOUNT;
        case r'BUSINESS_ACCOUNT': return AudienceAccountType.BUSINESS_ACCOUNT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AudienceAccountTypeTypeTransformer? _instance;
}

