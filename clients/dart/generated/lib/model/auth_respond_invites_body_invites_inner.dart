//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AuthRespondInvitesBodyInvitesInner {
  /// Returns a new [AuthRespondInvitesBodyInvitesInner] instance.
  AuthRespondInvitesBodyInvitesInner({
    required this.action,
    required this.inviteId,
  });

  AuthRespondInvitesBodyInvitesInnerAction action;

  /// Unique identifier of an invite.
  String inviteId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AuthRespondInvitesBodyInvitesInner &&
    other.action == action &&
    other.inviteId == inviteId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (action.hashCode) +
    (inviteId.hashCode);

  @override
  String toString() => 'AuthRespondInvitesBodyInvitesInner[action=$action, inviteId=$inviteId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'action'] = this.action;
      json[r'invite_id'] = this.inviteId;
    return json;
  }

  /// Returns a new [AuthRespondInvitesBodyInvitesInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AuthRespondInvitesBodyInvitesInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AuthRespondInvitesBodyInvitesInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AuthRespondInvitesBodyInvitesInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AuthRespondInvitesBodyInvitesInner(
        action: AuthRespondInvitesBodyInvitesInnerAction.fromJson(json[r'action'])!,
        inviteId: mapValueOfType<String>(json, r'invite_id')!,
      );
    }
    return null;
  }

  static List<AuthRespondInvitesBodyInvitesInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AuthRespondInvitesBodyInvitesInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AuthRespondInvitesBodyInvitesInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AuthRespondInvitesBodyInvitesInner> mapFromJson(dynamic json) {
    final map = <String, AuthRespondInvitesBodyInvitesInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AuthRespondInvitesBodyInvitesInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AuthRespondInvitesBodyInvitesInner-objects as value to a dart map
  static Map<String, List<AuthRespondInvitesBodyInvitesInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AuthRespondInvitesBodyInvitesInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AuthRespondInvitesBodyInvitesInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'action',
    'invite_id',
  };
}

