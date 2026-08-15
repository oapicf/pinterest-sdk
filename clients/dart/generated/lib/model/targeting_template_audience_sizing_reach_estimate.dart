//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TargetingTemplateAudienceSizingReachEstimate {
  /// Returns a new [TargetingTemplateAudienceSizingReachEstimate] instance.
  TargetingTemplateAudienceSizingReachEstimate({
    this.estimate,
    this.lowerBound,
    this.upperBound,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? estimate;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? lowerBound;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? upperBound;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TargetingTemplateAudienceSizingReachEstimate &&
    other.estimate == estimate &&
    other.lowerBound == lowerBound &&
    other.upperBound == upperBound;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (estimate == null ? 0 : estimate!.hashCode) +
    (lowerBound == null ? 0 : lowerBound!.hashCode) +
    (upperBound == null ? 0 : upperBound!.hashCode);

  @override
  String toString() => 'TargetingTemplateAudienceSizingReachEstimate[estimate=$estimate, lowerBound=$lowerBound, upperBound=$upperBound]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.estimate != null) {
      json[r'estimate'] = this.estimate;
    } else {
      json[r'estimate'] = null;
    }
    if (this.lowerBound != null) {
      json[r'lower_bound'] = this.lowerBound;
    } else {
      json[r'lower_bound'] = null;
    }
    if (this.upperBound != null) {
      json[r'upper_bound'] = this.upperBound;
    } else {
      json[r'upper_bound'] = null;
    }
    return json;
  }

  /// Returns a new [TargetingTemplateAudienceSizingReachEstimate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TargetingTemplateAudienceSizingReachEstimate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TargetingTemplateAudienceSizingReachEstimate[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TargetingTemplateAudienceSizingReachEstimate[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TargetingTemplateAudienceSizingReachEstimate(
        estimate: mapValueOfType<int>(json, r'estimate'),
        lowerBound: mapValueOfType<int>(json, r'lower_bound'),
        upperBound: mapValueOfType<int>(json, r'upper_bound'),
      );
    }
    return null;
  }

  static List<TargetingTemplateAudienceSizingReachEstimate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingTemplateAudienceSizingReachEstimate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingTemplateAudienceSizingReachEstimate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TargetingTemplateAudienceSizingReachEstimate> mapFromJson(dynamic json) {
    final map = <String, TargetingTemplateAudienceSizingReachEstimate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TargetingTemplateAudienceSizingReachEstimate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TargetingTemplateAudienceSizingReachEstimate-objects as value to a dart map
  static Map<String, List<TargetingTemplateAudienceSizingReachEstimate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TargetingTemplateAudienceSizingReachEstimate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TargetingTemplateAudienceSizingReachEstimate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

