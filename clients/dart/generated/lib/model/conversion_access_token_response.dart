//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionAccessTokenResponse {
  /// Returns a new [ConversionAccessTokenResponse] instance.
  ConversionAccessTokenResponse({
    required this.accessToken,
    this.tokenType = 'conversion',
  });

  String accessToken;

  String tokenType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionAccessTokenResponse &&
    other.accessToken == accessToken &&
    other.tokenType == tokenType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (accessToken.hashCode) +
    (tokenType.hashCode);

  @override
  String toString() => 'ConversionAccessTokenResponse[accessToken=$accessToken, tokenType=$tokenType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'access_token'] = this.accessToken;
      json[r'token_type'] = this.tokenType;
    return json;
  }

  /// Returns a new [ConversionAccessTokenResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionAccessTokenResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ConversionAccessTokenResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ConversionAccessTokenResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ConversionAccessTokenResponse(
        accessToken: mapValueOfType<String>(json, r'access_token')!,
        tokenType: mapValueOfType<String>(json, r'token_type') ?? 'conversion',
      );
    }
    return null;
  }

  static List<ConversionAccessTokenResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionAccessTokenResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionAccessTokenResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionAccessTokenResponse> mapFromJson(dynamic json) {
    final map = <String, ConversionAccessTokenResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionAccessTokenResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionAccessTokenResponse-objects as value to a dart map
  static Map<String, List<ConversionAccessTokenResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionAccessTokenResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionAccessTokenResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'access_token',
  };
}

