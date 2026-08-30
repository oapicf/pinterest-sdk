//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Keywords {
  /// Returns a new [Keywords] instance.
  Keywords({
    this.errors = const [],
    this.keywords = const [],
  });

  /// Keyword error
  List<KeywordError> errors;

  /// Keywords
  List<Keyword> keywords;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Keywords &&
    _deepEquality.equals(other.errors, errors) &&
    _deepEquality.equals(other.keywords, keywords);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (errors.hashCode) +
    (keywords.hashCode);

  @override
  String toString() => 'Keywords[errors=$errors, keywords=$keywords]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'errors'] = this.errors;
      json[r'keywords'] = this.keywords;
    return json;
  }

  /// Returns a new [Keywords] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Keywords? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'errors'), 'Required key "Keywords[errors]" is missing from JSON.');
        assert(json[r'errors'] != null, 'Required key "Keywords[errors]" has a null value in JSON.');
        assert(json.containsKey(r'keywords'), 'Required key "Keywords[keywords]" is missing from JSON.');
        assert(json[r'keywords'] != null, 'Required key "Keywords[keywords]" has a null value in JSON.');
        return true;
      }());

      return Keywords(
        errors: KeywordError.listFromJson(json[r'errors']),
        keywords: Keyword.listFromJson(json[r'keywords']),
      );
    }
    return null;
  }

  static List<Keywords> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Keywords>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Keywords.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Keywords> mapFromJson(dynamic json) {
    final map = <String, Keywords>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Keywords.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Keywords-objects as value to a dart map
  static Map<String, List<Keywords>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Keywords>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Keywords.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'errors',
    'keywords',
  };
}

