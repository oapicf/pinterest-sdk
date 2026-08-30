//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignDeliveryEstimatesCampaign {
  /// Returns a new [CampaignDeliveryEstimatesCampaign] instance.
  CampaignDeliveryEstimatesCampaign({
    this.adGroups = const [],
    required this.budgetDurationType,
    this.dailySpendCap,
    this.endDate,
    this.lifetimeSpendCap,
    required this.objectiveType,
    required this.startDate,
  });

  List<AdGroupDeliveryEstimates> adGroups;

  /// Duration type of the budget
  BudgetDurationType budgetDurationType;

  /// Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? dailySpendCap;

  /// End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? endDate;

  /// Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? lifetimeSpendCap;

  DeliveryEstimateObjectiveType objectiveType;

  /// Start date of the date range for an ad campaign, pattern YYYY-MM-DD.
  String startDate;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignDeliveryEstimatesCampaign &&
    _deepEquality.equals(other.adGroups, adGroups) &&
    other.budgetDurationType == budgetDurationType &&
    other.dailySpendCap == dailySpendCap &&
    other.endDate == endDate &&
    other.lifetimeSpendCap == lifetimeSpendCap &&
    other.objectiveType == objectiveType &&
    other.startDate == startDate;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adGroups.hashCode) +
    (budgetDurationType.hashCode) +
    (dailySpendCap == null ? 0 : dailySpendCap!.hashCode) +
    (endDate == null ? 0 : endDate!.hashCode) +
    (lifetimeSpendCap == null ? 0 : lifetimeSpendCap!.hashCode) +
    (objectiveType.hashCode) +
    (startDate.hashCode);

  @override
  String toString() => 'CampaignDeliveryEstimatesCampaign[adGroups=$adGroups, budgetDurationType=$budgetDurationType, dailySpendCap=$dailySpendCap, endDate=$endDate, lifetimeSpendCap=$lifetimeSpendCap, objectiveType=$objectiveType, startDate=$startDate]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ad_groups'] = this.adGroups;
      json[r'budget_duration_type'] = this.budgetDurationType;
    if (this.dailySpendCap != null) {
      json[r'daily_spend_cap'] = this.dailySpendCap;
    } else {
      json[r'daily_spend_cap'] = null;
    }
    if (this.endDate != null) {
      json[r'end_date'] = this.endDate;
    } else {
      json[r'end_date'] = null;
    }
    if (this.lifetimeSpendCap != null) {
      json[r'lifetime_spend_cap'] = this.lifetimeSpendCap;
    } else {
      json[r'lifetime_spend_cap'] = null;
    }
      json[r'objective_type'] = this.objectiveType;
      json[r'start_date'] = this.startDate;
    return json;
  }

  /// Returns a new [CampaignDeliveryEstimatesCampaign] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignDeliveryEstimatesCampaign? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'ad_groups'), 'Required key "CampaignDeliveryEstimatesCampaign[ad_groups]" is missing from JSON.');
        assert(json[r'ad_groups'] != null, 'Required key "CampaignDeliveryEstimatesCampaign[ad_groups]" has a null value in JSON.');
        assert(json.containsKey(r'budget_duration_type'), 'Required key "CampaignDeliveryEstimatesCampaign[budget_duration_type]" is missing from JSON.');
        assert(json[r'budget_duration_type'] != null, 'Required key "CampaignDeliveryEstimatesCampaign[budget_duration_type]" has a null value in JSON.');
        assert(json.containsKey(r'objective_type'), 'Required key "CampaignDeliveryEstimatesCampaign[objective_type]" is missing from JSON.');
        assert(json[r'objective_type'] != null, 'Required key "CampaignDeliveryEstimatesCampaign[objective_type]" has a null value in JSON.');
        assert(json.containsKey(r'start_date'), 'Required key "CampaignDeliveryEstimatesCampaign[start_date]" is missing from JSON.');
        assert(json[r'start_date'] != null, 'Required key "CampaignDeliveryEstimatesCampaign[start_date]" has a null value in JSON.');
        return true;
      }());

      return CampaignDeliveryEstimatesCampaign(
        adGroups: AdGroupDeliveryEstimates.listFromJson(json[r'ad_groups']),
        budgetDurationType: BudgetDurationType.fromJson(json[r'budget_duration_type'])!,
        dailySpendCap: mapValueOfType<int>(json, r'daily_spend_cap'),
        endDate: mapValueOfType<String>(json, r'end_date'),
        lifetimeSpendCap: mapValueOfType<int>(json, r'lifetime_spend_cap'),
        objectiveType: DeliveryEstimateObjectiveType.fromJson(json[r'objective_type'])!,
        startDate: mapValueOfType<String>(json, r'start_date')!,
      );
    }
    return null;
  }

  static List<CampaignDeliveryEstimatesCampaign> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignDeliveryEstimatesCampaign>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignDeliveryEstimatesCampaign.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignDeliveryEstimatesCampaign> mapFromJson(dynamic json) {
    final map = <String, CampaignDeliveryEstimatesCampaign>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignDeliveryEstimatesCampaign.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignDeliveryEstimatesCampaign-objects as value to a dart map
  static Map<String, List<CampaignDeliveryEstimatesCampaign>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignDeliveryEstimatesCampaign>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignDeliveryEstimatesCampaign.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'ad_groups',
    'budget_duration_type',
    'objective_type',
    'start_date',
  };
}

