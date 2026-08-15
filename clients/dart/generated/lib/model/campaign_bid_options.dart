//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignBidOptions {
  /// Returns a new [CampaignBidOptions] instance.
  CampaignBidOptions({
    this.appTypeMultipliers,
    this.audienceMultipliers,
    this.placementMultipliers,
  });

  AppTypeMultipliers? appTypeMultipliers;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CampaignAudienceMultipliers? audienceMultipliers;

  PlacementMultipliers? placementMultipliers;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignBidOptions &&
    other.appTypeMultipliers == appTypeMultipliers &&
    other.audienceMultipliers == audienceMultipliers &&
    other.placementMultipliers == placementMultipliers;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (appTypeMultipliers == null ? 0 : appTypeMultipliers!.hashCode) +
    (audienceMultipliers == null ? 0 : audienceMultipliers!.hashCode) +
    (placementMultipliers == null ? 0 : placementMultipliers!.hashCode);

  @override
  String toString() => 'CampaignBidOptions[appTypeMultipliers=$appTypeMultipliers, audienceMultipliers=$audienceMultipliers, placementMultipliers=$placementMultipliers]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.appTypeMultipliers != null) {
      json[r'app_type_multipliers'] = this.appTypeMultipliers;
    } else {
      json[r'app_type_multipliers'] = null;
    }
    if (this.audienceMultipliers != null) {
      json[r'audience_multipliers'] = this.audienceMultipliers;
    } else {
      json[r'audience_multipliers'] = null;
    }
    if (this.placementMultipliers != null) {
      json[r'placement_multipliers'] = this.placementMultipliers;
    } else {
      json[r'placement_multipliers'] = null;
    }
    return json;
  }

  /// Returns a new [CampaignBidOptions] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignBidOptions? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CampaignBidOptions[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CampaignBidOptions[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CampaignBidOptions(
        appTypeMultipliers: AppTypeMultipliers.fromJson(json[r'app_type_multipliers']),
        audienceMultipliers: CampaignAudienceMultipliers.fromJson(json[r'audience_multipliers']),
        placementMultipliers: PlacementMultipliers.fromJson(json[r'placement_multipliers']),
      );
    }
    return null;
  }

  static List<CampaignBidOptions> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignBidOptions>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignBidOptions.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignBidOptions> mapFromJson(dynamic json) {
    final map = <String, CampaignBidOptions>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignBidOptions.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignBidOptions-objects as value to a dart map
  static Map<String, List<CampaignBidOptions>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignBidOptions>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignBidOptions.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

