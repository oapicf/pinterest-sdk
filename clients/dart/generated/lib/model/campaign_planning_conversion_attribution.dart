//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignPlanningConversionAttribution {
  /// Returns a new [CampaignPlanningConversionAttribution] instance.
  CampaignPlanningConversionAttribution({
    this.clickWindowDays,
    this.engagementWindowDays,
    this.viewWindowDays,
  });

  /// Number of days to use as the conversion attribution window for a pin click action.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CampaignPlanningConversionAttributionWindowDays? clickWindowDays;

  /// Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CampaignPlanningConversionAttributionWindowDays? engagementWindowDays;

  /// Number of days to use as the conversion attribution window for a view action.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CampaignPlanningConversionAttributionWindowDays? viewWindowDays;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignPlanningConversionAttribution &&
    other.clickWindowDays == clickWindowDays &&
    other.engagementWindowDays == engagementWindowDays &&
    other.viewWindowDays == viewWindowDays;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (clickWindowDays == null ? 0 : clickWindowDays!.hashCode) +
    (engagementWindowDays == null ? 0 : engagementWindowDays!.hashCode) +
    (viewWindowDays == null ? 0 : viewWindowDays!.hashCode);

  @override
  String toString() => 'CampaignPlanningConversionAttribution[clickWindowDays=$clickWindowDays, engagementWindowDays=$engagementWindowDays, viewWindowDays=$viewWindowDays]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.clickWindowDays != null) {
      json[r'click_window_days'] = this.clickWindowDays;
    } else {
      json[r'click_window_days'] = null;
    }
    if (this.engagementWindowDays != null) {
      json[r'engagement_window_days'] = this.engagementWindowDays;
    } else {
      json[r'engagement_window_days'] = null;
    }
    if (this.viewWindowDays != null) {
      json[r'view_window_days'] = this.viewWindowDays;
    } else {
      json[r'view_window_days'] = null;
    }
    return json;
  }

  /// Returns a new [CampaignPlanningConversionAttribution] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignPlanningConversionAttribution? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return CampaignPlanningConversionAttribution(
        clickWindowDays: CampaignPlanningConversionAttributionWindowDays.fromJson(json[r'click_window_days']),
        engagementWindowDays: CampaignPlanningConversionAttributionWindowDays.fromJson(json[r'engagement_window_days']),
        viewWindowDays: CampaignPlanningConversionAttributionWindowDays.fromJson(json[r'view_window_days']),
      );
    }
    return null;
  }

  static List<CampaignPlanningConversionAttribution> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignPlanningConversionAttribution>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignPlanningConversionAttribution.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignPlanningConversionAttribution> mapFromJson(dynamic json) {
    final map = <String, CampaignPlanningConversionAttribution>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignPlanningConversionAttribution.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignPlanningConversionAttribution-objects as value to a dart map
  static Map<String, List<CampaignPlanningConversionAttribution>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignPlanningConversionAttribution>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignPlanningConversionAttribution.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

