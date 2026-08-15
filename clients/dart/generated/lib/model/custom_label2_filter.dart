//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CustomLabel2Filter {
  /// Returns a new [CustomLabel2Filter] instance.
  CustomLabel2Filter({
    required this.cUSTOMLABEL2,
  });

  CatalogsProductGroupFilterOperatorTypeCriteria cUSTOMLABEL2;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CustomLabel2Filter &&
    other.cUSTOMLABEL2 == cUSTOMLABEL2;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cUSTOMLABEL2.hashCode);

  @override
  String toString() => 'CustomLabel2Filter[cUSTOMLABEL2=$cUSTOMLABEL2]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'CUSTOM_LABEL_2'] = this.cUSTOMLABEL2;
    return json;
  }

  /// Returns a new [CustomLabel2Filter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CustomLabel2Filter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CustomLabel2Filter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CustomLabel2Filter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CustomLabel2Filter(
        cUSTOMLABEL2: mapValueOfType<CatalogsProductGroupFilterOperatorTypeCriteria>(json, r'CUSTOM_LABEL_2')!,
      );
    }
    return null;
  }

  static List<CustomLabel2Filter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CustomLabel2Filter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CustomLabel2Filter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CustomLabel2Filter> mapFromJson(dynamic json) {
    final map = <String, CustomLabel2Filter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CustomLabel2Filter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CustomLabel2Filter-objects as value to a dart map
  static Map<String, List<CustomLabel2Filter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CustomLabel2Filter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CustomLabel2Filter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'CUSTOM_LABEL_2',
  };
}

