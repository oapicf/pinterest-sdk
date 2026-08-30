//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SchedulePlacementMultipliers {
  /// Returns a new [SchedulePlacementMultipliers] instance.
  SchedulePlacementMultipliers({
    this.browse,
    this.relatedPins,
    this.search,
  });

  /// Browse (home-feed and related surfaces)
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  double? browse;

  /// Related-Pins placement
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  double? relatedPins;

  /// Search placement
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  double? search;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SchedulePlacementMultipliers &&
    other.browse == browse &&
    other.relatedPins == relatedPins &&
    other.search == search;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (browse == null ? 0 : browse!.hashCode) +
    (relatedPins == null ? 0 : relatedPins!.hashCode) +
    (search == null ? 0 : search!.hashCode);

  @override
  String toString() => 'SchedulePlacementMultipliers[browse=$browse, relatedPins=$relatedPins, search=$search]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.browse != null) {
      json[r'browse'] = this.browse;
    } else {
      json[r'browse'] = null;
    }
    if (this.relatedPins != null) {
      json[r'related_pins'] = this.relatedPins;
    } else {
      json[r'related_pins'] = null;
    }
    if (this.search != null) {
      json[r'search'] = this.search;
    } else {
      json[r'search'] = null;
    }
    return json;
  }

  /// Returns a new [SchedulePlacementMultipliers] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SchedulePlacementMultipliers? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return SchedulePlacementMultipliers(
        browse: mapValueOfType<double>(json, r'browse'),
        relatedPins: mapValueOfType<double>(json, r'related_pins'),
        search: mapValueOfType<double>(json, r'search'),
      );
    }
    return null;
  }

  static List<SchedulePlacementMultipliers> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SchedulePlacementMultipliers>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SchedulePlacementMultipliers.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SchedulePlacementMultipliers> mapFromJson(dynamic json) {
    final map = <String, SchedulePlacementMultipliers>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SchedulePlacementMultipliers.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SchedulePlacementMultipliers-objects as value to a dart map
  static Map<String, List<SchedulePlacementMultipliers>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SchedulePlacementMultipliers>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SchedulePlacementMultipliers.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

