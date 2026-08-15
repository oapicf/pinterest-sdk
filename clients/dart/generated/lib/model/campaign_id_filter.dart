//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignIdFilter {
  /// Returns a new [CampaignIdFilter] instance.
  CampaignIdFilter({
    this.campaignIds = const [],
  });

  /// List of campaign ids
  List<String> campaignIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignIdFilter &&
    _deepEquality.equals(other.campaignIds, campaignIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (campaignIds.hashCode);

  @override
  String toString() => 'CampaignIdFilter[campaignIds=$campaignIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'campaign_ids'] = this.campaignIds;
    return json;
  }

  /// Returns a new [CampaignIdFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignIdFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CampaignIdFilter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CampaignIdFilter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CampaignIdFilter(
        campaignIds: json[r'campaign_ids'] is Iterable
            ? (json[r'campaign_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<CampaignIdFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignIdFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignIdFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignIdFilter> mapFromJson(dynamic json) {
    final map = <String, CampaignIdFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignIdFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignIdFilter-objects as value to a dart map
  static Map<String, List<CampaignIdFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignIdFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignIdFilter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

