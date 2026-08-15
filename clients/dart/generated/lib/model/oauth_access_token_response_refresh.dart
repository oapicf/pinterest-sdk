//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OauthAccessTokenResponseRefresh {
  /// Returns a new [OauthAccessTokenResponseRefresh] instance.
  OauthAccessTokenResponseRefresh({
    required this.accessToken,
    required this.expiresIn,
    this.responseType,
    required this.scope,
    this.tokenType = 'bearer',
    required this.refreshToken,
    required this.refreshTokenExpiresAt,
    required this.refreshTokenExpiresIn,
  });

  String accessToken;

  int expiresIn;

  OauthAccessTokenResponseRefreshResponseTypeEnum? responseType;

  String scope;

  String tokenType;

  String refreshToken;

  int refreshTokenExpiresAt;

  int refreshTokenExpiresIn;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OauthAccessTokenResponseRefresh &&
    other.accessToken == accessToken &&
    other.expiresIn == expiresIn &&
    other.responseType == responseType &&
    other.scope == scope &&
    other.tokenType == tokenType &&
    other.refreshToken == refreshToken &&
    other.refreshTokenExpiresAt == refreshTokenExpiresAt &&
    other.refreshTokenExpiresIn == refreshTokenExpiresIn;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (accessToken.hashCode) +
    (expiresIn.hashCode) +
    (responseType == null ? 0 : responseType!.hashCode) +
    (scope.hashCode) +
    (tokenType.hashCode) +
    (refreshToken.hashCode) +
    (refreshTokenExpiresAt.hashCode) +
    (refreshTokenExpiresIn.hashCode);

  @override
  String toString() => 'OauthAccessTokenResponseRefresh[accessToken=$accessToken, expiresIn=$expiresIn, responseType=$responseType, scope=$scope, tokenType=$tokenType, refreshToken=$refreshToken, refreshTokenExpiresAt=$refreshTokenExpiresAt, refreshTokenExpiresIn=$refreshTokenExpiresIn]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'access_token'] = this.accessToken;
      json[r'expires_in'] = this.expiresIn;
    if (this.responseType != null) {
      json[r'response_type'] = this.responseType;
    } else {
      json[r'response_type'] = null;
    }
      json[r'scope'] = this.scope;
      json[r'token_type'] = this.tokenType;
      json[r'refresh_token'] = this.refreshToken;
      json[r'refresh_token_expires_at'] = this.refreshTokenExpiresAt;
      json[r'refresh_token_expires_in'] = this.refreshTokenExpiresIn;
    return json;
  }

  /// Returns a new [OauthAccessTokenResponseRefresh] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OauthAccessTokenResponseRefresh? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OauthAccessTokenResponseRefresh[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OauthAccessTokenResponseRefresh[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OauthAccessTokenResponseRefresh(
        accessToken: mapValueOfType<String>(json, r'access_token')!,
        expiresIn: mapValueOfType<int>(json, r'expires_in')!,
        responseType: OauthAccessTokenResponseRefreshResponseTypeEnum.fromJson(json[r'response_type']),
        scope: mapValueOfType<String>(json, r'scope')!,
        tokenType: mapValueOfType<String>(json, r'token_type')!,
        refreshToken: mapValueOfType<String>(json, r'refresh_token')!,
        refreshTokenExpiresAt: mapValueOfType<int>(json, r'refresh_token_expires_at')!,
        refreshTokenExpiresIn: mapValueOfType<int>(json, r'refresh_token_expires_in')!,
      );
    }
    return null;
  }

  static List<OauthAccessTokenResponseRefresh> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OauthAccessTokenResponseRefresh>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OauthAccessTokenResponseRefresh.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OauthAccessTokenResponseRefresh> mapFromJson(dynamic json) {
    final map = <String, OauthAccessTokenResponseRefresh>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OauthAccessTokenResponseRefresh.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OauthAccessTokenResponseRefresh-objects as value to a dart map
  static Map<String, List<OauthAccessTokenResponseRefresh>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OauthAccessTokenResponseRefresh>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OauthAccessTokenResponseRefresh.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'access_token',
    'expires_in',
    'scope',
    'token_type',
    'refresh_token',
    'refresh_token_expires_at',
    'refresh_token_expires_in',
  };
}


class OauthAccessTokenResponseRefreshResponseTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const OauthAccessTokenResponseRefreshResponseTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const authorizationCode = OauthAccessTokenResponseRefreshResponseTypeEnum._(r'authorization_code');
  static const refreshToken = OauthAccessTokenResponseRefreshResponseTypeEnum._(r'refresh_token');
  static const clientCredentials = OauthAccessTokenResponseRefreshResponseTypeEnum._(r'client_credentials');

  /// List of all possible values in this [enum][OauthAccessTokenResponseRefreshResponseTypeEnum].
  static const values = <OauthAccessTokenResponseRefreshResponseTypeEnum>[
    authorizationCode,
    refreshToken,
    clientCredentials,
  ];

  static OauthAccessTokenResponseRefreshResponseTypeEnum? fromJson(dynamic value) => OauthAccessTokenResponseRefreshResponseTypeEnumTypeTransformer().decode(value);

  static List<OauthAccessTokenResponseRefreshResponseTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OauthAccessTokenResponseRefreshResponseTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OauthAccessTokenResponseRefreshResponseTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OauthAccessTokenResponseRefreshResponseTypeEnum] to String,
/// and [decode] dynamic data back to [OauthAccessTokenResponseRefreshResponseTypeEnum].
class OauthAccessTokenResponseRefreshResponseTypeEnumTypeTransformer {
  factory OauthAccessTokenResponseRefreshResponseTypeEnumTypeTransformer() => _instance ??= const OauthAccessTokenResponseRefreshResponseTypeEnumTypeTransformer._();

  const OauthAccessTokenResponseRefreshResponseTypeEnumTypeTransformer._();

  String encode(OauthAccessTokenResponseRefreshResponseTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a OauthAccessTokenResponseRefreshResponseTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OauthAccessTokenResponseRefreshResponseTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'authorization_code': return OauthAccessTokenResponseRefreshResponseTypeEnum.authorizationCode;
        case r'refresh_token': return OauthAccessTokenResponseRefreshResponseTypeEnum.refreshToken;
        case r'client_credentials': return OauthAccessTokenResponseRefreshResponseTypeEnum.clientCredentials;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OauthAccessTokenResponseRefreshResponseTypeEnumTypeTransformer] instance.
  static OauthAccessTokenResponseRefreshResponseTypeEnumTypeTransformer? _instance;
}


