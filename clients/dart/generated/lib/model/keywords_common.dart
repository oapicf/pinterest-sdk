//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class KeywordsCommon {
  /// Returns a new [KeywordsCommon] instance.
  KeywordsCommon({
    this.bid,
    required this.matchType,
    required this.value,
  });

  /// </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
  int? bid;

  MatchTypeResponse? matchType;

  /// Keyword value (120 chars max).
  String value;

  @override
  bool operator ==(Object other) => identical(this, other) || other is KeywordsCommon &&
    other.bid == bid &&
    other.matchType == matchType &&
    other.value == value;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (bid == null ? 0 : bid!.hashCode) +
    (matchType == null ? 0 : matchType!.hashCode) +
    (value.hashCode);

  @override
  String toString() => 'KeywordsCommon[bid=$bid, matchType=$matchType, value=$value]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.bid != null) {
      json[r'bid'] = this.bid;
    } else {
      json[r'bid'] = null;
    }
    if (this.matchType != null) {
      json[r'match_type'] = this.matchType;
    } else {
      json[r'match_type'] = null;
    }
      json[r'value'] = this.value;
    return json;
  }

  /// Returns a new [KeywordsCommon] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static KeywordsCommon? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'match_type'), 'Required key "KeywordsCommon[match_type]" is missing from JSON.');
        assert(json.containsKey(r'value'), 'Required key "KeywordsCommon[value]" is missing from JSON.');
        assert(json[r'value'] != null, 'Required key "KeywordsCommon[value]" has a null value in JSON.');
        return true;
      }());

      return KeywordsCommon(
        bid: mapValueOfType<int>(json, r'bid'),
        matchType: MatchTypeResponse.fromJson(json[r'match_type']),
        value: mapValueOfType<String>(json, r'value')!,
      );
    }
    return null;
  }

  static List<KeywordsCommon> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <KeywordsCommon>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = KeywordsCommon.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, KeywordsCommon> mapFromJson(dynamic json) {
    final map = <String, KeywordsCommon>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = KeywordsCommon.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of KeywordsCommon-objects as value to a dart map
  static Map<String, List<KeywordsCommon>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<KeywordsCommon>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = KeywordsCommon.listFromJson(entry.value, growable: growable,);
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

