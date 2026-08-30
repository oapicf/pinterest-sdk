//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdGroupDeliveryEstimates {
  /// Returns a new [AdGroupDeliveryEstimates] instance.
  AdGroupDeliveryEstimates({
    this.autoTargetingEnabled,
    this.creativeTypes = const [],
    this.keywords = const [],
    this.monthlyFrequencyCap,
    this.optimizationGoalMetadata,
    this.optimizationType,
    this.placementGroup,
    this.productGroupIds = const [],
    this.targetingSpec,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? autoTargetingEnabled;

  /// Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  List<AdGroupAudienceSizingCreativeTypes> creativeTypes;

  /// Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
  List<AdGroupDeliveryEstimatesKeywordsItems>? keywords;

  /// Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.
  ///
  /// Minimum value: 0
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? monthlyFrequencyCap;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OptimizationGoalMetadata? optimizationGoalMetadata;

  /// Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OptimizationType? optimizationType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PlacementGroupType? placementGroup;

  /// [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.
  List<String> productGroupIds;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TargetingSpecOptimal? targetingSpec;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdGroupDeliveryEstimates &&
    other.autoTargetingEnabled == autoTargetingEnabled &&
    _deepEquality.equals(other.creativeTypes, creativeTypes) &&
    _deepEquality.equals(other.keywords, keywords) &&
    other.monthlyFrequencyCap == monthlyFrequencyCap &&
    other.optimizationGoalMetadata == optimizationGoalMetadata &&
    other.optimizationType == optimizationType &&
    other.placementGroup == placementGroup &&
    _deepEquality.equals(other.productGroupIds, productGroupIds) &&
    other.targetingSpec == targetingSpec;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (autoTargetingEnabled == null ? 0 : autoTargetingEnabled!.hashCode) +
    (creativeTypes.hashCode) +
    (keywords == null ? 0 : keywords!.hashCode) +
    (monthlyFrequencyCap == null ? 0 : monthlyFrequencyCap!.hashCode) +
    (optimizationGoalMetadata == null ? 0 : optimizationGoalMetadata!.hashCode) +
    (optimizationType == null ? 0 : optimizationType!.hashCode) +
    (placementGroup == null ? 0 : placementGroup!.hashCode) +
    (productGroupIds.hashCode) +
    (targetingSpec == null ? 0 : targetingSpec!.hashCode);

  @override
  String toString() => 'AdGroupDeliveryEstimates[autoTargetingEnabled=$autoTargetingEnabled, creativeTypes=$creativeTypes, keywords=$keywords, monthlyFrequencyCap=$monthlyFrequencyCap, optimizationGoalMetadata=$optimizationGoalMetadata, optimizationType=$optimizationType, placementGroup=$placementGroup, productGroupIds=$productGroupIds, targetingSpec=$targetingSpec]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.autoTargetingEnabled != null) {
      json[r'auto_targeting_enabled'] = this.autoTargetingEnabled;
    } else {
      json[r'auto_targeting_enabled'] = null;
    }
      json[r'creative_types'] = this.creativeTypes;
    if (this.keywords != null) {
      json[r'keywords'] = this.keywords;
    } else {
      json[r'keywords'] = null;
    }
    if (this.monthlyFrequencyCap != null) {
      json[r'monthly_frequency_cap'] = this.monthlyFrequencyCap;
    } else {
      json[r'monthly_frequency_cap'] = null;
    }
    if (this.optimizationGoalMetadata != null) {
      json[r'optimization_goal_metadata'] = this.optimizationGoalMetadata;
    } else {
      json[r'optimization_goal_metadata'] = null;
    }
    if (this.optimizationType != null) {
      json[r'optimization_type'] = this.optimizationType;
    } else {
      json[r'optimization_type'] = null;
    }
    if (this.placementGroup != null) {
      json[r'placement_group'] = this.placementGroup;
    } else {
      json[r'placement_group'] = null;
    }
      json[r'product_group_ids'] = this.productGroupIds;
    if (this.targetingSpec != null) {
      json[r'targeting_spec'] = this.targetingSpec;
    } else {
      json[r'targeting_spec'] = null;
    }
    return json;
  }

  /// Returns a new [AdGroupDeliveryEstimates] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdGroupDeliveryEstimates? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return AdGroupDeliveryEstimates(
        autoTargetingEnabled: mapValueOfType<bool>(json, r'auto_targeting_enabled'),
        creativeTypes: AdGroupAudienceSizingCreativeTypes.listFromJson(json[r'creative_types']),
        keywords: AdGroupDeliveryEstimatesKeywordsItems.listFromJson(json[r'keywords']),
        monthlyFrequencyCap: mapValueOfType<int>(json, r'monthly_frequency_cap'),
        optimizationGoalMetadata: OptimizationGoalMetadata.fromJson(json[r'optimization_goal_metadata']),
        optimizationType: OptimizationType.fromJson(json[r'optimization_type']),
        placementGroup: PlacementGroupType.fromJson(json[r'placement_group']),
        productGroupIds: json[r'product_group_ids'] is Iterable
            ? (json[r'product_group_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        targetingSpec: TargetingSpecOptimal.fromJson(json[r'targeting_spec']),
      );
    }
    return null;
  }

  static List<AdGroupDeliveryEstimates> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdGroupDeliveryEstimates>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdGroupDeliveryEstimates.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdGroupDeliveryEstimates> mapFromJson(dynamic json) {
    final map = <String, AdGroupDeliveryEstimates>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdGroupDeliveryEstimates.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdGroupDeliveryEstimates-objects as value to a dart map
  static Map<String, List<AdGroupDeliveryEstimates>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdGroupDeliveryEstimates>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdGroupDeliveryEstimates.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

