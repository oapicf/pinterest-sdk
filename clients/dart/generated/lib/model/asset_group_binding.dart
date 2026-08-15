//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AssetGroupBinding {
  /// Returns a new [AssetGroupBinding] instance.
  AssetGroupBinding({
    this.adAccountsIds = const [],
    this.assetGroupDescription,
    this.assetGroupName,
    this.assetGroupTypes = const [],
    this.catalogsIds = const [],
    this.createdBy,
    this.createdTime,
    this.id,
    this.owner,
    this.profilesIds = const [],
    this.updatedTime,
  });

  /// A list of ad account IDs under the asset group
  List<String>? adAccountsIds;

  /// Asset group description
  String? assetGroupDescription;

  /// Asset Group name
  String? assetGroupName;

  /// Asset group types
  List<String> assetGroupTypes;

  /// A list of catalog IDs under asset group
  List<String>? catalogsIds;

  /// The data of the user that created the asset group.
  BusinessAccessUserSummary? createdBy;

  /// The creation time of the asset group
  int? createdTime;

  /// Asset Group ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// The data of the business that owns the asset group.
  BusinessAccessUserSummary? owner;

  /// A list of profile IDs under asset group
  List<String>? profilesIds;

  /// The last update time of the asset group
  int? updatedTime;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AssetGroupBinding &&
    _deepEquality.equals(other.adAccountsIds, adAccountsIds) &&
    other.assetGroupDescription == assetGroupDescription &&
    other.assetGroupName == assetGroupName &&
    _deepEquality.equals(other.assetGroupTypes, assetGroupTypes) &&
    _deepEquality.equals(other.catalogsIds, catalogsIds) &&
    other.createdBy == createdBy &&
    other.createdTime == createdTime &&
    other.id == id &&
    other.owner == owner &&
    _deepEquality.equals(other.profilesIds, profilesIds) &&
    other.updatedTime == updatedTime;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccountsIds == null ? 0 : adAccountsIds!.hashCode) +
    (assetGroupDescription == null ? 0 : assetGroupDescription!.hashCode) +
    (assetGroupName == null ? 0 : assetGroupName!.hashCode) +
    (assetGroupTypes.hashCode) +
    (catalogsIds == null ? 0 : catalogsIds!.hashCode) +
    (createdBy == null ? 0 : createdBy!.hashCode) +
    (createdTime == null ? 0 : createdTime!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (owner == null ? 0 : owner!.hashCode) +
    (profilesIds == null ? 0 : profilesIds!.hashCode) +
    (updatedTime == null ? 0 : updatedTime!.hashCode);

  @override
  String toString() => 'AssetGroupBinding[adAccountsIds=$adAccountsIds, assetGroupDescription=$assetGroupDescription, assetGroupName=$assetGroupName, assetGroupTypes=$assetGroupTypes, catalogsIds=$catalogsIds, createdBy=$createdBy, createdTime=$createdTime, id=$id, owner=$owner, profilesIds=$profilesIds, updatedTime=$updatedTime]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adAccountsIds != null) {
      json[r'ad_accounts_ids'] = this.adAccountsIds;
    } else {
      json[r'ad_accounts_ids'] = null;
    }
    if (this.assetGroupDescription != null) {
      json[r'asset_group_description'] = this.assetGroupDescription;
    } else {
      json[r'asset_group_description'] = null;
    }
    if (this.assetGroupName != null) {
      json[r'asset_group_name'] = this.assetGroupName;
    } else {
      json[r'asset_group_name'] = null;
    }
      json[r'asset_group_types'] = this.assetGroupTypes;
    if (this.catalogsIds != null) {
      json[r'catalogs_ids'] = this.catalogsIds;
    } else {
      json[r'catalogs_ids'] = null;
    }
    if (this.createdBy != null) {
      json[r'created_by'] = this.createdBy;
    } else {
      json[r'created_by'] = null;
    }
    if (this.createdTime != null) {
      json[r'created_time'] = this.createdTime;
    } else {
      json[r'created_time'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.owner != null) {
      json[r'owner'] = this.owner;
    } else {
      json[r'owner'] = null;
    }
    if (this.profilesIds != null) {
      json[r'profiles_ids'] = this.profilesIds;
    } else {
      json[r'profiles_ids'] = null;
    }
    if (this.updatedTime != null) {
      json[r'updated_time'] = this.updatedTime;
    } else {
      json[r'updated_time'] = null;
    }
    return json;
  }

  /// Returns a new [AssetGroupBinding] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AssetGroupBinding? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AssetGroupBinding[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AssetGroupBinding[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AssetGroupBinding(
        adAccountsIds: json[r'ad_accounts_ids'] is Iterable
            ? (json[r'ad_accounts_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        assetGroupDescription: mapValueOfType<String>(json, r'asset_group_description'),
        assetGroupName: mapValueOfType<String>(json, r'asset_group_name'),
        assetGroupTypes: json[r'asset_group_types'] is Iterable
            ? (json[r'asset_group_types'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        catalogsIds: json[r'catalogs_ids'] is Iterable
            ? (json[r'catalogs_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        createdBy: BusinessAccessUserSummary.fromJson(json[r'created_by']),
        createdTime: mapValueOfType<int>(json, r'created_time'),
        id: mapValueOfType<String>(json, r'id'),
        owner: BusinessAccessUserSummary.fromJson(json[r'owner']),
        profilesIds: json[r'profiles_ids'] is Iterable
            ? (json[r'profiles_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        updatedTime: mapValueOfType<int>(json, r'updated_time'),
      );
    }
    return null;
  }

  static List<AssetGroupBinding> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssetGroupBinding>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssetGroupBinding.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AssetGroupBinding> mapFromJson(dynamic json) {
    final map = <String, AssetGroupBinding>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AssetGroupBinding.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AssetGroupBinding-objects as value to a dart map
  static Map<String, List<AssetGroupBinding>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AssetGroupBinding>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AssetGroupBinding.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

