//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AvailabilityFilter {
  /// Returns a new [AvailabilityFilter] instance.
  AvailabilityFilter({
    required this.AVAILABILITY,
  });

  CatalogsProductGroupMultipleStringCriteria AVAILABILITY;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AvailabilityFilter &&
    other.AVAILABILITY == AVAILABILITY;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (AVAILABILITY.hashCode);

  @override
  String toString() => 'AvailabilityFilter[AVAILABILITY=$AVAILABILITY]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'AVAILABILITY'] = this.AVAILABILITY;
    return json;
  }

  /// Returns a new [AvailabilityFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AvailabilityFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AvailabilityFilter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AvailabilityFilter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AvailabilityFilter(
        AVAILABILITY: mapValueOfType<CatalogsProductGroupMultipleStringCriteria>(json, r'AVAILABILITY')!,
      );
    }
    return null;
  }

  static List<AvailabilityFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AvailabilityFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AvailabilityFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AvailabilityFilter> mapFromJson(dynamic json) {
    final map = <String, AvailabilityFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AvailabilityFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AvailabilityFilter-objects as value to a dart map
  static Map<String, List<AvailabilityFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AvailabilityFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AvailabilityFilter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'AVAILABILITY',
  };
}

