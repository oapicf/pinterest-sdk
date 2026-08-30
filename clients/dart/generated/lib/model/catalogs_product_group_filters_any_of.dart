//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsProductGroupFiltersAnyOf {
  /// Returns a new [CatalogsProductGroupFiltersAnyOf] instance.
  CatalogsProductGroupFiltersAnyOf({
    this.anyOf = const [],
  });

  List<CatalogsProductGroupFilterKeys> anyOf;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsProductGroupFiltersAnyOf &&
    _deepEquality.equals(other.anyOf, anyOf);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (anyOf.hashCode);

  @override
  String toString() => 'CatalogsProductGroupFiltersAnyOf[anyOf=$anyOf]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'any_of'] = this.anyOf;
    return json;
  }

  /// Returns a new [CatalogsProductGroupFiltersAnyOf] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsProductGroupFiltersAnyOf? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'any_of'), 'Required key "CatalogsProductGroupFiltersAnyOf[any_of]" is missing from JSON.');
        assert(json[r'any_of'] != null, 'Required key "CatalogsProductGroupFiltersAnyOf[any_of]" has a null value in JSON.');
        return true;
      }());

      return CatalogsProductGroupFiltersAnyOf(
        anyOf: CatalogsProductGroupFilterKeys.listFromJson(json[r'any_of']),
      );
    }
    return null;
  }

  static List<CatalogsProductGroupFiltersAnyOf> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsProductGroupFiltersAnyOf>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsProductGroupFiltersAnyOf.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsProductGroupFiltersAnyOf> mapFromJson(dynamic json) {
    final map = <String, CatalogsProductGroupFiltersAnyOf>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsProductGroupFiltersAnyOf.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsProductGroupFiltersAnyOf-objects as value to a dart map
  static Map<String, List<CatalogsProductGroupFiltersAnyOf>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsProductGroupFiltersAnyOf>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsProductGroupFiltersAnyOf.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'any_of',
  };
}

