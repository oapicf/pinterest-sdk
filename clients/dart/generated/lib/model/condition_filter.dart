//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConditionFilter {
  /// Returns a new [ConditionFilter] instance.
  ConditionFilter({
    required this.CONDITION,
  });

  CatalogsProductGroupMultipleStringCriteria CONDITION;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConditionFilter &&
    other.CONDITION == CONDITION;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (CONDITION.hashCode);

  @override
  String toString() => 'ConditionFilter[CONDITION=$CONDITION]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'CONDITION'] = this.CONDITION;
    return json;
  }

  /// Returns a new [ConditionFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConditionFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'CONDITION'), 'Required key "ConditionFilter[CONDITION]" is missing from JSON.');
        assert(json[r'CONDITION'] != null, 'Required key "ConditionFilter[CONDITION]" has a null value in JSON.');
        return true;
      }());

      return ConditionFilter(
        CONDITION: CatalogsProductGroupMultipleStringCriteria.fromJson(json[r'CONDITION'])!,
      );
    }
    return null;
  }

  static List<ConditionFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConditionFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConditionFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConditionFilter> mapFromJson(dynamic json) {
    final map = <String, ConditionFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConditionFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConditionFilter-objects as value to a dart map
  static Map<String, List<ConditionFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConditionFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConditionFilter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'CONDITION',
  };
}

