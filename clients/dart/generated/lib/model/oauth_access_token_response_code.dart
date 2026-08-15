//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OauthAccessTokenResponseCode {
  /// Returns a new [OauthAccessTokenResponseCode] instance.
  OauthAccessTokenResponseCode({
    this.refreshToken,
    this.refreshTokenExpiresAt,
    this.refreshTokenExpiresIn,
    required this.accessToken,
    required this.expiresIn,
    this.responseType,
    required this.scope,
    this.tokenType = 'bearer',
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? refreshToken;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? refreshTokenExpiresAt;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? refreshTokenExpiresIn;

  String accessToken;

  int expiresIn;

  OauthAccessTokenResponseCodeResponseTypeEnum? responseType;

  String scope;

  String tokenType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OauthAccessTokenResponseCode &&
    other.refreshToken == refreshToken &&
    other.refreshTokenExpiresAt == refreshTokenExpiresAt &&
    other.refreshTokenExpiresIn == refreshTokenExpiresIn &&
    other.accessToken == accessToken &&
    other.expiresIn == expiresIn &&
    other.responseType == responseType &&
    other.scope == scope &&
    other.tokenType == tokenType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (refreshToken == null ? 0 : refreshToken!.hashCode) +
    (refreshTokenExpiresAt == null ? 0 : refreshTokenExpiresAt!.hashCode) +
    (refreshTokenExpiresIn == null ? 0 : refreshTokenExpiresIn!.hashCode) +
    (accessToken.hashCode) +
    (expiresIn.hashCode) +
    (responseType == null ? 0 : responseType!.hashCode) +
    (scope.hashCode) +
    (tokenType.hashCode);

  @override
  String toString() => 'OauthAccessTokenResponseCode[refreshToken=$refreshToken, refreshTokenExpiresAt=$refreshTokenExpiresAt, refreshTokenExpiresIn=$refreshTokenExpiresIn, accessToken=$accessToken, expiresIn=$expiresIn, responseType=$responseType, scope=$scope, tokenType=$tokenType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.refreshToken != null) {
      json[r'refresh_token'] = this.refreshToken;
    } else {
      json[r'refresh_token'] = null;
    }
    if (this.refreshTokenExpiresAt != null) {
      json[r'refresh_token_expires_at'] = this.refreshTokenExpiresAt;
    } else {
      json[r'refresh_token_expires_at'] = null;
    }
    if (this.refreshTokenExpiresIn != null) {
      json[r'refresh_token_expires_in'] = this.refreshTokenExpiresIn;
    } else {
      json[r'refresh_token_expires_in'] = null;
    }
      json[r'access_token'] = this.accessToken;
      json[r'expires_in'] = this.expiresIn;
    if (this.responseType != null) {
      json[r'response_type'] = this.responseType;
    } else {
      json[r'response_type'] = null;
    }
      json[r'scope'] = this.scope;
      json[r'token_type'] = this.tokenType;
    return json;
  }

  /// Returns a new [OauthAccessTokenResponseCode] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OauthAccessTokenResponseCode? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OauthAccessTokenResponseCode[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OauthAccessTokenResponseCode[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OauthAccessTokenResponseCode(
        refreshToken: mapValueOfType<String>(json, r'refresh_token'),
        refreshTokenExpiresAt: mapValueOfType<int>(json, r'refresh_token_expires_at'),
        refreshTokenExpiresIn: mapValueOfType<int>(json, r'refresh_token_expires_in'),
        accessToken: mapValueOfType<String>(json, r'access_token')!,
        expiresIn: mapValueOfType<int>(json, r'expires_in')!,
        responseType: OauthAccessTokenResponseCodeResponseTypeEnum.fromJson(json[r'response_type']),
        scope: mapValueOfType<String>(json, r'scope')!,
        tokenType: mapValueOfType<String>(json, r'token_type')!,
      );
    }
    return null;
  }

  static List<OauthAccessTokenResponseCode> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OauthAccessTokenResponseCode>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OauthAccessTokenResponseCode.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OauthAccessTokenResponseCode> mapFromJson(dynamic json) {
    final map = <String, OauthAccessTokenResponseCode>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OauthAccessTokenResponseCode.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OauthAccessTokenResponseCode-objects as value to a dart map
  static Map<String, List<OauthAccessTokenResponseCode>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OauthAccessTokenResponseCode>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OauthAccessTokenResponseCode.listFromJson(entry.value, growable: growable,);
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
  };
}


class OauthAccessTokenResponseCodeResponseTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const OauthAccessTokenResponseCodeResponseTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const authorizationCode = OauthAccessTokenResponseCodeResponseTypeEnum._(r'authorization_code');
  static const refreshToken = OauthAccessTokenResponseCodeResponseTypeEnum._(r'refresh_token');
  static const clientCredentials = OauthAccessTokenResponseCodeResponseTypeEnum._(r'client_credentials');

  /// List of all possible values in this [enum][OauthAccessTokenResponseCodeResponseTypeEnum].
  static const values = <OauthAccessTokenResponseCodeResponseTypeEnum>[
    authorizationCode,
    refreshToken,
    clientCredentials,
  ];

  static OauthAccessTokenResponseCodeResponseTypeEnum? fromJson(dynamic value) => OauthAccessTokenResponseCodeResponseTypeEnumTypeTransformer().decode(value);

  static List<OauthAccessTokenResponseCodeResponseTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OauthAccessTokenResponseCodeResponseTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OauthAccessTokenResponseCodeResponseTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OauthAccessTokenResponseCodeResponseTypeEnum] to String,
/// and [decode] dynamic data back to [OauthAccessTokenResponseCodeResponseTypeEnum].
class OauthAccessTokenResponseCodeResponseTypeEnumTypeTransformer {
  factory OauthAccessTokenResponseCodeResponseTypeEnumTypeTransformer() => _instance ??= const OauthAccessTokenResponseCodeResponseTypeEnumTypeTransformer._();

  const OauthAccessTokenResponseCodeResponseTypeEnumTypeTransformer._();

  String encode(OauthAccessTokenResponseCodeResponseTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a OauthAccessTokenResponseCodeResponseTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OauthAccessTokenResponseCodeResponseTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'authorization_code': return OauthAccessTokenResponseCodeResponseTypeEnum.authorizationCode;
        case r'refresh_token': return OauthAccessTokenResponseCodeResponseTypeEnum.refreshToken;
        case r'client_credentials': return OauthAccessTokenResponseCodeResponseTypeEnum.clientCredentials;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OauthAccessTokenResponseCodeResponseTypeEnumTypeTransformer] instance.
  static OauthAccessTokenResponseCodeResponseTypeEnumTypeTransformer? _instance;
}


