//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The type of OAuth grant being requested.
enum TokenGrantType {
  authorizationCode._(r'authorization_code'),
  refreshToken._(r'refresh_token'),
  clientCredentials._(r'client_credentials'),
  ;

  /// Instantiate a new enum with the provided value.
  const TokenGrantType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [TokenGrantType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static TokenGrantType? fromJson(dynamic value) => TokenGrantTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [TokenGrantType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<TokenGrantType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TokenGrantType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TokenGrantType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TokenGrantType] to String,
/// and [decode] dynamic data back to [TokenGrantType].
class TokenGrantTypeTypeTransformer {
  factory TokenGrantTypeTypeTransformer() => _instance ??= const TokenGrantTypeTypeTransformer._();

  const TokenGrantTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(TokenGrantType data) => data._value;

  /// Returns the instance of [TokenGrantType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TokenGrantType? decode(dynamic data, {bool allowNull = true}) {
    if (data is TokenGrantType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'authorization_code': return TokenGrantType.authorizationCode;
        case r'refresh_token': return TokenGrantType.refreshToken;
        case r'client_credentials': return TokenGrantType.clientCredentials;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static TokenGrantTypeTypeTransformer? _instance;
}

