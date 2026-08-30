//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdGroupAudienceSizingKeyword {
  /// Returns a new [AdGroupAudienceSizingKeyword] instance.
  AdGroupAudienceSizingKeyword({
    required this.matchType,
    required this.value,
  });

  MatchType matchType;

  /// Keyword value (120 chars max).
  String value;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdGroupAudienceSizingKeyword &&
    other.matchType == matchType &&
    other.value == value;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (matchType.hashCode) +
    (value.hashCode);

  @override
  String toString() => 'AdGroupAudienceSizingKeyword[matchType=$matchType, value=$value]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'match_type'] = this.matchType;
      json[r'value'] = this.value;
    return json;
  }

  /// Returns a new [AdGroupAudienceSizingKeyword] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdGroupAudienceSizingKeyword? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'match_type'), 'Required key "AdGroupAudienceSizingKeyword[match_type]" is missing from JSON.');
        assert(json[r'match_type'] != null, 'Required key "AdGroupAudienceSizingKeyword[match_type]" has a null value in JSON.');
        assert(json.containsKey(r'value'), 'Required key "AdGroupAudienceSizingKeyword[value]" is missing from JSON.');
        assert(json[r'value'] != null, 'Required key "AdGroupAudienceSizingKeyword[value]" has a null value in JSON.');
        return true;
      }());

      return AdGroupAudienceSizingKeyword(
        matchType: MatchType.fromJson(json[r'match_type'])!,
        value: mapValueOfType<String>(json, r'value')!,
      );
    }
    return null;
  }

  static List<AdGroupAudienceSizingKeyword> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdGroupAudienceSizingKeyword>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdGroupAudienceSizingKeyword.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdGroupAudienceSizingKeyword> mapFromJson(dynamic json) {
    final map = <String, AdGroupAudienceSizingKeyword>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdGroupAudienceSizingKeyword.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdGroupAudienceSizingKeyword-objects as value to a dart map
  static Map<String, List<AdGroupAudienceSizingKeyword>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdGroupAudienceSizingKeyword>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdGroupAudienceSizingKeyword.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'match_type',
    'value',
  };
}

