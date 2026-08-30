//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionAccessToken {
  /// Returns a new [ConversionAccessToken] instance.
  ConversionAccessToken({
    required this.accessToken,
    this.tokenType = 'conversion',
  });

  String accessToken;

  String tokenType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionAccessToken &&
    other.accessToken == accessToken &&
    other.tokenType == tokenType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (accessToken.hashCode) +
    (tokenType.hashCode);

  @override
  String toString() => 'ConversionAccessToken[accessToken=$accessToken, tokenType=$tokenType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'access_token'] = this.accessToken;
      json[r'token_type'] = this.tokenType;
    return json;
  }

  /// Returns a new [ConversionAccessToken] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionAccessToken? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'access_token'), 'Required key "ConversionAccessToken[access_token]" is missing from JSON.');
        assert(json[r'access_token'] != null, 'Required key "ConversionAccessToken[access_token]" has a null value in JSON.');
        return true;
      }());

      return ConversionAccessToken(
        accessToken: mapValueOfType<String>(json, r'access_token')!,
        tokenType: mapValueOfType<String>(json, r'token_type') ?? 'conversion',
      );
    }
    return null;
  }

  static List<ConversionAccessToken> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionAccessToken>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionAccessToken.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionAccessToken> mapFromJson(dynamic json) {
    final map = <String, ConversionAccessToken>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionAccessToken.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionAccessToken-objects as value to a dart map
  static Map<String, List<ConversionAccessToken>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionAccessToken>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionAccessToken.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'access_token',
  };
}

