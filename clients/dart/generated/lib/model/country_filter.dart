//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CountryFilter {
  /// Returns a new [CountryFilter] instance.
  CountryFilter({
    required this.COUNTRY,
  });

  CatalogsProductGroupMultipleCountriesCriteria COUNTRY;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CountryFilter &&
    other.COUNTRY == COUNTRY;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (COUNTRY.hashCode);

  @override
  String toString() => 'CountryFilter[COUNTRY=$COUNTRY]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'COUNTRY'] = this.COUNTRY;
    return json;
  }

  /// Returns a new [CountryFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CountryFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'COUNTRY'), 'Required key "CountryFilter[COUNTRY]" is missing from JSON.');
        assert(json[r'COUNTRY'] != null, 'Required key "CountryFilter[COUNTRY]" has a null value in JSON.');
        return true;
      }());

      return CountryFilter(
        COUNTRY: CatalogsProductGroupMultipleCountriesCriteria.fromJson(json[r'COUNTRY'])!,
      );
    }
    return null;
  }

  static List<CountryFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CountryFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CountryFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CountryFilter> mapFromJson(dynamic json) {
    final map = <String, CountryFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CountryFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CountryFilter-objects as value to a dart map
  static Map<String, List<CountryFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CountryFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CountryFilter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'COUNTRY',
  };
}

