//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OauthAccessTokenRequestCode {
  /// Returns a new [OauthAccessTokenRequestCode] instance.
  OauthAccessTokenRequestCode({
    required this.code,
    required this.redirectUri,
    required this.grantType,
  });

  String code;

  String redirectUri;

  OauthAccessTokenRequestCodeGrantTypeEnum grantType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OauthAccessTokenRequestCode &&
    other.code == code &&
    other.redirectUri == redirectUri &&
    other.grantType == grantType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (code.hashCode) +
    (redirectUri.hashCode) +
    (grantType.hashCode);

  @override
  String toString() => 'OauthAccessTokenRequestCode[code=$code, redirectUri=$redirectUri, grantType=$grantType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'code'] = this.code;
      json[r'redirect_uri'] = this.redirectUri;
      json[r'grant_type'] = this.grantType;
    return json;
  }

  /// Returns a new [OauthAccessTokenRequestCode] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OauthAccessTokenRequestCode? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OauthAccessTokenRequestCode[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OauthAccessTokenRequestCode[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OauthAccessTokenRequestCode(
        code: mapValueOfType<String>(json, r'code')!,
        redirectUri: mapValueOfType<String>(json, r'redirect_uri')!,
        grantType: OauthAccessTokenRequestCodeGrantTypeEnum.fromJson(json[r'grant_type'])!,
      );
    }
    return null;
  }

  static List<OauthAccessTokenRequestCode> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OauthAccessTokenRequestCode>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OauthAccessTokenRequestCode.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OauthAccessTokenRequestCode> mapFromJson(dynamic json) {
    final map = <String, OauthAccessTokenRequestCode>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OauthAccessTokenRequestCode.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OauthAccessTokenRequestCode-objects as value to a dart map
  static Map<String, List<OauthAccessTokenRequestCode>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OauthAccessTokenRequestCode>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OauthAccessTokenRequestCode.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'code',
    'redirect_uri',
    'grant_type',
  };
}


class OauthAccessTokenRequestCodeGrantTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const OauthAccessTokenRequestCodeGrantTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const authorizationCode = OauthAccessTokenRequestCodeGrantTypeEnum._(r'authorization_code');
  static const refreshToken = OauthAccessTokenRequestCodeGrantTypeEnum._(r'refresh_token');
  static const clientCredentials = OauthAccessTokenRequestCodeGrantTypeEnum._(r'client_credentials');

  /// List of all possible values in this [enum][OauthAccessTokenRequestCodeGrantTypeEnum].
  static const values = <OauthAccessTokenRequestCodeGrantTypeEnum>[
    authorizationCode,
    refreshToken,
    clientCredentials,
  ];

  static OauthAccessTokenRequestCodeGrantTypeEnum? fromJson(dynamic value) => OauthAccessTokenRequestCodeGrantTypeEnumTypeTransformer().decode(value);

  static List<OauthAccessTokenRequestCodeGrantTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OauthAccessTokenRequestCodeGrantTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OauthAccessTokenRequestCodeGrantTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OauthAccessTokenRequestCodeGrantTypeEnum] to String,
/// and [decode] dynamic data back to [OauthAccessTokenRequestCodeGrantTypeEnum].
class OauthAccessTokenRequestCodeGrantTypeEnumTypeTransformer {
  factory OauthAccessTokenRequestCodeGrantTypeEnumTypeTransformer() => _instance ??= const OauthAccessTokenRequestCodeGrantTypeEnumTypeTransformer._();

  const OauthAccessTokenRequestCodeGrantTypeEnumTypeTransformer._();

  String encode(OauthAccessTokenRequestCodeGrantTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a OauthAccessTokenRequestCodeGrantTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OauthAccessTokenRequestCodeGrantTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'authorization_code': return OauthAccessTokenRequestCodeGrantTypeEnum.authorizationCode;
        case r'refresh_token': return OauthAccessTokenRequestCodeGrantTypeEnum.refreshToken;
        case r'client_credentials': return OauthAccessTokenRequestCodeGrantTypeEnum.clientCredentials;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OauthAccessTokenRequestCodeGrantTypeEnumTypeTransformer] instance.
  static OauthAccessTokenRequestCodeGrantTypeEnumTypeTransformer? _instance;
}


