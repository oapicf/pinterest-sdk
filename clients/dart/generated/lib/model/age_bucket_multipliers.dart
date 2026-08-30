//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AgeBucketMultipliers {
  /// Returns a new [AgeBucketMultipliers] instance.
  AgeBucketMultipliers({
    this.AGE_BUCKET,
  });

  /// Age bucket identifier.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TargetingSpecAgeBucket? AGE_BUCKET;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AgeBucketMultipliers &&
    other.AGE_BUCKET == AGE_BUCKET;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (AGE_BUCKET == null ? 0 : AGE_BUCKET!.hashCode);

  @override
  String toString() => 'AgeBucketMultipliers[AGE_BUCKET=$AGE_BUCKET]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.AGE_BUCKET != null) {
      json[r'AGE_BUCKET'] = this.AGE_BUCKET;
    } else {
      json[r'AGE_BUCKET'] = null;
    }
    return json;
  }

  /// Returns a new [AgeBucketMultipliers] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AgeBucketMultipliers? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return AgeBucketMultipliers(
        AGE_BUCKET: TargetingSpecAgeBucket.fromJson(json[r'AGE_BUCKET']),
      );
    }
    return null;
  }

  static List<AgeBucketMultipliers> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AgeBucketMultipliers>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AgeBucketMultipliers.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AgeBucketMultipliers> mapFromJson(dynamic json) {
    final map = <String, AgeBucketMultipliers>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AgeBucketMultipliers.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AgeBucketMultipliers-objects as value to a dart map
  static Map<String, List<AgeBucketMultipliers>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AgeBucketMultipliers>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AgeBucketMultipliers.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

