//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PerformancePlusCampaignSettings {
  /// Returns a new [PerformancePlusCampaignSettings] instance.
  PerformancePlusCampaignSettings({
    this.boostProspectingAdGroupBid,
    this.pinnerListExclusions = const [],
  });

  /// Whether to boost prospecting ad group bid.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? boostProspectingAdGroupBid;

  /// List of campaign-level exclusion pinner list IDs.
  List<String> pinnerListExclusions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PerformancePlusCampaignSettings &&
    other.boostProspectingAdGroupBid == boostProspectingAdGroupBid &&
    _deepEquality.equals(other.pinnerListExclusions, pinnerListExclusions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (boostProspectingAdGroupBid == null ? 0 : boostProspectingAdGroupBid!.hashCode) +
    (pinnerListExclusions.hashCode);

  @override
  String toString() => 'PerformancePlusCampaignSettings[boostProspectingAdGroupBid=$boostProspectingAdGroupBid, pinnerListExclusions=$pinnerListExclusions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.boostProspectingAdGroupBid != null) {
      json[r'boost_prospecting_ad_group_bid'] = this.boostProspectingAdGroupBid;
    } else {
      json[r'boost_prospecting_ad_group_bid'] = null;
    }
      json[r'pinner_list_exclusions'] = this.pinnerListExclusions;
    return json;
  }

  /// Returns a new [PerformancePlusCampaignSettings] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PerformancePlusCampaignSettings? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return PerformancePlusCampaignSettings(
        boostProspectingAdGroupBid: mapValueOfType<bool>(json, r'boost_prospecting_ad_group_bid'),
        pinnerListExclusions: json[r'pinner_list_exclusions'] is Iterable
            ? (json[r'pinner_list_exclusions'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<PerformancePlusCampaignSettings> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PerformancePlusCampaignSettings>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PerformancePlusCampaignSettings.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PerformancePlusCampaignSettings> mapFromJson(dynamic json) {
    final map = <String, PerformancePlusCampaignSettings>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PerformancePlusCampaignSettings.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PerformancePlusCampaignSettings-objects as value to a dart map
  static Map<String, List<PerformancePlusCampaignSettings>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PerformancePlusCampaignSettings>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PerformancePlusCampaignSettings.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

