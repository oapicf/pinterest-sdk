//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BusinessMemberAssetsSummary {
  /// Returns a new [BusinessMemberAssetsSummary] instance.
  BusinessMemberAssetsSummary({
    this.adAccounts = const [],
    this.profiles = const [],
  });

  /// List of ad account IDs and respective permission levels.
  List<AssetIdWithPermissions> adAccounts;

  /// List of profile IDs and respective permission levels.
  List<AssetIdWithPermissions> profiles;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BusinessMemberAssetsSummary &&
    _deepEquality.equals(other.adAccounts, adAccounts) &&
    _deepEquality.equals(other.profiles, profiles);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccounts.hashCode) +
    (profiles.hashCode);

  @override
  String toString() => 'BusinessMemberAssetsSummary[adAccounts=$adAccounts, profiles=$profiles]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ad_accounts'] = this.adAccounts;
      json[r'profiles'] = this.profiles;
    return json;
  }

  /// Returns a new [BusinessMemberAssetsSummary] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BusinessMemberAssetsSummary? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return BusinessMemberAssetsSummary(
        adAccounts: AssetIdWithPermissions.listFromJson(json[r'ad_accounts']),
        profiles: AssetIdWithPermissions.listFromJson(json[r'profiles']),
      );
    }
    return null;
  }

  static List<BusinessMemberAssetsSummary> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BusinessMemberAssetsSummary>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BusinessMemberAssetsSummary.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BusinessMemberAssetsSummary> mapFromJson(dynamic json) {
    final map = <String, BusinessMemberAssetsSummary>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BusinessMemberAssetsSummary.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BusinessMemberAssetsSummary-objects as value to a dart map
  static Map<String, List<BusinessMemberAssetsSummary>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BusinessMemberAssetsSummary>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BusinessMemberAssetsSummary.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

