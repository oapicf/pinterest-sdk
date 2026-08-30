//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignPlanningBudgetRecommendation {
  /// Returns a new [CampaignPlanningBudgetRecommendation] instance.
  CampaignPlanningBudgetRecommendation({
    this.budgetRecommendation,
    this.experimentCampaignBudgetRecommendation = const [],
    this.lifetimeDaysRecommendation,
    this.pointEstimations = const [],
  });

  /// The recommended budget amount.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? budgetRecommendation;

  /// List of experimental budget recommendations.
  List<CampaignPlanningExperimentBudgetRecommendation> experimentCampaignBudgetRecommendation;

  /// Recommended number of days for the campaign lifetime.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? lifetimeDaysRecommendation;

  /// List of point estimations for different budget scenarios.
  List<CampaignPlanningBudgetRecommendationPoint> pointEstimations;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignPlanningBudgetRecommendation &&
    other.budgetRecommendation == budgetRecommendation &&
    _deepEquality.equals(other.experimentCampaignBudgetRecommendation, experimentCampaignBudgetRecommendation) &&
    other.lifetimeDaysRecommendation == lifetimeDaysRecommendation &&
    _deepEquality.equals(other.pointEstimations, pointEstimations);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (budgetRecommendation == null ? 0 : budgetRecommendation!.hashCode) +
    (experimentCampaignBudgetRecommendation.hashCode) +
    (lifetimeDaysRecommendation == null ? 0 : lifetimeDaysRecommendation!.hashCode) +
    (pointEstimations.hashCode);

  @override
  String toString() => 'CampaignPlanningBudgetRecommendation[budgetRecommendation=$budgetRecommendation, experimentCampaignBudgetRecommendation=$experimentCampaignBudgetRecommendation, lifetimeDaysRecommendation=$lifetimeDaysRecommendation, pointEstimations=$pointEstimations]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.budgetRecommendation != null) {
      json[r'budget_recommendation'] = this.budgetRecommendation;
    } else {
      json[r'budget_recommendation'] = null;
    }
      json[r'experiment_campaign_budget_recommendation'] = this.experimentCampaignBudgetRecommendation;
    if (this.lifetimeDaysRecommendation != null) {
      json[r'lifetime_days_recommendation'] = this.lifetimeDaysRecommendation;
    } else {
      json[r'lifetime_days_recommendation'] = null;
    }
      json[r'point_estimations'] = this.pointEstimations;
    return json;
  }

  /// Returns a new [CampaignPlanningBudgetRecommendation] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignPlanningBudgetRecommendation? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return CampaignPlanningBudgetRecommendation(
        budgetRecommendation: mapValueOfType<int>(json, r'budget_recommendation'),
        experimentCampaignBudgetRecommendation: CampaignPlanningExperimentBudgetRecommendation.listFromJson(json[r'experiment_campaign_budget_recommendation']),
        lifetimeDaysRecommendation: mapValueOfType<int>(json, r'lifetime_days_recommendation'),
        pointEstimations: CampaignPlanningBudgetRecommendationPoint.listFromJson(json[r'point_estimations']),
      );
    }
    return null;
  }

  static List<CampaignPlanningBudgetRecommendation> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignPlanningBudgetRecommendation>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignPlanningBudgetRecommendation.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignPlanningBudgetRecommendation> mapFromJson(dynamic json) {
    final map = <String, CampaignPlanningBudgetRecommendation>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignPlanningBudgetRecommendation.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignPlanningBudgetRecommendation-objects as value to a dart map
  static Map<String, List<CampaignPlanningBudgetRecommendation>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignPlanningBudgetRecommendation>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignPlanningBudgetRecommendation.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

