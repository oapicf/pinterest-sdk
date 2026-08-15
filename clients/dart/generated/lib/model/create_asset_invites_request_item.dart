//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateAssetInvitesRequestItem {
  /// Returns a new [CreateAssetInvitesRequestItem] instance.
  CreateAssetInvitesRequestItem({
    this.assetIdToPermissions = const {},
    required this.inviteId,
    required this.inviteType,
  });

  /// An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
  Map<String, List<Permissions>> assetIdToPermissions;

  /// Unique identifier of an invite.
  String inviteId;

  InviteType inviteType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateAssetInvitesRequestItem &&
    _deepEquality.equals(other.assetIdToPermissions, assetIdToPermissions) &&
    other.inviteId == inviteId &&
    other.inviteType == inviteType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (assetIdToPermissions.hashCode) +
    (inviteId.hashCode) +
    (inviteType.hashCode);

  @override
  String toString() => 'CreateAssetInvitesRequestItem[assetIdToPermissions=$assetIdToPermissions, inviteId=$inviteId, inviteType=$inviteType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'asset_id_to_permissions'] = this.assetIdToPermissions;
      json[r'invite_id'] = this.inviteId;
      json[r'invite_type'] = this.inviteType;
    return json;
  }

  /// Returns a new [CreateAssetInvitesRequestItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateAssetInvitesRequestItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateAssetInvitesRequestItem[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateAssetInvitesRequestItem[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateAssetInvitesRequestItem(
        assetIdToPermissions: json[r'asset_id_to_permissions'] == null
          ? const {}
            : Permissions.mapListFromJson(json[r'asset_id_to_permissions']),
        inviteId: mapValueOfType<String>(json, r'invite_id')!,
        inviteType: InviteType.fromJson(json[r'invite_type'])!,
      );
    }
    return null;
  }

  static List<CreateAssetInvitesRequestItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateAssetInvitesRequestItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateAssetInvitesRequestItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateAssetInvitesRequestItem> mapFromJson(dynamic json) {
    final map = <String, CreateAssetInvitesRequestItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateAssetInvitesRequestItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateAssetInvitesRequestItem-objects as value to a dart map
  static Map<String, List<CreateAssetInvitesRequestItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateAssetInvitesRequestItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateAssetInvitesRequestItem.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'asset_id_to_permissions',
    'invite_id',
    'invite_type',
  };
}

