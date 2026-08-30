//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'business_role_for_invite.g.dart';

class BusinessRoleForInvite extends EnumClass {

  /// The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
  @BuiltValueEnumConst(wireName: r'EMPLOYEE')
  static const BusinessRoleForInvite EMPLOYEE = _$EMPLOYEE;
  /// The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
  @BuiltValueEnumConst(wireName: r'BIZ_ADMIN')
  static const BusinessRoleForInvite BIZ_ADMIN = _$BIZ_ADMIN;
  /// The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
  @BuiltValueEnumConst(wireName: r'PARTNER')
  static const BusinessRoleForInvite PARTNER = _$PARTNER;

  static Serializer<BusinessRoleForInvite> get serializer => _$businessRoleForInviteSerializer;

  const BusinessRoleForInvite._(String name): super(name);

  static BuiltSet<BusinessRoleForInvite> get values => _$values;
  static BusinessRoleForInvite valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BusinessRoleForInviteMixin = Object with _$BusinessRoleForInviteMixin;

