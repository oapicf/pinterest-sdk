//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TrendsAgeDistribution {
  /// Returns a new [TrendsAgeDistribution] instance.
  TrendsAgeDistribution({
    this.ageDistribution,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TrendsAgeBucket? ageDistribution;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TrendsAgeDistribution &&
    other.ageDistribution == ageDistribution;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (ageDistribution == null ? 0 : ageDistribution!.hashCode);

  @override
  String toString() => 'TrendsAgeDistribution[ageDistribution=$ageDistribution]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.ageDistribution != null) {
      json[r'age_distribution'] = this.ageDistribution;
    } else {
      json[r'age_distribution'] = null;
    }
    return json;
  }

  /// Returns a new [TrendsAgeDistribution] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TrendsAgeDistribution? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return TrendsAgeDistribution(
        ageDistribution: TrendsAgeBucket.fromJson(json[r'age_distribution']),
      );
    }
    return null;
  }

  static List<TrendsAgeDistribution> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TrendsAgeDistribution>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TrendsAgeDistribution.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TrendsAgeDistribution> mapFromJson(dynamic json) {
    final map = <String, TrendsAgeDistribution>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TrendsAgeDistribution.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TrendsAgeDistribution-objects as value to a dart map
  static Map<String, List<TrendsAgeDistribution>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TrendsAgeDistribution>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TrendsAgeDistribution.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

