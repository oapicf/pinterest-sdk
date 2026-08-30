//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdateMemberAssetAccessItem {
  /// Returns a new [UpdateMemberAssetAccessItem] instance.
  UpdateMemberAssetAccessItem({
    required this.assetId,
    required this.memberId,
    this.permissions = const [],
  });

  /// Id of the asset to update.
  String assetId;

  /// Unique identifier of the member on which to perform the update
  String memberId;

  /// A non-empty array of permissions to assign to the member.
  List<Permissions> permissions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdateMemberAssetAccessItem &&
    other.assetId == assetId &&
    other.memberId == memberId &&
    _deepEquality.equals(other.permissions, permissions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (assetId.hashCode) +
    (memberId.hashCode) +
    (permissions.hashCode);

  @override
  String toString() => 'UpdateMemberAssetAccessItem[assetId=$assetId, memberId=$memberId, permissions=$permissions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'asset_id'] = this.assetId;
      json[r'member_id'] = this.memberId;
      json[r'permissions'] = this.permissions;
    return json;
  }

  /// Returns a new [UpdateMemberAssetAccessItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdateMemberAssetAccessItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'asset_id'), 'Required key "UpdateMemberAssetAccessItem[asset_id]" is missing from JSON.');
        assert(json[r'asset_id'] != null, 'Required key "UpdateMemberAssetAccessItem[asset_id]" has a null value in JSON.');
        assert(json.containsKey(r'member_id'), 'Required key "UpdateMemberAssetAccessItem[member_id]" is missing from JSON.');
        assert(json[r'member_id'] != null, 'Required key "UpdateMemberAssetAccessItem[member_id]" has a null value in JSON.');
        assert(json.containsKey(r'permissions'), 'Required key "UpdateMemberAssetAccessItem[permissions]" is missing from JSON.');
        assert(json[r'permissions'] != null, 'Required key "UpdateMemberAssetAccessItem[permissions]" has a null value in JSON.');
        return true;
      }());

      return UpdateMemberAssetAccessItem(
        assetId: mapValueOfType<String>(json, r'asset_id')!,
        memberId: mapValueOfType<String>(json, r'member_id')!,
        permissions: Permissions.listFromJson(json[r'permissions']),
      );
    }
    return null;
  }

  static List<UpdateMemberAssetAccessItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdateMemberAssetAccessItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdateMemberAssetAccessItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdateMemberAssetAccessItem> mapFromJson(dynamic json) {
    final map = <String, UpdateMemberAssetAccessItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdateMemberAssetAccessItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdateMemberAssetAccessItem-objects as value to a dart map
  static Map<String, List<UpdateMemberAssetAccessItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdateMemberAssetAccessItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdateMemberAssetAccessItem.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'asset_id',
    'member_id',
    'permissions',
  };
}

