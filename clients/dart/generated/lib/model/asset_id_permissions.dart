//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AssetIdPermissions {
  /// Returns a new [AssetIdPermissions] instance.
  AssetIdPermissions({
    this.assetGroupInfo,
    required this.assetId,
    required this.assetType,
    this.permissions = const [],
  });

  /// An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AssetGroupBinding? assetGroupInfo;

  /// Unique identifier of a business asset.
  String assetId;

  AssetTypeResponse assetType;

  /// Permission levels member or partner has on an asset.
  List<String> permissions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AssetIdPermissions &&
    other.assetGroupInfo == assetGroupInfo &&
    other.assetId == assetId &&
    other.assetType == assetType &&
    _deepEquality.equals(other.permissions, permissions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (assetGroupInfo == null ? 0 : assetGroupInfo!.hashCode) +
    (assetId.hashCode) +
    (assetType.hashCode) +
    (permissions.hashCode);

  @override
  String toString() => 'AssetIdPermissions[assetGroupInfo=$assetGroupInfo, assetId=$assetId, assetType=$assetType, permissions=$permissions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.assetGroupInfo != null) {
      json[r'asset_group_info'] = this.assetGroupInfo;
    } else {
      json[r'asset_group_info'] = null;
    }
      json[r'asset_id'] = this.assetId;
      json[r'asset_type'] = this.assetType;
      json[r'permissions'] = this.permissions;
    return json;
  }

  /// Returns a new [AssetIdPermissions] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AssetIdPermissions? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'asset_id'), 'Required key "AssetIdPermissions[asset_id]" is missing from JSON.');
        assert(json[r'asset_id'] != null, 'Required key "AssetIdPermissions[asset_id]" has a null value in JSON.');
        assert(json.containsKey(r'asset_type'), 'Required key "AssetIdPermissions[asset_type]" is missing from JSON.');
        assert(json[r'asset_type'] != null, 'Required key "AssetIdPermissions[asset_type]" has a null value in JSON.');
        assert(json.containsKey(r'permissions'), 'Required key "AssetIdPermissions[permissions]" is missing from JSON.');
        assert(json[r'permissions'] != null, 'Required key "AssetIdPermissions[permissions]" has a null value in JSON.');
        return true;
      }());

      return AssetIdPermissions(
        assetGroupInfo: AssetGroupBinding.fromJson(json[r'asset_group_info']),
        assetId: mapValueOfType<String>(json, r'asset_id')!,
        assetType: AssetTypeResponse.fromJson(json[r'asset_type'])!,
        permissions: json[r'permissions'] is Iterable
            ? (json[r'permissions'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<AssetIdPermissions> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssetIdPermissions>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssetIdPermissions.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AssetIdPermissions> mapFromJson(dynamic json) {
    final map = <String, AssetIdPermissions>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AssetIdPermissions.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AssetIdPermissions-objects as value to a dart map
  static Map<String, List<AssetIdPermissions>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AssetIdPermissions>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AssetIdPermissions.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'asset_id',
    'asset_type',
    'permissions',
  };
}

