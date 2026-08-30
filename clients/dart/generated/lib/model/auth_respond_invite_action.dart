//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AuthRespondInviteAction {
  /// Returns a new [AuthRespondInviteAction] instance.
  AuthRespondInviteAction({
    required this.acceptInvite,
    this.assetIdToPermissions = const {},
  });

  /// Whether the invite/request is accepted.
  bool acceptInvite;

  /// An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
  Map<String, List<Permissions>> assetIdToPermissions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AuthRespondInviteAction &&
    other.acceptInvite == acceptInvite &&
    _deepEquality.equals(other.assetIdToPermissions, assetIdToPermissions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (acceptInvite.hashCode) +
    (assetIdToPermissions.hashCode);

  @override
  String toString() => 'AuthRespondInviteAction[acceptInvite=$acceptInvite, assetIdToPermissions=$assetIdToPermissions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'accept_invite'] = this.acceptInvite;
      json[r'asset_id_to_permissions'] = this.assetIdToPermissions;
    return json;
  }

  /// Returns a new [AuthRespondInviteAction] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AuthRespondInviteAction? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'accept_invite'), 'Required key "AuthRespondInviteAction[accept_invite]" is missing from JSON.');
        assert(json[r'accept_invite'] != null, 'Required key "AuthRespondInviteAction[accept_invite]" has a null value in JSON.');
        return true;
      }());

      return AuthRespondInviteAction(
        acceptInvite: mapValueOfType<bool>(json, r'accept_invite')!,
        assetIdToPermissions: json[r'asset_id_to_permissions'] == null
          ? const {}
            : Permissions.mapListFromJson(json[r'asset_id_to_permissions']),
      );
    }
    return null;
  }

  static List<AuthRespondInviteAction> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AuthRespondInviteAction>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AuthRespondInviteAction.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AuthRespondInviteAction> mapFromJson(dynamic json) {
    final map = <String, AuthRespondInviteAction>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AuthRespondInviteAction.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AuthRespondInviteAction-objects as value to a dart map
  static Map<String, List<AuthRespondInviteAction>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AuthRespondInviteAction>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AuthRespondInviteAction.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'accept_invite',
  };
}

