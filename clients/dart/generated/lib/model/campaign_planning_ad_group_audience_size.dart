//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignPlanningAdGroupAudienceSize {
  /// Returns a new [CampaignPlanningAdGroupAudienceSize] instance.
  CampaignPlanningAdGroupAudienceSize({
    this.countLower,
    this.countUpper,
  });

  /// Lower bound of the audience size estimate.
  ///
  /// Minimum value: 0
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? countLower;

  /// Upper bound of the audience size estimate.
  ///
  /// Minimum value: 0
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? countUpper;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignPlanningAdGroupAudienceSize &&
    other.countLower == countLower &&
    other.countUpper == countUpper;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (countLower == null ? 0 : countLower!.hashCode) +
    (countUpper == null ? 0 : countUpper!.hashCode);

  @override
  String toString() => 'CampaignPlanningAdGroupAudienceSize[countLower=$countLower, countUpper=$countUpper]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.countLower != null) {
      json[r'count_lower'] = this.countLower;
    } else {
      json[r'count_lower'] = null;
    }
    if (this.countUpper != null) {
      json[r'count_upper'] = this.countUpper;
    } else {
      json[r'count_upper'] = null;
    }
    return json;
  }

  /// Returns a new [CampaignPlanningAdGroupAudienceSize] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignPlanningAdGroupAudienceSize? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return CampaignPlanningAdGroupAudienceSize(
        countLower: mapValueOfType<int>(json, r'count_lower'),
        countUpper: mapValueOfType<int>(json, r'count_upper'),
      );
    }
    return null;
  }

  static List<CampaignPlanningAdGroupAudienceSize> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignPlanningAdGroupAudienceSize>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignPlanningAdGroupAudienceSize.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignPlanningAdGroupAudienceSize> mapFromJson(dynamic json) {
    final map = <String, CampaignPlanningAdGroupAudienceSize>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignPlanningAdGroupAudienceSize.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignPlanningAdGroupAudienceSize-objects as value to a dart map
  static Map<String, List<CampaignPlanningAdGroupAudienceSize>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignPlanningAdGroupAudienceSize>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignPlanningAdGroupAudienceSize.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

