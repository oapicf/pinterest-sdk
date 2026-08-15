//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OauthAccessTokenRequestClientCredentials {
  /// Returns a new [OauthAccessTokenRequestClientCredentials] instance.
  OauthAccessTokenRequestClientCredentials({
    required this.scope,
    required this.grantType,
  });

  String scope;

  OauthAccessTokenRequestClientCredentialsGrantTypeEnum grantType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OauthAccessTokenRequestClientCredentials &&
    other.scope == scope &&
    other.grantType == grantType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (scope.hashCode) +
    (grantType.hashCode);

  @override
  String toString() => 'OauthAccessTokenRequestClientCredentials[scope=$scope, grantType=$grantType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'scope'] = this.scope;
      json[r'grant_type'] = this.grantType;
    return json;
  }

  /// Returns a new [OauthAccessTokenRequestClientCredentials] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OauthAccessTokenRequestClientCredentials? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OauthAccessTokenRequestClientCredentials[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OauthAccessTokenRequestClientCredentials[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OauthAccessTokenRequestClientCredentials(
        scope: mapValueOfType<String>(json, r'scope')!,
        grantType: OauthAccessTokenRequestClientCredentialsGrantTypeEnum.fromJson(json[r'grant_type'])!,
      );
    }
    return null;
  }

  static List<OauthAccessTokenRequestClientCredentials> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OauthAccessTokenRequestClientCredentials>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OauthAccessTokenRequestClientCredentials.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OauthAccessTokenRequestClientCredentials> mapFromJson(dynamic json) {
    final map = <String, OauthAccessTokenRequestClientCredentials>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OauthAccessTokenRequestClientCredentials.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OauthAccessTokenRequestClientCredentials-objects as value to a dart map
  static Map<String, List<OauthAccessTokenRequestClientCredentials>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OauthAccessTokenRequestClientCredentials>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OauthAccessTokenRequestClientCredentials.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'scope',
    'grant_type',
  };
}


class OauthAccessTokenRequestClientCredentialsGrantTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const OauthAccessTokenRequestClientCredentialsGrantTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const authorizationCode = OauthAccessTokenRequestClientCredentialsGrantTypeEnum._(r'authorization_code');
  static const refreshToken = OauthAccessTokenRequestClientCredentialsGrantTypeEnum._(r'refresh_token');
  static const clientCredentials = OauthAccessTokenRequestClientCredentialsGrantTypeEnum._(r'client_credentials');

  /// List of all possible values in this [enum][OauthAccessTokenRequestClientCredentialsGrantTypeEnum].
  static const values = <OauthAccessTokenRequestClientCredentialsGrantTypeEnum>[
    authorizationCode,
    refreshToken,
    clientCredentials,
  ];

  static OauthAccessTokenRequestClientCredentialsGrantTypeEnum? fromJson(dynamic value) => OauthAccessTokenRequestClientCredentialsGrantTypeEnumTypeTransformer().decode(value);

  static List<OauthAccessTokenRequestClientCredentialsGrantTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OauthAccessTokenRequestClientCredentialsGrantTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OauthAccessTokenRequestClientCredentialsGrantTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OauthAccessTokenRequestClientCredentialsGrantTypeEnum] to String,
/// and [decode] dynamic data back to [OauthAccessTokenRequestClientCredentialsGrantTypeEnum].
class OauthAccessTokenRequestClientCredentialsGrantTypeEnumTypeTransformer {
  factory OauthAccessTokenRequestClientCredentialsGrantTypeEnumTypeTransformer() => _instance ??= const OauthAccessTokenRequestClientCredentialsGrantTypeEnumTypeTransformer._();

  const OauthAccessTokenRequestClientCredentialsGrantTypeEnumTypeTransformer._();

  String encode(OauthAccessTokenRequestClientCredentialsGrantTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a OauthAccessTokenRequestClientCredentialsGrantTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OauthAccessTokenRequestClientCredentialsGrantTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'authorization_code': return OauthAccessTokenRequestClientCredentialsGrantTypeEnum.authorizationCode;
        case r'refresh_token': return OauthAccessTokenRequestClientCredentialsGrantTypeEnum.refreshToken;
        case r'client_credentials': return OauthAccessTokenRequestClientCredentialsGrantTypeEnum.clientCredentials;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OauthAccessTokenRequestClientCredentialsGrantTypeEnumTypeTransformer] instance.
  static OauthAccessTokenRequestClientCredentialsGrantTypeEnumTypeTransformer? _instance;
}


