//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OauthAccessTokenRequestRefresh {
  /// Returns a new [OauthAccessTokenRequestRefresh] instance.
  OauthAccessTokenRequestRefresh({
    required this.refreshToken,
    this.scope,
    required this.grantType,
  });

  String refreshToken;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? scope;

  OauthAccessTokenRequestRefreshGrantTypeEnum grantType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OauthAccessTokenRequestRefresh &&
    other.refreshToken == refreshToken &&
    other.scope == scope &&
    other.grantType == grantType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (refreshToken.hashCode) +
    (scope == null ? 0 : scope!.hashCode) +
    (grantType.hashCode);

  @override
  String toString() => 'OauthAccessTokenRequestRefresh[refreshToken=$refreshToken, scope=$scope, grantType=$grantType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'refresh_token'] = this.refreshToken;
    if (this.scope != null) {
      json[r'scope'] = this.scope;
    } else {
      json[r'scope'] = null;
    }
      json[r'grant_type'] = this.grantType;
    return json;
  }

  /// Returns a new [OauthAccessTokenRequestRefresh] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OauthAccessTokenRequestRefresh? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OauthAccessTokenRequestRefresh[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OauthAccessTokenRequestRefresh[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OauthAccessTokenRequestRefresh(
        refreshToken: mapValueOfType<String>(json, r'refresh_token')!,
        scope: mapValueOfType<String>(json, r'scope'),
        grantType: OauthAccessTokenRequestRefreshGrantTypeEnum.fromJson(json[r'grant_type'])!,
      );
    }
    return null;
  }

  static List<OauthAccessTokenRequestRefresh> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OauthAccessTokenRequestRefresh>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OauthAccessTokenRequestRefresh.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OauthAccessTokenRequestRefresh> mapFromJson(dynamic json) {
    final map = <String, OauthAccessTokenRequestRefresh>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OauthAccessTokenRequestRefresh.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OauthAccessTokenRequestRefresh-objects as value to a dart map
  static Map<String, List<OauthAccessTokenRequestRefresh>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OauthAccessTokenRequestRefresh>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OauthAccessTokenRequestRefresh.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'refresh_token',
    'grant_type',
  };
}


class OauthAccessTokenRequestRefreshGrantTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const OauthAccessTokenRequestRefreshGrantTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const authorizationCode = OauthAccessTokenRequestRefreshGrantTypeEnum._(r'authorization_code');
  static const refreshToken = OauthAccessTokenRequestRefreshGrantTypeEnum._(r'refresh_token');
  static const clientCredentials = OauthAccessTokenRequestRefreshGrantTypeEnum._(r'client_credentials');

  /// List of all possible values in this [enum][OauthAccessTokenRequestRefreshGrantTypeEnum].
  static const values = <OauthAccessTokenRequestRefreshGrantTypeEnum>[
    authorizationCode,
    refreshToken,
    clientCredentials,
  ];

  static OauthAccessTokenRequestRefreshGrantTypeEnum? fromJson(dynamic value) => OauthAccessTokenRequestRefreshGrantTypeEnumTypeTransformer().decode(value);

  static List<OauthAccessTokenRequestRefreshGrantTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OauthAccessTokenRequestRefreshGrantTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OauthAccessTokenRequestRefreshGrantTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OauthAccessTokenRequestRefreshGrantTypeEnum] to String,
/// and [decode] dynamic data back to [OauthAccessTokenRequestRefreshGrantTypeEnum].
class OauthAccessTokenRequestRefreshGrantTypeEnumTypeTransformer {
  factory OauthAccessTokenRequestRefreshGrantTypeEnumTypeTransformer() => _instance ??= const OauthAccessTokenRequestRefreshGrantTypeEnumTypeTransformer._();

  const OauthAccessTokenRequestRefreshGrantTypeEnumTypeTransformer._();

  String encode(OauthAccessTokenRequestRefreshGrantTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a OauthAccessTokenRequestRefreshGrantTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OauthAccessTokenRequestRefreshGrantTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'authorization_code': return OauthAccessTokenRequestRefreshGrantTypeEnum.authorizationCode;
        case r'refresh_token': return OauthAccessTokenRequestRefreshGrantTypeEnum.refreshToken;
        case r'client_credentials': return OauthAccessTokenRequestRefreshGrantTypeEnum.clientCredentials;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OauthAccessTokenRequestRefreshGrantTypeEnumTypeTransformer] instance.
  static OauthAccessTokenRequestRefreshGrantTypeEnumTypeTransformer? _instance;
}


