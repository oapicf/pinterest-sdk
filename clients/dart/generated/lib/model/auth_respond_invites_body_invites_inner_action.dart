//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AuthRespondInvitesBodyInvitesInnerAction {
  /// Returns a new [AuthRespondInvitesBodyInvitesInnerAction] instance.
  AuthRespondInvitesBodyInvitesInnerAction({
    required this.acceptInvite,
    this.assetIdToPermissions = const {},
  });

  /// Whether the invite/request is accepted.
  bool acceptInvite;

  /// An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
  Map<String, List<Permissions>> assetIdToPermissions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AuthRespondInvitesBodyInvitesInnerAction &&
    other.acceptInvite == acceptInvite &&
    _deepEquality.equals(other.assetIdToPermissions, assetIdToPermissions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (acceptInvite.hashCode) +
    (assetIdToPermissions.hashCode);

  @override
  String toString() => 'AuthRespondInvitesBodyInvitesInnerAction[acceptInvite=$acceptInvite, assetIdToPermissions=$assetIdToPermissions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'accept_invite'] = this.acceptInvite;
      json[r'asset_id_to_permissions'] = this.assetIdToPermissions;
    return json;
  }

  /// Returns a new [AuthRespondInvitesBodyInvitesInnerAction] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AuthRespondInvitesBodyInvitesInnerAction? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AuthRespondInvitesBodyInvitesInnerAction[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AuthRespondInvitesBodyInvitesInnerAction[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AuthRespondInvitesBodyInvitesInnerAction(
        acceptInvite: mapValueOfType<bool>(json, r'accept_invite')!,
        assetIdToPermissions: json[r'asset_id_to_permissions'] == null
          ? const {}
            : Permissions.mapListFromJson(json[r'asset_id_to_permissions']),
      );
    }
    return null;
  }

  static List<AuthRespondInvitesBodyInvitesInnerAction> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AuthRespondInvitesBodyInvitesInnerAction>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AuthRespondInvitesBodyInvitesInnerAction.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AuthRespondInvitesBodyInvitesInnerAction> mapFromJson(dynamic json) {
    final map = <String, AuthRespondInvitesBodyInvitesInnerAction>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AuthRespondInvitesBodyInvitesInnerAction.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AuthRespondInvitesBodyInvitesInnerAction-objects as value to a dart map
  static Map<String, List<AuthRespondInvitesBodyInvitesInnerAction>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AuthRespondInvitesBodyInvitesInnerAction>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AuthRespondInvitesBodyInvitesInnerAction.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'accept_invite',
  };
}

