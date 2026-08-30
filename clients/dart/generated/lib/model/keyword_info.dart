//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class KeywordInfo {
  /// Returns a new [KeywordInfo] instance.
  KeywordInfo({
    required this.name,
    this.pctGrowthMom,
  });

  /// Keyword Name
  String name;

  /// MoM growth as a percentage, if there is no growth rate, this field is not present
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? pctGrowthMom;

  @override
  bool operator ==(Object other) => identical(this, other) || other is KeywordInfo &&
    other.name == name &&
    other.pctGrowthMom == pctGrowthMom;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name.hashCode) +
    (pctGrowthMom == null ? 0 : pctGrowthMom!.hashCode);

  @override
  String toString() => 'KeywordInfo[name=$name, pctGrowthMom=$pctGrowthMom]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'name'] = this.name;
    if (this.pctGrowthMom != null) {
      json[r'pct_growth_mom'] = this.pctGrowthMom;
    } else {
      json[r'pct_growth_mom'] = null;
    }
    return json;
  }

  /// Returns a new [KeywordInfo] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static KeywordInfo? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'name'), 'Required key "KeywordInfo[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "KeywordInfo[name]" has a null value in JSON.');
        return true;
      }());

      return KeywordInfo(
        name: mapValueOfType<String>(json, r'name')!,
        pctGrowthMom: num.parse('${json[r'pct_growth_mom']}'),
      );
    }
    return null;
  }

  static List<KeywordInfo> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <KeywordInfo>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = KeywordInfo.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, KeywordInfo> mapFromJson(dynamic json) {
    final map = <String, KeywordInfo>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = KeywordInfo.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of KeywordInfo-objects as value to a dart map
  static Map<String, List<KeywordInfo>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<KeywordInfo>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = KeywordInfo.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'name',
  };
}

