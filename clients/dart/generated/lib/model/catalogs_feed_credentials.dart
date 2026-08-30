//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsFeedCredentials {
  /// Returns a new [CatalogsFeedCredentials] instance.
  CatalogsFeedCredentials({
    required this.password,
    required this.username,
  });

  /// The required password for downloading a feed.
  String password;

  /// The required username for downloading a feed.
  String username;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsFeedCredentials &&
    other.password == password &&
    other.username == username;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (password.hashCode) +
    (username.hashCode);

  @override
  String toString() => 'CatalogsFeedCredentials[password=$password, username=$username]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'password'] = this.password;
      json[r'username'] = this.username;
    return json;
  }

  /// Returns a new [CatalogsFeedCredentials] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsFeedCredentials? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'password'), 'Required key "CatalogsFeedCredentials[password]" is missing from JSON.');
        assert(json[r'password'] != null, 'Required key "CatalogsFeedCredentials[password]" has a null value in JSON.');
        assert(json.containsKey(r'username'), 'Required key "CatalogsFeedCredentials[username]" is missing from JSON.');
        assert(json[r'username'] != null, 'Required key "CatalogsFeedCredentials[username]" has a null value in JSON.');
        return true;
      }());

      return CatalogsFeedCredentials(
        password: mapValueOfType<String>(json, r'password')!,
        username: mapValueOfType<String>(json, r'username')!,
      );
    }
    return null;
  }

  static List<CatalogsFeedCredentials> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsFeedCredentials>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsFeedCredentials.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsFeedCredentials> mapFromJson(dynamic json) {
    final map = <String, CatalogsFeedCredentials>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsFeedCredentials.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsFeedCredentials-objects as value to a dart map
  static Map<String, List<CatalogsFeedCredentials>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsFeedCredentials>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsFeedCredentials.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'password',
    'username',
  };
}

