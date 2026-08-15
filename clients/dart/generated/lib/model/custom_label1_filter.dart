//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CustomLabel1Filter {
  /// Returns a new [CustomLabel1Filter] instance.
  CustomLabel1Filter({
    required this.cUSTOMLABEL1,
  });

  CatalogsProductGroupFilterOperatorTypeCriteria cUSTOMLABEL1;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CustomLabel1Filter &&
    other.cUSTOMLABEL1 == cUSTOMLABEL1;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cUSTOMLABEL1.hashCode);

  @override
  String toString() => 'CustomLabel1Filter[cUSTOMLABEL1=$cUSTOMLABEL1]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'CUSTOM_LABEL_1'] = this.cUSTOMLABEL1;
    return json;
  }

  /// Returns a new [CustomLabel1Filter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CustomLabel1Filter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CustomLabel1Filter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CustomLabel1Filter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CustomLabel1Filter(
        cUSTOMLABEL1: mapValueOfType<CatalogsProductGroupFilterOperatorTypeCriteria>(json, r'CUSTOM_LABEL_1')!,
      );
    }
    return null;
  }

  static List<CustomLabel1Filter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CustomLabel1Filter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CustomLabel1Filter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CustomLabel1Filter> mapFromJson(dynamic json) {
    final map = <String, CustomLabel1Filter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CustomLabel1Filter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CustomLabel1Filter-objects as value to a dart map
  static Map<String, List<CustomLabel1Filter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CustomLabel1Filter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CustomLabel1Filter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'CUSTOM_LABEL_1',
  };
}

