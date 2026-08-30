//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BulkCampaignDeliveryEstimatesItem {
  /// Returns a new [BulkCampaignDeliveryEstimatesItem] instance.
  BulkCampaignDeliveryEstimatesItem({
    this.adgroupAudienceSizes = const [],
    this.conversionRate,
    this.conversionRates = const [],
    this.curves = const [],
    this.derivedMetrics,
    this.errors = const [],
    this.estimateId,
    this.maxPotentialSpend,
  });

  /// Range audience sizes for each ad group, in the same order as the ad groups in the request.
  List<CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes;

  /// Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  double? conversionRate;

  /// Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.
  List<CampaignPlanningConversionRate> conversionRates;

  /// Estimated curves. Each curve will pertain to a single estimation type.
  List<CampaignPlanningCurveEstimate> curves;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CampaignDeliveryEstimatesDerivedMetrics? derivedMetrics;

  /// Errors encountered during estimation for this campaign.
  List<CampaignPlanningResponseError> errors;

  /// UUID used to track delivery estimates when they are generated as part of a saved campaign.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? estimateId;

  /// Maximum potential spend estimate.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? maxPotentialSpend;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BulkCampaignDeliveryEstimatesItem &&
    _deepEquality.equals(other.adgroupAudienceSizes, adgroupAudienceSizes) &&
    other.conversionRate == conversionRate &&
    _deepEquality.equals(other.conversionRates, conversionRates) &&
    _deepEquality.equals(other.curves, curves) &&
    other.derivedMetrics == derivedMetrics &&
    _deepEquality.equals(other.errors, errors) &&
    other.estimateId == estimateId &&
    other.maxPotentialSpend == maxPotentialSpend;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adgroupAudienceSizes.hashCode) +
    (conversionRate == null ? 0 : conversionRate!.hashCode) +
    (conversionRates.hashCode) +
    (curves.hashCode) +
    (derivedMetrics == null ? 0 : derivedMetrics!.hashCode) +
    (errors.hashCode) +
    (estimateId == null ? 0 : estimateId!.hashCode) +
    (maxPotentialSpend == null ? 0 : maxPotentialSpend!.hashCode);

  @override
  String toString() => 'BulkCampaignDeliveryEstimatesItem[adgroupAudienceSizes=$adgroupAudienceSizes, conversionRate=$conversionRate, conversionRates=$conversionRates, curves=$curves, derivedMetrics=$derivedMetrics, errors=$errors, estimateId=$estimateId, maxPotentialSpend=$maxPotentialSpend]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'adgroup_audience_sizes'] = this.adgroupAudienceSizes;
    if (this.conversionRate != null) {
      json[r'conversion_rate'] = this.conversionRate;
    } else {
      json[r'conversion_rate'] = null;
    }
      json[r'conversion_rates'] = this.conversionRates;
      json[r'curves'] = this.curves;
    if (this.derivedMetrics != null) {
      json[r'derived_metrics'] = this.derivedMetrics;
    } else {
      json[r'derived_metrics'] = null;
    }
      json[r'errors'] = this.errors;
    if (this.estimateId != null) {
      json[r'estimate_id'] = this.estimateId;
    } else {
      json[r'estimate_id'] = null;
    }
    if (this.maxPotentialSpend != null) {
      json[r'max_potential_spend'] = this.maxPotentialSpend;
    } else {
      json[r'max_potential_spend'] = null;
    }
    return json;
  }

  /// Returns a new [BulkCampaignDeliveryEstimatesItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BulkCampaignDeliveryEstimatesItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return BulkCampaignDeliveryEstimatesItem(
        adgroupAudienceSizes: CampaignPlanningAdGroupAudienceSize.listFromJson(json[r'adgroup_audience_sizes']),
        conversionRate: mapValueOfType<double>(json, r'conversion_rate'),
        conversionRates: CampaignPlanningConversionRate.listFromJson(json[r'conversion_rates']),
        curves: CampaignPlanningCurveEstimate.listFromJson(json[r'curves']),
        derivedMetrics: CampaignDeliveryEstimatesDerivedMetrics.fromJson(json[r'derived_metrics']),
        errors: CampaignPlanningResponseError.listFromJson(json[r'errors']),
        estimateId: mapValueOfType<String>(json, r'estimate_id'),
        maxPotentialSpend: mapValueOfType<int>(json, r'max_potential_spend'),
      );
    }
    return null;
  }

  static List<BulkCampaignDeliveryEstimatesItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BulkCampaignDeliveryEstimatesItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BulkCampaignDeliveryEstimatesItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BulkCampaignDeliveryEstimatesItem> mapFromJson(dynamic json) {
    final map = <String, BulkCampaignDeliveryEstimatesItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BulkCampaignDeliveryEstimatesItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BulkCampaignDeliveryEstimatesItem-objects as value to a dart map
  static Map<String, List<BulkCampaignDeliveryEstimatesItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BulkCampaignDeliveryEstimatesItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BulkCampaignDeliveryEstimatesItem.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

