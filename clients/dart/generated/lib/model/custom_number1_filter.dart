//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CustomNumber1Filter {
  /// Returns a new [CustomNumber1Filter] instance.
  CustomNumber1Filter({
    required this.CUSTOM_NUMBER_1,
  });

  CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CustomNumber1Filter &&
    other.CUSTOM_NUMBER_1 == CUSTOM_NUMBER_1;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (CUSTOM_NUMBER_1.hashCode);

  @override
  String toString() => 'CustomNumber1Filter[CUSTOM_NUMBER_1=$CUSTOM_NUMBER_1]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'CUSTOM_NUMBER_1'] = this.CUSTOM_NUMBER_1;
    return json;
  }

  /// Returns a new [CustomNumber1Filter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CustomNumber1Filter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'CUSTOM_NUMBER_1'), 'Required key "CustomNumber1Filter[CUSTOM_NUMBER_1]" is missing from JSON.');
        assert(json[r'CUSTOM_NUMBER_1'] != null, 'Required key "CustomNumber1Filter[CUSTOM_NUMBER_1]" has a null value in JSON.');
        return true;
      }());

      return CustomNumber1Filter(
        CUSTOM_NUMBER_1: CatalogsProductGroupUint32Criteria.fromJson(json[r'CUSTOM_NUMBER_1'])!,
      );
    }
    return null;
  }

  static List<CustomNumber1Filter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CustomNumber1Filter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CustomNumber1Filter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CustomNumber1Filter> mapFromJson(dynamic json) {
    final map = <String, CustomNumber1Filter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CustomNumber1Filter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CustomNumber1Filter-objects as value to a dart map
  static Map<String, List<CustomNumber1Filter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CustomNumber1Filter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CustomNumber1Filter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'CUSTOM_NUMBER_1',
  };
}

