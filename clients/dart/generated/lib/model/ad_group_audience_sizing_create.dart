//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdGroupAudienceSizingCreate {
  /// Returns a new [AdGroupAudienceSizingCreate] instance.
  AdGroupAudienceSizingCreate({
    this.autoTargetingEnabled = true,
    this.creativeTypes = const [],
    this.keywords = const [],
    this.placementGroup = AdgroupPlacementGroupType.ALL,
    this.productGroupIds = const [],
    this.targetingSpec,
  });

  /// Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).
  bool autoTargetingEnabled;

  /// Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  List<AdGroupAudienceSizingCreativeTypes>? creativeTypes;

  /// Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
  List<AdGroupAudienceSizingKeyword>? keywords;

  /// [Placement group](/docs/redoc/#section/Placement-group).
  AdgroupPlacementGroupType placementGroup;

  /// Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
  List<String>? productGroupIds;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TargetingSpecOptimal? targetingSpec;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdGroupAudienceSizingCreate &&
    other.autoTargetingEnabled == autoTargetingEnabled &&
    _deepEquality.equals(other.creativeTypes, creativeTypes) &&
    _deepEquality.equals(other.keywords, keywords) &&
    other.placementGroup == placementGroup &&
    _deepEquality.equals(other.productGroupIds, productGroupIds) &&
    other.targetingSpec == targetingSpec;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (autoTargetingEnabled.hashCode) +
    (creativeTypes == null ? 0 : creativeTypes!.hashCode) +
    (keywords == null ? 0 : keywords!.hashCode) +
    (placementGroup.hashCode) +
    (productGroupIds == null ? 0 : productGroupIds!.hashCode) +
    (targetingSpec == null ? 0 : targetingSpec!.hashCode);

  @override
  String toString() => 'AdGroupAudienceSizingCreate[autoTargetingEnabled=$autoTargetingEnabled, creativeTypes=$creativeTypes, keywords=$keywords, placementGroup=$placementGroup, productGroupIds=$productGroupIds, targetingSpec=$targetingSpec]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'auto_targeting_enabled'] = this.autoTargetingEnabled;
    if (this.creativeTypes != null) {
      json[r'creative_types'] = this.creativeTypes;
    } else {
      json[r'creative_types'] = null;
    }
    if (this.keywords != null) {
      json[r'keywords'] = this.keywords;
    } else {
      json[r'keywords'] = null;
    }
      json[r'placement_group'] = this.placementGroup;
    if (this.productGroupIds != null) {
      json[r'product_group_ids'] = this.productGroupIds;
    } else {
      json[r'product_group_ids'] = null;
    }
    if (this.targetingSpec != null) {
      json[r'targeting_spec'] = this.targetingSpec;
    } else {
      json[r'targeting_spec'] = null;
    }
    return json;
  }

  /// Returns a new [AdGroupAudienceSizingCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdGroupAudienceSizingCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return AdGroupAudienceSizingCreate(
        autoTargetingEnabled: mapValueOfType<bool>(json, r'auto_targeting_enabled') ?? true,
        creativeTypes: AdGroupAudienceSizingCreativeTypes.listFromJson(json[r'creative_types']),
        keywords: AdGroupAudienceSizingKeyword.listFromJson(json[r'keywords']),
        placementGroup: AdgroupPlacementGroupType.fromJson(json[r'placement_group']) ?? AdgroupPlacementGroupType.ALL,
        productGroupIds: json[r'product_group_ids'] is Iterable
            ? (json[r'product_group_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        targetingSpec: TargetingSpecOptimal.fromJson(json[r'targeting_spec']),
      );
    }
    return null;
  }

  static List<AdGroupAudienceSizingCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdGroupAudienceSizingCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdGroupAudienceSizingCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdGroupAudienceSizingCreate> mapFromJson(dynamic json) {
    final map = <String, AdGroupAudienceSizingCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdGroupAudienceSizingCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdGroupAudienceSizingCreate-objects as value to a dart map
  static Map<String, List<AdGroupAudienceSizingCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdGroupAudienceSizingCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdGroupAudienceSizingCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

