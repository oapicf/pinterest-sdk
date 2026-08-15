//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'business_role_for_members.g.dart';

class BusinessRoleForMembers extends EnumClass {

  /// The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
  @BuiltValueEnumConst(wireName: r'EMPLOYEE')
  static const BusinessRoleForMembers EMPLOYEE = _$EMPLOYEE;
  /// The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
  @BuiltValueEnumConst(wireName: r'BIZ_ADMIN')
  static const BusinessRoleForMembers BIZ_ADMIN = _$BIZ_ADMIN;

  static Serializer<BusinessRoleForMembers> get serializer => _$businessRoleForMembersSerializer;

  const BusinessRoleForMembers._(String name): super(name);

  static BuiltSet<BusinessRoleForMembers> get values => _$values;
  static BusinessRoleForMembers valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BusinessRoleForMembersMixin = Object with _$BusinessRoleForMembersMixin;

