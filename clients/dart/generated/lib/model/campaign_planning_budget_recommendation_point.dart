//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignPlanningBudgetRecommendationPoint {
  /// Returns a new [CampaignPlanningBudgetRecommendationPoint] instance.
  CampaignPlanningBudgetRecommendationPoint({
    this.estimationType,
    this.pointEstimate,
  });

  /// Estimation type for this point.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CampaignPlanningEstimationType? estimationType;

  /// Point estimate data.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CampaignPlanningPointEstimate? pointEstimate;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignPlanningBudgetRecommendationPoint &&
    other.estimationType == estimationType &&
    other.pointEstimate == pointEstimate;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (estimationType == null ? 0 : estimationType!.hashCode) +
    (pointEstimate == null ? 0 : pointEstimate!.hashCode);

  @override
  String toString() => 'CampaignPlanningBudgetRecommendationPoint[estimationType=$estimationType, pointEstimate=$pointEstimate]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.estimationType != null) {
      json[r'estimation_type'] = this.estimationType;
    } else {
      json[r'estimation_type'] = null;
    }
    if (this.pointEstimate != null) {
      json[r'point_estimate'] = this.pointEstimate;
    } else {
      json[r'point_estimate'] = null;
    }
    return json;
  }

  /// Returns a new [CampaignPlanningBudgetRecommendationPoint] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignPlanningBudgetRecommendationPoint? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return CampaignPlanningBudgetRecommendationPoint(
        estimationType: CampaignPlanningEstimationType.fromJson(json[r'estimation_type']),
        pointEstimate: CampaignPlanningPointEstimate.fromJson(json[r'point_estimate']),
      );
    }
    return null;
  }

  static List<CampaignPlanningBudgetRecommendationPoint> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignPlanningBudgetRecommendationPoint>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignPlanningBudgetRecommendationPoint.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignPlanningBudgetRecommendationPoint> mapFromJson(dynamic json) {
    final map = <String, CampaignPlanningBudgetRecommendationPoint>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignPlanningBudgetRecommendationPoint.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignPlanningBudgetRecommendationPoint-objects as value to a dart map
  static Map<String, List<CampaignPlanningBudgetRecommendationPoint>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignPlanningBudgetRecommendationPoint>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignPlanningBudgetRecommendationPoint.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

