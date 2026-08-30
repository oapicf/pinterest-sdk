//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CustomLabel4Filter {
  /// Returns a new [CustomLabel4Filter] instance.
  CustomLabel4Filter({
    required this.CUSTOM_LABEL_4,
  });

  CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_4;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CustomLabel4Filter &&
    other.CUSTOM_LABEL_4 == CUSTOM_LABEL_4;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (CUSTOM_LABEL_4.hashCode);

  @override
  String toString() => 'CustomLabel4Filter[CUSTOM_LABEL_4=$CUSTOM_LABEL_4]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'CUSTOM_LABEL_4'] = this.CUSTOM_LABEL_4;
    return json;
  }

  /// Returns a new [CustomLabel4Filter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CustomLabel4Filter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'CUSTOM_LABEL_4'), 'Required key "CustomLabel4Filter[CUSTOM_LABEL_4]" is missing from JSON.');
        assert(json[r'CUSTOM_LABEL_4'] != null, 'Required key "CustomLabel4Filter[CUSTOM_LABEL_4]" has a null value in JSON.');
        return true;
      }());

      return CustomLabel4Filter(
        CUSTOM_LABEL_4: CatalogsProductGroupFilterOperatorTypeCriteria.fromJson(json[r'CUSTOM_LABEL_4'])!,
      );
    }
    return null;
  }

  static List<CustomLabel4Filter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CustomLabel4Filter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CustomLabel4Filter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CustomLabel4Filter> mapFromJson(dynamic json) {
    final map = <String, CustomLabel4Filter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CustomLabel4Filter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CustomLabel4Filter-objects as value to a dart map
  static Map<String, List<CustomLabel4Filter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CustomLabel4Filter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CustomLabel4Filter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'CUSTOM_LABEL_4',
  };
}

