//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'member_business_role.g.dart';

class MemberBusinessRole extends EnumClass {

  /// The access level a member/partner has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access ad accounts you assign to them. They cannot see details about other employees, external partners or other ad accounts. <br> - BIZ_ADMIN: Have full control of roles and can add employees, external partners as well as grant ad account access.
  @BuiltValueEnumConst(wireName: r'EMPLOYEE')
  static const MemberBusinessRole EMPLOYEE = _$EMPLOYEE;
  /// The access level a member/partner has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access ad accounts you assign to them. They cannot see details about other employees, external partners or other ad accounts. <br> - BIZ_ADMIN: Have full control of roles and can add employees, external partners as well as grant ad account access.
  @BuiltValueEnumConst(wireName: r'BIZ_ADMIN')
  static const MemberBusinessRole BIZ_ADMIN = _$BIZ_ADMIN;

  static Serializer<MemberBusinessRole> get serializer => _$memberBusinessRoleSerializer;

  const MemberBusinessRole._(String name): super(name);

  static BuiltSet<MemberBusinessRole> get values => _$values;
  static MemberBusinessRole valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class MemberBusinessRoleMixin = Object with _$MemberBusinessRoleMixin;

