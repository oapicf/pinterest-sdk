//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsHotelProductGroupFiltersAllOf {
  /// Returns a new [CatalogsHotelProductGroupFiltersAllOf] instance.
  CatalogsHotelProductGroupFiltersAllOf({
    this.allOf = const [],
  });

  List<CatalogsHotelProductGroupFilterKeys> allOf;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsHotelProductGroupFiltersAllOf &&
    _deepEquality.equals(other.allOf, allOf);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (allOf.hashCode);

  @override
  String toString() => 'CatalogsHotelProductGroupFiltersAllOf[allOf=$allOf]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'all_of'] = this.allOf;
    return json;
  }

  /// Returns a new [CatalogsHotelProductGroupFiltersAllOf] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsHotelProductGroupFiltersAllOf? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'all_of'), 'Required key "CatalogsHotelProductGroupFiltersAllOf[all_of]" is missing from JSON.');
        assert(json[r'all_of'] != null, 'Required key "CatalogsHotelProductGroupFiltersAllOf[all_of]" has a null value in JSON.');
        return true;
      }());

      return CatalogsHotelProductGroupFiltersAllOf(
        allOf: CatalogsHotelProductGroupFilterKeys.listFromJson(json[r'all_of']),
      );
    }
    return null;
  }

  static List<CatalogsHotelProductGroupFiltersAllOf> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelProductGroupFiltersAllOf>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelProductGroupFiltersAllOf.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsHotelProductGroupFiltersAllOf> mapFromJson(dynamic json) {
    final map = <String, CatalogsHotelProductGroupFiltersAllOf>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsHotelProductGroupFiltersAllOf.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsHotelProductGroupFiltersAllOf-objects as value to a dart map
  static Map<String, List<CatalogsHotelProductGroupFiltersAllOf>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsHotelProductGroupFiltersAllOf>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsHotelProductGroupFiltersAllOf.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'all_of',
  };
}

