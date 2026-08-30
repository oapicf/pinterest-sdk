//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignDeliveryEstimatesResponse {
  /// Returns a new [CampaignDeliveryEstimatesResponse] instance.
  CampaignDeliveryEstimatesResponse({
    this.curves = const [],
    this.derivedMetrics,
    this.maxPotentialSpend,
  });

  /// Estimated curves. Each curve will pertain to a single estimation type.
  List<CampaignPlanningCurveEstimate> curves;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CampaignDeliveryEstimatesDerivedMetrics? derivedMetrics;

  /// Maximum potential spend estimate.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? maxPotentialSpend;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignDeliveryEstimatesResponse &&
    _deepEquality.equals(other.curves, curves) &&
    other.derivedMetrics == derivedMetrics &&
    other.maxPotentialSpend == maxPotentialSpend;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (curves.hashCode) +
    (derivedMetrics == null ? 0 : derivedMetrics!.hashCode) +
    (maxPotentialSpend == null ? 0 : maxPotentialSpend!.hashCode);

  @override
  String toString() => 'CampaignDeliveryEstimatesResponse[curves=$curves, derivedMetrics=$derivedMetrics, maxPotentialSpend=$maxPotentialSpend]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'curves'] = this.curves;
    if (this.derivedMetrics != null) {
      json[r'derived_metrics'] = this.derivedMetrics;
    } else {
      json[r'derived_metrics'] = null;
    }
    if (this.maxPotentialSpend != null) {
      json[r'max_potential_spend'] = this.maxPotentialSpend;
    } else {
      json[r'max_potential_spend'] = null;
    }
    return json;
  }

  /// Returns a new [CampaignDeliveryEstimatesResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignDeliveryEstimatesResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return CampaignDeliveryEstimatesResponse(
        curves: CampaignPlanningCurveEstimate.listFromJson(json[r'curves']),
        derivedMetrics: CampaignDeliveryEstimatesDerivedMetrics.fromJson(json[r'derived_metrics']),
        maxPotentialSpend: mapValueOfType<int>(json, r'max_potential_spend'),
      );
    }
    return null;
  }

  static List<CampaignDeliveryEstimatesResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignDeliveryEstimatesResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignDeliveryEstimatesResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignDeliveryEstimatesResponse> mapFromJson(dynamic json) {
    final map = <String, CampaignDeliveryEstimatesResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignDeliveryEstimatesResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignDeliveryEstimatesResponse-objects as value to a dart map
  static Map<String, List<CampaignDeliveryEstimatesResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignDeliveryEstimatesResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignDeliveryEstimatesResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

