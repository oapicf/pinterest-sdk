//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The type of token to revoke.
enum TokenTypeHint {
  accessToken._(r'access_token'),
  refreshToken._(r'refresh_token'),
  ;

  /// Instantiate a new enum with the provided value.
  const TokenTypeHint._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [TokenTypeHint] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static TokenTypeHint? fromJson(dynamic value) => TokenTypeHintTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [TokenTypeHint]
  /// that were successfully decoded from the passed [JSON][json].
  static List<TokenTypeHint> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TokenTypeHint>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TokenTypeHint.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TokenTypeHint] to String,
/// and [decode] dynamic data back to [TokenTypeHint].
class TokenTypeHintTypeTransformer {
  factory TokenTypeHintTypeTransformer() => _instance ??= const TokenTypeHintTypeTransformer._();

  const TokenTypeHintTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(TokenTypeHint data) => data._value;

  /// Returns the instance of [TokenTypeHint] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TokenTypeHint? decode(dynamic data, {bool allowNull = true}) {
    if (data is TokenTypeHint) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'access_token': return TokenTypeHint.accessToken;
        case r'refresh_token': return TokenTypeHint.refreshToken;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static TokenTypeHintTypeTransformer? _instance;
}

