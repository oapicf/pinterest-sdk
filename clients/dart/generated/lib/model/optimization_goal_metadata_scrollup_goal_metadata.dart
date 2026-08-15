//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OptimizationGoalMetadataScrollupGoalMetadata {
  /// Returns a new [OptimizationGoalMetadataScrollupGoalMetadata] instance.
  OptimizationGoalMetadataScrollupGoalMetadata({
    this.scrollupGoalValueInMicroCurrency,
  });

  String? scrollupGoalValueInMicroCurrency;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OptimizationGoalMetadataScrollupGoalMetadata &&
    other.scrollupGoalValueInMicroCurrency == scrollupGoalValueInMicroCurrency;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (scrollupGoalValueInMicroCurrency == null ? 0 : scrollupGoalValueInMicroCurrency!.hashCode);

  @override
  String toString() => 'OptimizationGoalMetadataScrollupGoalMetadata[scrollupGoalValueInMicroCurrency=$scrollupGoalValueInMicroCurrency]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.scrollupGoalValueInMicroCurrency != null) {
      json[r'scrollup_goal_value_in_micro_currency'] = this.scrollupGoalValueInMicroCurrency;
    } else {
      json[r'scrollup_goal_value_in_micro_currency'] = null;
    }
    return json;
  }

  /// Returns a new [OptimizationGoalMetadataScrollupGoalMetadata] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OptimizationGoalMetadataScrollupGoalMetadata? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OptimizationGoalMetadataScrollupGoalMetadata[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OptimizationGoalMetadataScrollupGoalMetadata[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OptimizationGoalMetadataScrollupGoalMetadata(
        scrollupGoalValueInMicroCurrency: mapValueOfType<String>(json, r'scrollup_goal_value_in_micro_currency'),
      );
    }
    return null;
  }

  static List<OptimizationGoalMetadataScrollupGoalMetadata> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OptimizationGoalMetadataScrollupGoalMetadata>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OptimizationGoalMetadataScrollupGoalMetadata.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OptimizationGoalMetadataScrollupGoalMetadata> mapFromJson(dynamic json) {
    final map = <String, OptimizationGoalMetadataScrollupGoalMetadata>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OptimizationGoalMetadataScrollupGoalMetadata.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OptimizationGoalMetadataScrollupGoalMetadata-objects as value to a dart map
  static Map<String, List<OptimizationGoalMetadataScrollupGoalMetadata>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OptimizationGoalMetadataScrollupGoalMetadata>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OptimizationGoalMetadataScrollupGoalMetadata.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

