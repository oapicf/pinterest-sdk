//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateMembershipOrPartnershipInvitesBody {
  /// Returns a new [CreateMembershipOrPartnershipInvitesBody] instance.
  CreateMembershipOrPartnershipInvitesBody({
    required this.businessRole,
    required this.inviteType,
    this.members = const [],
    this.partners = const [],
  });

  BusinessRoleForInvite businessRole;

  InviteType inviteType;

  /// A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
  List<String> members;

  /// A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
  List<String> partners;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateMembershipOrPartnershipInvitesBody &&
    other.businessRole == businessRole &&
    other.inviteType == inviteType &&
    _deepEquality.equals(other.members, members) &&
    _deepEquality.equals(other.partners, partners);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (businessRole.hashCode) +
    (inviteType.hashCode) +
    (members.hashCode) +
    (partners.hashCode);

  @override
  String toString() => 'CreateMembershipOrPartnershipInvitesBody[businessRole=$businessRole, inviteType=$inviteType, members=$members, partners=$partners]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'business_role'] = this.businessRole;
      json[r'invite_type'] = this.inviteType;
      json[r'members'] = this.members;
      json[r'partners'] = this.partners;
    return json;
  }

  /// Returns a new [CreateMembershipOrPartnershipInvitesBody] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateMembershipOrPartnershipInvitesBody? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'business_role'), 'Required key "CreateMembershipOrPartnershipInvitesBody[business_role]" is missing from JSON.');
        assert(json[r'business_role'] != null, 'Required key "CreateMembershipOrPartnershipInvitesBody[business_role]" has a null value in JSON.');
        assert(json.containsKey(r'invite_type'), 'Required key "CreateMembershipOrPartnershipInvitesBody[invite_type]" is missing from JSON.');
        assert(json[r'invite_type'] != null, 'Required key "CreateMembershipOrPartnershipInvitesBody[invite_type]" has a null value in JSON.');
        return true;
      }());

      return CreateMembershipOrPartnershipInvitesBody(
        businessRole: BusinessRoleForInvite.fromJson(json[r'business_role'])!,
        inviteType: InviteType.fromJson(json[r'invite_type'])!,
        members: json[r'members'] is Iterable
            ? (json[r'members'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        partners: json[r'partners'] is Iterable
            ? (json[r'partners'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<CreateMembershipOrPartnershipInvitesBody> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateMembershipOrPartnershipInvitesBody>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateMembershipOrPartnershipInvitesBody.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateMembershipOrPartnershipInvitesBody> mapFromJson(dynamic json) {
    final map = <String, CreateMembershipOrPartnershipInvitesBody>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateMembershipOrPartnershipInvitesBody.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateMembershipOrPartnershipInvitesBody-objects as value to a dart map
  static Map<String, List<CreateMembershipOrPartnershipInvitesBody>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateMembershipOrPartnershipInvitesBody>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateMembershipOrPartnershipInvitesBody.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'business_role',
    'invite_type',
  };
}

