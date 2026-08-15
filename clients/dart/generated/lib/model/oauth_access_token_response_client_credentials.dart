//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OauthAccessTokenResponseClientCredentials {
  /// Returns a new [OauthAccessTokenResponseClientCredentials] instance.
  OauthAccessTokenResponseClientCredentials({
    required this.accessToken,
    required this.expiresIn,
    this.responseType,
    required this.scope,
    this.tokenType = 'bearer',
  });

  String accessToken;

  int expiresIn;

  OauthAccessTokenResponseClientCredentialsResponseTypeEnum? responseType;

  String scope;

  String tokenType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OauthAccessTokenResponseClientCredentials &&
    other.accessToken == accessToken &&
    other.expiresIn == expiresIn &&
    other.responseType == responseType &&
    other.scope == scope &&
    other.tokenType == tokenType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (accessToken.hashCode) +
    (expiresIn.hashCode) +
    (responseType == null ? 0 : responseType!.hashCode) +
    (scope.hashCode) +
    (tokenType.hashCode);

  @override
  String toString() => 'OauthAccessTokenResponseClientCredentials[accessToken=$accessToken, expiresIn=$expiresIn, responseType=$responseType, scope=$scope, tokenType=$tokenType]';

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
    return json;
  }

  /// Returns a new [OauthAccessTokenResponseClientCredentials] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OauthAccessTokenResponseClientCredentials? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OauthAccessTokenResponseClientCredentials[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OauthAccessTokenResponseClientCredentials[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OauthAccessTokenResponseClientCredentials(
        accessToken: mapValueOfType<String>(json, r'access_token')!,
        expiresIn: mapValueOfType<int>(json, r'expires_in')!,
        responseType: OauthAccessTokenResponseClientCredentialsResponseTypeEnum.fromJson(json[r'response_type']),
        scope: mapValueOfType<String>(json, r'scope')!,
        tokenType: mapValueOfType<String>(json, r'token_type')!,
      );
    }
    return null;
  }

  static List<OauthAccessTokenResponseClientCredentials> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OauthAccessTokenResponseClientCredentials>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OauthAccessTokenResponseClientCredentials.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OauthAccessTokenResponseClientCredentials> mapFromJson(dynamic json) {
    final map = <String, OauthAccessTokenResponseClientCredentials>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OauthAccessTokenResponseClientCredentials.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OauthAccessTokenResponseClientCredentials-objects as value to a dart map
  static Map<String, List<OauthAccessTokenResponseClientCredentials>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OauthAccessTokenResponseClientCredentials>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OauthAccessTokenResponseClientCredentials.listFromJson(entry.value, growable: growable,);
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


class OauthAccessTokenResponseClientCredentialsResponseTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const OauthAccessTokenResponseClientCredentialsResponseTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const authorizationCode = OauthAccessTokenResponseClientCredentialsResponseTypeEnum._(r'authorization_code');
  static const refreshToken = OauthAccessTokenResponseClientCredentialsResponseTypeEnum._(r'refresh_token');
  static const clientCredentials = OauthAccessTokenResponseClientCredentialsResponseTypeEnum._(r'client_credentials');

  /// List of all possible values in this [enum][OauthAccessTokenResponseClientCredentialsResponseTypeEnum].
  static const values = <OauthAccessTokenResponseClientCredentialsResponseTypeEnum>[
    authorizationCode,
    refreshToken,
    clientCredentials,
  ];

  static OauthAccessTokenResponseClientCredentialsResponseTypeEnum? fromJson(dynamic value) => OauthAccessTokenResponseClientCredentialsResponseTypeEnumTypeTransformer().decode(value);

  static List<OauthAccessTokenResponseClientCredentialsResponseTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OauthAccessTokenResponseClientCredentialsResponseTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OauthAccessTokenResponseClientCredentialsResponseTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OauthAccessTokenResponseClientCredentialsResponseTypeEnum] to String,
/// and [decode] dynamic data back to [OauthAccessTokenResponseClientCredentialsResponseTypeEnum].
class OauthAccessTokenResponseClientCredentialsResponseTypeEnumTypeTransformer {
  factory OauthAccessTokenResponseClientCredentialsResponseTypeEnumTypeTransformer() => _instance ??= const OauthAccessTokenResponseClientCredentialsResponseTypeEnumTypeTransformer._();

  const OauthAccessTokenResponseClientCredentialsResponseTypeEnumTypeTransformer._();

  String encode(OauthAccessTokenResponseClientCredentialsResponseTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a OauthAccessTokenResponseClientCredentialsResponseTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OauthAccessTokenResponseClientCredentialsResponseTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'authorization_code': return OauthAccessTokenResponseClientCredentialsResponseTypeEnum.authorizationCode;
        case r'refresh_token': return OauthAccessTokenResponseClientCredentialsResponseTypeEnum.refreshToken;
        case r'client_credentials': return OauthAccessTokenResponseClientCredentialsResponseTypeEnum.clientCredentials;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OauthAccessTokenResponseClientCredentialsResponseTypeEnumTypeTransformer] instance.
  static OauthAccessTokenResponseClientCredentialsResponseTypeEnumTypeTransformer? _instance;
}


