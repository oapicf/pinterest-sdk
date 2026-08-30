//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsProductGroupFiltersRequest {
  /// Returns a new [CatalogsProductGroupFiltersRequest] instance.
  CatalogsProductGroupFiltersRequest({
    this.anyOf = const [],
    this.allOf = const [],
  });

  List<CatalogsProductGroupFilterKeys> anyOf;

  List<CatalogsProductGroupFilterKeys> allOf;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsProductGroupFiltersRequest &&
    _deepEquality.equals(other.anyOf, anyOf) &&
    _deepEquality.equals(other.allOf, allOf);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (anyOf.hashCode) +
    (allOf.hashCode);

  @override
  String toString() => 'CatalogsProductGroupFiltersRequest[anyOf=$anyOf, allOf=$allOf]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'any_of'] = this.anyOf;
      json[r'all_of'] = this.allOf;
    return json;
  }

  /// Returns a new [CatalogsProductGroupFiltersRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsProductGroupFiltersRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'any_of'), 'Required key "CatalogsProductGroupFiltersRequest[any_of]" is missing from JSON.');
        assert(json[r'any_of'] != null, 'Required key "CatalogsProductGroupFiltersRequest[any_of]" has a null value in JSON.');
        assert(json.containsKey(r'all_of'), 'Required key "CatalogsProductGroupFiltersRequest[all_of]" is missing from JSON.');
        assert(json[r'all_of'] != null, 'Required key "CatalogsProductGroupFiltersRequest[all_of]" has a null value in JSON.');
        return true;
      }());

      return CatalogsProductGroupFiltersRequest(
        anyOf: CatalogsProductGroupFilterKeys.listFromJson(json[r'any_of']),
        allOf: CatalogsProductGroupFilterKeys.listFromJson(json[r'all_of']),
      );
    }
    return null;
  }

  static List<CatalogsProductGroupFiltersRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsProductGroupFiltersRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsProductGroupFiltersRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsProductGroupFiltersRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsProductGroupFiltersRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsProductGroupFiltersRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsProductGroupFiltersRequest-objects as value to a dart map
  static Map<String, List<CatalogsProductGroupFiltersRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsProductGroupFiltersRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsProductGroupFiltersRequest.listFromJson(entry.value, growable: growable,);
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

