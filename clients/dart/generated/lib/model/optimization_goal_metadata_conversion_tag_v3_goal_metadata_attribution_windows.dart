//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows {
  /// Returns a new [OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows] instance.
  OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows({
    this.clickWindowDays,
    this.engagementWindowDays,
    this.viewWindowDays,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? clickWindowDays;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? engagementWindowDays;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? viewWindowDays;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows &&
    other.clickWindowDays == clickWindowDays &&
    other.engagementWindowDays == engagementWindowDays &&
    other.viewWindowDays == viewWindowDays;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (clickWindowDays == null ? 0 : clickWindowDays!.hashCode) +
    (engagementWindowDays == null ? 0 : engagementWindowDays!.hashCode) +
    (viewWindowDays == null ? 0 : viewWindowDays!.hashCode);

  @override
  String toString() => 'OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows[clickWindowDays=$clickWindowDays, engagementWindowDays=$engagementWindowDays, viewWindowDays=$viewWindowDays]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.clickWindowDays != null) {
      json[r'click_window_days'] = this.clickWindowDays;
    } else {
      json[r'click_window_days'] = null;
    }
    if (this.engagementWindowDays != null) {
      json[r'engagement_window_days'] = this.engagementWindowDays;
    } else {
      json[r'engagement_window_days'] = null;
    }
    if (this.viewWindowDays != null) {
      json[r'view_window_days'] = this.viewWindowDays;
    } else {
      json[r'view_window_days'] = null;
    }
    return json;
  }

  /// Returns a new [OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows(
        clickWindowDays: mapValueOfType<int>(json, r'click_window_days'),
        engagementWindowDays: mapValueOfType<int>(json, r'engagement_window_days'),
        viewWindowDays: mapValueOfType<int>(json, r'view_window_days'),
      );
    }
    return null;
  }

  static List<OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows> mapFromJson(dynamic json) {
    final map = <String, OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows-objects as value to a dart map
  static Map<String, List<OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

