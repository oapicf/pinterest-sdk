//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class KeywordUpdateBody {
  /// Returns a new [KeywordUpdateBody] instance.
  KeywordUpdateBody({
    this.keywords = const [],
  });

  /// Keywords to update. Object array. Each object has 2 possible fields:<br>1. \"id\": (required) keyword ID<br>2. \"archived\": boolean. Should keyword be archived?<br>For example: [{\"id\":\"2886610576653\", \"archived\": false}, {\"id\":\"2886610576654\",  \"archived\": true}, ...]
  List<KeywordUpdate> keywords;

  @override
  bool operator ==(Object other) => identical(this, other) || other is KeywordUpdateBody &&
    _deepEquality.equals(other.keywords, keywords);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (keywords.hashCode);

  @override
  String toString() => 'KeywordUpdateBody[keywords=$keywords]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'keywords'] = this.keywords;
    return json;
  }

  /// Returns a new [KeywordUpdateBody] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static KeywordUpdateBody? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "KeywordUpdateBody[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "KeywordUpdateBody[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return KeywordUpdateBody(
        keywords: KeywordUpdate.listFromJson(json[r'keywords']),
      );
    }
    return null;
  }

  static List<KeywordUpdateBody> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <KeywordUpdateBody>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = KeywordUpdateBody.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, KeywordUpdateBody> mapFromJson(dynamic json) {
    final map = <String, KeywordUpdateBody>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = KeywordUpdateBody.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of KeywordUpdateBody-objects as value to a dart map
  static Map<String, List<KeywordUpdateBody>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<KeywordUpdateBody>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = KeywordUpdateBody.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'keywords',
  };
}

