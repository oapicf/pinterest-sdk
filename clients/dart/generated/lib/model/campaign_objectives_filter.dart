//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignObjectivesFilter {
  /// Returns a new [CampaignObjectivesFilter] instance.
  CampaignObjectivesFilter({
    this.campaignObjectiveTypes = const [],
  });

  /// List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
  List<ObjectiveType> campaignObjectiveTypes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignObjectivesFilter &&
    _deepEquality.equals(other.campaignObjectiveTypes, campaignObjectiveTypes);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (campaignObjectiveTypes.hashCode);

  @override
  String toString() => 'CampaignObjectivesFilter[campaignObjectiveTypes=$campaignObjectiveTypes]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'campaign_objective_types'] = this.campaignObjectiveTypes;
    return json;
  }

  /// Returns a new [CampaignObjectivesFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignObjectivesFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CampaignObjectivesFilter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CampaignObjectivesFilter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CampaignObjectivesFilter(
        campaignObjectiveTypes: ObjectiveType.listFromJson(json[r'campaign_objective_types']),
      );
    }
    return null;
  }

  static List<CampaignObjectivesFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignObjectivesFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignObjectivesFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignObjectivesFilter> mapFromJson(dynamic json) {
    final map = <String, CampaignObjectivesFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignObjectivesFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignObjectivesFilter-objects as value to a dart map
  static Map<String, List<CampaignObjectivesFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignObjectivesFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignObjectivesFilter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

