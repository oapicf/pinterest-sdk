//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignUpdateRequestAllOf2 {
  /// Returns a new [CampaignUpdateRequestAllOf2] instance.
  CampaignUpdateRequestAllOf2({
    this.bidOptions,
    this.intendedPromotionType,
    this.isLtvOptimized,
    this.isPerformancePlus,
    this.isTopOfSearch,
    this.objectiveType,
  });

  CampaignBidOptionsUpdate? bidOptions;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  IntendedPromotionType? intendedPromotionType;

  /// Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isLtvOptimized;

  /// Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isPerformancePlus;

  /// Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isTopOfSearch;

  ObjectiveType? objectiveType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignUpdateRequestAllOf2 &&
    other.bidOptions == bidOptions &&
    other.intendedPromotionType == intendedPromotionType &&
    other.isLtvOptimized == isLtvOptimized &&
    other.isPerformancePlus == isPerformancePlus &&
    other.isTopOfSearch == isTopOfSearch &&
    other.objectiveType == objectiveType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (bidOptions == null ? 0 : bidOptions!.hashCode) +
    (intendedPromotionType == null ? 0 : intendedPromotionType!.hashCode) +
    (isLtvOptimized == null ? 0 : isLtvOptimized!.hashCode) +
    (isPerformancePlus == null ? 0 : isPerformancePlus!.hashCode) +
    (isTopOfSearch == null ? 0 : isTopOfSearch!.hashCode) +
    (objectiveType == null ? 0 : objectiveType!.hashCode);

  @override
  String toString() => 'CampaignUpdateRequestAllOf2[bidOptions=$bidOptions, intendedPromotionType=$intendedPromotionType, isLtvOptimized=$isLtvOptimized, isPerformancePlus=$isPerformancePlus, isTopOfSearch=$isTopOfSearch, objectiveType=$objectiveType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.bidOptions != null) {
      json[r'bid_options'] = this.bidOptions;
    } else {
      json[r'bid_options'] = null;
    }
    if (this.intendedPromotionType != null) {
      json[r'intended_promotion_type'] = this.intendedPromotionType;
    } else {
      json[r'intended_promotion_type'] = null;
    }
    if (this.isLtvOptimized != null) {
      json[r'is_ltv_optimized'] = this.isLtvOptimized;
    } else {
      json[r'is_ltv_optimized'] = null;
    }
    if (this.isPerformancePlus != null) {
      json[r'is_performance_plus'] = this.isPerformancePlus;
    } else {
      json[r'is_performance_plus'] = null;
    }
    if (this.isTopOfSearch != null) {
      json[r'is_top_of_search'] = this.isTopOfSearch;
    } else {
      json[r'is_top_of_search'] = null;
    }
    if (this.objectiveType != null) {
      json[r'objective_type'] = this.objectiveType;
    } else {
      json[r'objective_type'] = null;
    }
    return json;
  }

  /// Returns a new [CampaignUpdateRequestAllOf2] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignUpdateRequestAllOf2? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return CampaignUpdateRequestAllOf2(
        bidOptions: CampaignBidOptionsUpdate.fromJson(json[r'bid_options']),
        intendedPromotionType: IntendedPromotionType.fromJson(json[r'intended_promotion_type']),
        isLtvOptimized: mapValueOfType<bool>(json, r'is_ltv_optimized'),
        isPerformancePlus: mapValueOfType<bool>(json, r'is_performance_plus'),
        isTopOfSearch: mapValueOfType<bool>(json, r'is_top_of_search'),
        objectiveType: ObjectiveType.fromJson(json[r'objective_type']),
      );
    }
    return null;
  }

  static List<CampaignUpdateRequestAllOf2> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignUpdateRequestAllOf2>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignUpdateRequestAllOf2.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignUpdateRequestAllOf2> mapFromJson(dynamic json) {
    final map = <String, CampaignUpdateRequestAllOf2>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignUpdateRequestAllOf2.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignUpdateRequestAllOf2-objects as value to a dart map
  static Map<String, List<CampaignUpdateRequestAllOf2>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignUpdateRequestAllOf2>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignUpdateRequestAllOf2.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

