//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class NullableOptimizationGoalMetadata {
  /// Returns a new [NullableOptimizationGoalMetadata] instance.
  NullableOptimizationGoalMetadata({
    this.conversionTagV3GoalMetadata,
    this.frequencyGoalMetadata,
    this.scrollupGoalMetadata,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConversionTagV3GoalMetadata? conversionTagV3GoalMetadata;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FrequencyGoalMetadata? frequencyGoalMetadata;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ScrollupGoalMetadata? scrollupGoalMetadata;

  @override
  bool operator ==(Object other) => identical(this, other) || other is NullableOptimizationGoalMetadata &&
    other.conversionTagV3GoalMetadata == conversionTagV3GoalMetadata &&
    other.frequencyGoalMetadata == frequencyGoalMetadata &&
    other.scrollupGoalMetadata == scrollupGoalMetadata;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (conversionTagV3GoalMetadata == null ? 0 : conversionTagV3GoalMetadata!.hashCode) +
    (frequencyGoalMetadata == null ? 0 : frequencyGoalMetadata!.hashCode) +
    (scrollupGoalMetadata == null ? 0 : scrollupGoalMetadata!.hashCode);

  @override
  String toString() => 'NullableOptimizationGoalMetadata[conversionTagV3GoalMetadata=$conversionTagV3GoalMetadata, frequencyGoalMetadata=$frequencyGoalMetadata, scrollupGoalMetadata=$scrollupGoalMetadata]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.conversionTagV3GoalMetadata != null) {
      json[r'conversion_tag_v3_goal_metadata'] = this.conversionTagV3GoalMetadata;
    } else {
      json[r'conversion_tag_v3_goal_metadata'] = null;
    }
    if (this.frequencyGoalMetadata != null) {
      json[r'frequency_goal_metadata'] = this.frequencyGoalMetadata;
    } else {
      json[r'frequency_goal_metadata'] = null;
    }
    if (this.scrollupGoalMetadata != null) {
      json[r'scrollup_goal_metadata'] = this.scrollupGoalMetadata;
    } else {
      json[r'scrollup_goal_metadata'] = null;
    }
    return json;
  }

  /// Returns a new [NullableOptimizationGoalMetadata] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static NullableOptimizationGoalMetadata? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return NullableOptimizationGoalMetadata(
        conversionTagV3GoalMetadata: ConversionTagV3GoalMetadata.fromJson(json[r'conversion_tag_v3_goal_metadata']),
        frequencyGoalMetadata: FrequencyGoalMetadata.fromJson(json[r'frequency_goal_metadata']),
        scrollupGoalMetadata: ScrollupGoalMetadata.fromJson(json[r'scrollup_goal_metadata']),
      );
    }
    return null;
  }

  static List<NullableOptimizationGoalMetadata> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <NullableOptimizationGoalMetadata>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = NullableOptimizationGoalMetadata.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, NullableOptimizationGoalMetadata> mapFromJson(dynamic json) {
    final map = <String, NullableOptimizationGoalMetadata>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = NullableOptimizationGoalMetadata.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of NullableOptimizationGoalMetadata-objects as value to a dart map
  static Map<String, List<NullableOptimizationGoalMetadata>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<NullableOptimizationGoalMetadata>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = NullableOptimizationGoalMetadata.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

