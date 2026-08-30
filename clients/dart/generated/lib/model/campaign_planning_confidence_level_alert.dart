//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignPlanningConfidenceLevelAlert {
  /// Returns a new [CampaignPlanningConfidenceLevelAlert] instance.
  CampaignPlanningConfidenceLevelAlert({
    this.description,
    this.reason,
    this.severity,
  });

  /// Human-readable context for debugging. Not intended for display to end users.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? description;

  /// Reason for the confidence level alert.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CampaignPlanningConfidenceLevelAlertReason? reason;

  /// Severity of the confidence level alert.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CampaignPlanningConfidenceLevelAlertSeverity? severity;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignPlanningConfidenceLevelAlert &&
    other.description == description &&
    other.reason == reason &&
    other.severity == severity;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (description == null ? 0 : description!.hashCode) +
    (reason == null ? 0 : reason!.hashCode) +
    (severity == null ? 0 : severity!.hashCode);

  @override
  String toString() => 'CampaignPlanningConfidenceLevelAlert[description=$description, reason=$reason, severity=$severity]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    if (this.reason != null) {
      json[r'reason'] = this.reason;
    } else {
      json[r'reason'] = null;
    }
    if (this.severity != null) {
      json[r'severity'] = this.severity;
    } else {
      json[r'severity'] = null;
    }
    return json;
  }

  /// Returns a new [CampaignPlanningConfidenceLevelAlert] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignPlanningConfidenceLevelAlert? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return CampaignPlanningConfidenceLevelAlert(
        description: mapValueOfType<String>(json, r'description'),
        reason: CampaignPlanningConfidenceLevelAlertReason.fromJson(json[r'reason']),
        severity: CampaignPlanningConfidenceLevelAlertSeverity.fromJson(json[r'severity']),
      );
    }
    return null;
  }

  static List<CampaignPlanningConfidenceLevelAlert> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignPlanningConfidenceLevelAlert>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignPlanningConfidenceLevelAlert.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignPlanningConfidenceLevelAlert> mapFromJson(dynamic json) {
    final map = <String, CampaignPlanningConfidenceLevelAlert>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignPlanningConfidenceLevelAlert.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignPlanningConfidenceLevelAlert-objects as value to a dart map
  static Map<String, List<CampaignPlanningConfidenceLevelAlert>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignPlanningConfidenceLevelAlert>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignPlanningConfidenceLevelAlert.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

