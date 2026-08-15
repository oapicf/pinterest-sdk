//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class KeywordMetricsResponse {
  /// Returns a new [KeywordMetricsResponse] instance.
  KeywordMetricsResponse({
    this.keyword,
    this.metrics,
  });

  /// Keyword name, e.g., \"keyword\":\"fashion outfits\"
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? keyword;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  KeywordMetrics? metrics;

  @override
  bool operator ==(Object other) => identical(this, other) || other is KeywordMetricsResponse &&
    other.keyword == keyword &&
    other.metrics == metrics;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (keyword == null ? 0 : keyword!.hashCode) +
    (metrics == null ? 0 : metrics!.hashCode);

  @override
  String toString() => 'KeywordMetricsResponse[keyword=$keyword, metrics=$metrics]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.keyword != null) {
      json[r'keyword'] = this.keyword;
    } else {
      json[r'keyword'] = null;
    }
    if (this.metrics != null) {
      json[r'metrics'] = this.metrics;
    } else {
      json[r'metrics'] = null;
    }
    return json;
  }

  /// Returns a new [KeywordMetricsResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static KeywordMetricsResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "KeywordMetricsResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "KeywordMetricsResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return KeywordMetricsResponse(
        keyword: mapValueOfType<String>(json, r'keyword'),
        metrics: KeywordMetrics.fromJson(json[r'metrics']),
      );
    }
    return null;
  }

  static List<KeywordMetricsResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <KeywordMetricsResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = KeywordMetricsResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, KeywordMetricsResponse> mapFromJson(dynamic json) {
    final map = <String, KeywordMetricsResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = KeywordMetricsResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of KeywordMetricsResponse-objects as value to a dart map
  static Map<String, List<KeywordMetricsResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<KeywordMetricsResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = KeywordMetricsResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

