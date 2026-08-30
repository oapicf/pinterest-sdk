//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignPlanningExperimentBudgetRecommendation {
  /// Returns a new [CampaignPlanningExperimentBudgetRecommendation] instance.
  CampaignPlanningExperimentBudgetRecommendation({
    this.budgetRecommendation,
    this.lifetimeDaysRecommendation,
    this.pointEstimations = const [],
    this.versionId,
  });

  /// Recommended budget for this experiment version.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? budgetRecommendation;

  /// Recommended lifetime days for this experiment.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? lifetimeDaysRecommendation;

  /// Point estimations for this experiment version.
  List<CampaignPlanningBudgetRecommendationPoint> pointEstimations;

  /// Version identifier for the experiment.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? versionId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignPlanningExperimentBudgetRecommendation &&
    other.budgetRecommendation == budgetRecommendation &&
    other.lifetimeDaysRecommendation == lifetimeDaysRecommendation &&
    _deepEquality.equals(other.pointEstimations, pointEstimations) &&
    other.versionId == versionId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (budgetRecommendation == null ? 0 : budgetRecommendation!.hashCode) +
    (lifetimeDaysRecommendation == null ? 0 : lifetimeDaysRecommendation!.hashCode) +
    (pointEstimations.hashCode) +
    (versionId == null ? 0 : versionId!.hashCode);

  @override
  String toString() => 'CampaignPlanningExperimentBudgetRecommendation[budgetRecommendation=$budgetRecommendation, lifetimeDaysRecommendation=$lifetimeDaysRecommendation, pointEstimations=$pointEstimations, versionId=$versionId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.budgetRecommendation != null) {
      json[r'budget_recommendation'] = this.budgetRecommendation;
    } else {
      json[r'budget_recommendation'] = null;
    }
    if (this.lifetimeDaysRecommendation != null) {
      json[r'lifetime_days_recommendation'] = this.lifetimeDaysRecommendation;
    } else {
      json[r'lifetime_days_recommendation'] = null;
    }
      json[r'point_estimations'] = this.pointEstimations;
    if (this.versionId != null) {
      json[r'version_id'] = this.versionId;
    } else {
      json[r'version_id'] = null;
    }
    return json;
  }

  /// Returns a new [CampaignPlanningExperimentBudgetRecommendation] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignPlanningExperimentBudgetRecommendation? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return CampaignPlanningExperimentBudgetRecommendation(
        budgetRecommendation: mapValueOfType<int>(json, r'budget_recommendation'),
        lifetimeDaysRecommendation: mapValueOfType<int>(json, r'lifetime_days_recommendation'),
        pointEstimations: CampaignPlanningBudgetRecommendationPoint.listFromJson(json[r'point_estimations']),
        versionId: mapValueOfType<String>(json, r'version_id'),
      );
    }
    return null;
  }

  static List<CampaignPlanningExperimentBudgetRecommendation> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignPlanningExperimentBudgetRecommendation>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignPlanningExperimentBudgetRecommendation.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignPlanningExperimentBudgetRecommendation> mapFromJson(dynamic json) {
    final map = <String, CampaignPlanningExperimentBudgetRecommendation>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignPlanningExperimentBudgetRecommendation.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignPlanningExperimentBudgetRecommendation-objects as value to a dart map
  static Map<String, List<CampaignPlanningExperimentBudgetRecommendation>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignPlanningExperimentBudgetRecommendation>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignPlanningExperimentBudgetRecommendation.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

