//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OauthAccessToken {
  /// Returns a new [OauthAccessToken] instance.
  OauthAccessToken({
    required this.accessToken,
    required this.expiresIn,
    this.refreshToken,
    this.refreshTokenExpiresAt,
    this.refreshTokenExpiresIn,
    this.responseType,
    this.scope,
    this.tokenType = 'bearer',
  });

  String accessToken;

  int expiresIn;

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

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TokenGrantType? responseType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? scope;

  String tokenType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OauthAccessToken &&
    other.accessToken == accessToken &&
    other.expiresIn == expiresIn &&
    other.refreshToken == refreshToken &&
    other.refreshTokenExpiresAt == refreshTokenExpiresAt &&
    other.refreshTokenExpiresIn == refreshTokenExpiresIn &&
    other.responseType == responseType &&
    other.scope == scope &&
    other.tokenType == tokenType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (accessToken.hashCode) +
    (expiresIn.hashCode) +
    (refreshToken == null ? 0 : refreshToken!.hashCode) +
    (refreshTokenExpiresAt == null ? 0 : refreshTokenExpiresAt!.hashCode) +
    (refreshTokenExpiresIn == null ? 0 : refreshTokenExpiresIn!.hashCode) +
    (responseType == null ? 0 : responseType!.hashCode) +
    (scope == null ? 0 : scope!.hashCode) +
    (tokenType.hashCode);

  @override
  String toString() => 'OauthAccessToken[accessToken=$accessToken, expiresIn=$expiresIn, refreshToken=$refreshToken, refreshTokenExpiresAt=$refreshTokenExpiresAt, refreshTokenExpiresIn=$refreshTokenExpiresIn, responseType=$responseType, scope=$scope, tokenType=$tokenType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'access_token'] = this.accessToken;
      json[r'expires_in'] = this.expiresIn;
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
    if (this.responseType != null) {
      json[r'response_type'] = this.responseType;
    } else {
      json[r'response_type'] = null;
    }
    if (this.scope != null) {
      json[r'scope'] = this.scope;
    } else {
      json[r'scope'] = null;
    }
      json[r'token_type'] = this.tokenType;
    return json;
  }

  /// Returns a new [OauthAccessToken] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OauthAccessToken? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'access_token'), 'Required key "OauthAccessToken[access_token]" is missing from JSON.');
        assert(json[r'access_token'] != null, 'Required key "OauthAccessToken[access_token]" has a null value in JSON.');
        assert(json.containsKey(r'expires_in'), 'Required key "OauthAccessToken[expires_in]" is missing from JSON.');
        assert(json[r'expires_in'] != null, 'Required key "OauthAccessToken[expires_in]" has a null value in JSON.');
        assert(json.containsKey(r'token_type'), 'Required key "OauthAccessToken[token_type]" is missing from JSON.');
        assert(json[r'token_type'] != null, 'Required key "OauthAccessToken[token_type]" has a null value in JSON.');
        return true;
      }());

      return OauthAccessToken(
        accessToken: mapValueOfType<String>(json, r'access_token')!,
        expiresIn: mapValueOfType<int>(json, r'expires_in')!,
        refreshToken: mapValueOfType<String>(json, r'refresh_token'),
        refreshTokenExpiresAt: mapValueOfType<int>(json, r'refresh_token_expires_at'),
        refreshTokenExpiresIn: mapValueOfType<int>(json, r'refresh_token_expires_in'),
        responseType: TokenGrantType.fromJson(json[r'response_type']),
        scope: mapValueOfType<String>(json, r'scope'),
        tokenType: mapValueOfType<String>(json, r'token_type')!,
      );
    }
    return null;
  }

  static List<OauthAccessToken> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OauthAccessToken>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OauthAccessToken.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OauthAccessToken> mapFromJson(dynamic json) {
    final map = <String, OauthAccessToken>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OauthAccessToken.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OauthAccessToken-objects as value to a dart map
  static Map<String, List<OauthAccessToken>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OauthAccessToken>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OauthAccessToken.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'access_token',
    'expires_in',
    'token_type',
  };
}

