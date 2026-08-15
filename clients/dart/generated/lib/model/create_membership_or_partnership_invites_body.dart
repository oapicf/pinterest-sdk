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

  /// The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
  CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum businessRole;

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
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateMembershipOrPartnershipInvitesBody[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateMembershipOrPartnershipInvitesBody[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateMembershipOrPartnershipInvitesBody(
        businessRole: CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum.fromJson(json[r'business_role'])!,
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

/// The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
class CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const EMPLOYEE = CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum._(r'EMPLOYEE');
  static const BIZ_ADMIN = CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum._(r'BIZ_ADMIN');
  static const PARTNER = CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum._(r'PARTNER');

  /// List of all possible values in this [enum][CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum].
  static const values = <CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum>[
    EMPLOYEE,
    BIZ_ADMIN,
    PARTNER,
  ];

  static CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum? fromJson(dynamic value) => CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnumTypeTransformer().decode(value);

  static List<CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum] to String,
/// and [decode] dynamic data back to [CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum].
class CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnumTypeTransformer {
  factory CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnumTypeTransformer() => _instance ??= const CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnumTypeTransformer._();

  const CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnumTypeTransformer._();

  String encode(CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'EMPLOYEE': return CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum.EMPLOYEE;
        case r'BIZ_ADMIN': return CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum.BIZ_ADMIN;
        case r'PARTNER': return CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnum.PARTNER;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnumTypeTransformer] instance.
  static CreateMembershipOrPartnershipInvitesBodyBusinessRoleEnumTypeTransformer? _instance;
}


