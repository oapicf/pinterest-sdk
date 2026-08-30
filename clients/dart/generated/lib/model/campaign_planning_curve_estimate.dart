//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignPlanningCurveEstimate {
  /// Returns a new [CampaignPlanningCurveEstimate] instance.
  CampaignPlanningCurveEstimate({
    this.estimationType,
    this.points = const [],
  });

  /// Estimation type for campaign planning estimated curve
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CampaignPlanningEstimationType? estimationType;

  /// The estimation points that make up the estimated curve.
  List<CampaignPlanningPointEstimate> points;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignPlanningCurveEstimate &&
    other.estimationType == estimationType &&
    _deepEquality.equals(other.points, points);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (estimationType == null ? 0 : estimationType!.hashCode) +
    (points.hashCode);

  @override
  String toString() => 'CampaignPlanningCurveEstimate[estimationType=$estimationType, points=$points]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.estimationType != null) {
      json[r'estimation_type'] = this.estimationType;
    } else {
      json[r'estimation_type'] = null;
    }
      json[r'points'] = this.points;
    return json;
  }

  /// Returns a new [CampaignPlanningCurveEstimate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignPlanningCurveEstimate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return CampaignPlanningCurveEstimate(
        estimationType: CampaignPlanningEstimationType.fromJson(json[r'estimation_type']),
        points: CampaignPlanningPointEstimate.listFromJson(json[r'points']),
      );
    }
    return null;
  }

  static List<CampaignPlanningCurveEstimate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignPlanningCurveEstimate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignPlanningCurveEstimate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignPlanningCurveEstimate> mapFromJson(dynamic json) {
    final map = <String, CampaignPlanningCurveEstimate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignPlanningCurveEstimate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignPlanningCurveEstimate-objects as value to a dart map
  static Map<String, List<CampaignPlanningCurveEstimate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignPlanningCurveEstimate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignPlanningCurveEstimate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

