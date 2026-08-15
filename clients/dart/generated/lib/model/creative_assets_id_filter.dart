//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreativeAssetsIdFilter {
  /// Returns a new [CreativeAssetsIdFilter] instance.
  CreativeAssetsIdFilter({
    required this.CREATIVE_ASSETS_ID,
  });

  CatalogsProductGroupMultipleStringCriteria CREATIVE_ASSETS_ID;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreativeAssetsIdFilter &&
    other.CREATIVE_ASSETS_ID == CREATIVE_ASSETS_ID;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (CREATIVE_ASSETS_ID.hashCode);

  @override
  String toString() => 'CreativeAssetsIdFilter[CREATIVE_ASSETS_ID=$CREATIVE_ASSETS_ID]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'CREATIVE_ASSETS_ID'] = this.CREATIVE_ASSETS_ID;
    return json;
  }

  /// Returns a new [CreativeAssetsIdFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreativeAssetsIdFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreativeAssetsIdFilter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreativeAssetsIdFilter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreativeAssetsIdFilter(
        CREATIVE_ASSETS_ID: mapValueOfType<CatalogsProductGroupMultipleStringCriteria>(json, r'CREATIVE_ASSETS_ID')!,
      );
    }
    return null;
  }

  static List<CreativeAssetsIdFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreativeAssetsIdFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreativeAssetsIdFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreativeAssetsIdFilter> mapFromJson(dynamic json) {
    final map = <String, CreativeAssetsIdFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreativeAssetsIdFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreativeAssetsIdFilter-objects as value to a dart map
  static Map<String, List<CreativeAssetsIdFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreativeAssetsIdFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreativeAssetsIdFilter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'CREATIVE_ASSETS_ID',
  };
}

