//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsProductGroupFilters {
  /// Returns a new [CatalogsProductGroupFilters] instance.
  CatalogsProductGroupFilters({
    this.anyOf = const [],
    this.allOf = const [],
  });

  List<CatalogsProductGroupFilterKeys> anyOf;

  List<CatalogsProductGroupFilterKeys> allOf;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsProductGroupFilters &&
    _deepEquality.equals(other.anyOf, anyOf) &&
    _deepEquality.equals(other.allOf, allOf);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (anyOf.hashCode) +
    (allOf.hashCode);

  @override
  String toString() => 'CatalogsProductGroupFilters[anyOf=$anyOf, allOf=$allOf]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'any_of'] = this.anyOf;
      json[r'all_of'] = this.allOf;
    return json;
  }

  /// Returns a new [CatalogsProductGroupFilters] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsProductGroupFilters? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsProductGroupFilters[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsProductGroupFilters[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsProductGroupFilters(
        anyOf: CatalogsProductGroupFilterKeys.listFromJson(json[r'any_of']),
        allOf: CatalogsProductGroupFilterKeys.listFromJson(json[r'all_of']),
      );
    }
    return null;
  }

  static List<CatalogsProductGroupFilters> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsProductGroupFilters>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsProductGroupFilters.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsProductGroupFilters> mapFromJson(dynamic json) {
    final map = <String, CatalogsProductGroupFilters>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsProductGroupFilters.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsProductGroupFilters-objects as value to a dart map
  static Map<String, List<CatalogsProductGroupFilters>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsProductGroupFilters>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsProductGroupFilters.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'any_of',
    'all_of',
  };
}

