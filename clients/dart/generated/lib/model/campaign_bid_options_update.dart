//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignBidOptionsUpdate {
  /// Returns a new [CampaignBidOptionsUpdate] instance.
  CampaignBidOptionsUpdate({
    this.ageBucketMultipliers,
    this.appTypeMultipliers,
    this.audienceMultipliers,
    this.freqBidMultiplierTimeWindow,
    this.frequencyMultipliers,
    this.genderMultipliers,
    this.placementMultipliers,
    this.updateMask = const [],
  });

  /// Age bucket multipliers for bid adjustments.
  AgeBucketMultipliers? ageBucketMultipliers;

  /// App type multipliers for bid adjustments.
  AppTypeMultipliers? appTypeMultipliers;

  /// Audience multipliers for bid adjustments.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CampaignAudienceMultipliers? audienceMultipliers;

  /// The time window for frequency bid multipliers.
  FreqBidMultiplierTimeWindow? freqBidMultiplierTimeWindow;

  /// Frequency multipliers for bid adjustments.
  FrequencyMultipliers? frequencyMultipliers;

  /// Gender multipliers for bid adjustments.
  GenderMultipliers? genderMultipliers;

  /// Placement multipliers for bid adjustments.
  PlacementMultipliers? placementMultipliers;

  /// List of fields to update. Only the fields in the list will be updated.
  List<CampaignBidOptionsUpdateMaskItems> updateMask;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignBidOptionsUpdate &&
    other.ageBucketMultipliers == ageBucketMultipliers &&
    other.appTypeMultipliers == appTypeMultipliers &&
    other.audienceMultipliers == audienceMultipliers &&
    other.freqBidMultiplierTimeWindow == freqBidMultiplierTimeWindow &&
    other.frequencyMultipliers == frequencyMultipliers &&
    other.genderMultipliers == genderMultipliers &&
    other.placementMultipliers == placementMultipliers &&
    _deepEquality.equals(other.updateMask, updateMask);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (ageBucketMultipliers == null ? 0 : ageBucketMultipliers!.hashCode) +
    (appTypeMultipliers == null ? 0 : appTypeMultipliers!.hashCode) +
    (audienceMultipliers == null ? 0 : audienceMultipliers!.hashCode) +
    (freqBidMultiplierTimeWindow == null ? 0 : freqBidMultiplierTimeWindow!.hashCode) +
    (frequencyMultipliers == null ? 0 : frequencyMultipliers!.hashCode) +
    (genderMultipliers == null ? 0 : genderMultipliers!.hashCode) +
    (placementMultipliers == null ? 0 : placementMultipliers!.hashCode) +
    (updateMask.hashCode);

  @override
  String toString() => 'CampaignBidOptionsUpdate[ageBucketMultipliers=$ageBucketMultipliers, appTypeMultipliers=$appTypeMultipliers, audienceMultipliers=$audienceMultipliers, freqBidMultiplierTimeWindow=$freqBidMultiplierTimeWindow, frequencyMultipliers=$frequencyMultipliers, genderMultipliers=$genderMultipliers, placementMultipliers=$placementMultipliers, updateMask=$updateMask]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.ageBucketMultipliers != null) {
      json[r'age_bucket_multipliers'] = this.ageBucketMultipliers;
    } else {
      json[r'age_bucket_multipliers'] = null;
    }
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
    if (this.freqBidMultiplierTimeWindow != null) {
      json[r'freq_bid_multiplier_time_window'] = this.freqBidMultiplierTimeWindow;
    } else {
      json[r'freq_bid_multiplier_time_window'] = null;
    }
    if (this.frequencyMultipliers != null) {
      json[r'frequency_multipliers'] = this.frequencyMultipliers;
    } else {
      json[r'frequency_multipliers'] = null;
    }
    if (this.genderMultipliers != null) {
      json[r'gender_multipliers'] = this.genderMultipliers;
    } else {
      json[r'gender_multipliers'] = null;
    }
    if (this.placementMultipliers != null) {
      json[r'placement_multipliers'] = this.placementMultipliers;
    } else {
      json[r'placement_multipliers'] = null;
    }
      json[r'update_mask'] = this.updateMask;
    return json;
  }

  /// Returns a new [CampaignBidOptionsUpdate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignBidOptionsUpdate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'update_mask'), 'Required key "CampaignBidOptionsUpdate[update_mask]" is missing from JSON.');
        assert(json[r'update_mask'] != null, 'Required key "CampaignBidOptionsUpdate[update_mask]" has a null value in JSON.');
        return true;
      }());

      return CampaignBidOptionsUpdate(
        ageBucketMultipliers: AgeBucketMultipliers.fromJson(json[r'age_bucket_multipliers']),
        appTypeMultipliers: AppTypeMultipliers.fromJson(json[r'app_type_multipliers']),
        audienceMultipliers: CampaignAudienceMultipliers.fromJson(json[r'audience_multipliers']),
        freqBidMultiplierTimeWindow: FreqBidMultiplierTimeWindow.fromJson(json[r'freq_bid_multiplier_time_window']),
        frequencyMultipliers: FrequencyMultipliers.fromJson(json[r'frequency_multipliers']),
        genderMultipliers: GenderMultipliers.fromJson(json[r'gender_multipliers']),
        placementMultipliers: PlacementMultipliers.fromJson(json[r'placement_multipliers']),
        updateMask: CampaignBidOptionsUpdateMaskItems.listFromJson(json[r'update_mask']),
      );
    }
    return null;
  }

  static List<CampaignBidOptionsUpdate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignBidOptionsUpdate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignBidOptionsUpdate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignBidOptionsUpdate> mapFromJson(dynamic json) {
    final map = <String, CampaignBidOptionsUpdate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignBidOptionsUpdate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignBidOptionsUpdate-objects as value to a dart map
  static Map<String, List<CampaignBidOptionsUpdate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignBidOptionsUpdate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignBidOptionsUpdate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'update_mask',
  };
}

