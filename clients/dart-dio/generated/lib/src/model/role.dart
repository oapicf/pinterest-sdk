//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'role.g.dart';

class Role extends EnumClass {

  /// An internal role type used on business access, EMPLOYEE, ADMIN.
  @BuiltValueEnumConst(wireName: r'UNKNOWN')
  static const Role UNKNOWN = _$UNKNOWN;
  /// An internal role type used on business access, EMPLOYEE, ADMIN.
  @BuiltValueEnumConst(wireName: r'OWNER')
  static const Role OWNER = _$OWNER;
  /// An internal role type used on business access, EMPLOYEE, ADMIN.
  @BuiltValueEnumConst(wireName: r'ADMIN')
  static const Role ADMIN = _$ADMIN;
  /// An internal role type used on business access, EMPLOYEE, ADMIN.
  @BuiltValueEnumConst(wireName: r'ANALYST')
  static const Role ANALYST = _$ANALYST;
  /// An internal role type used on business access, EMPLOYEE, ADMIN.
  @BuiltValueEnumConst(wireName: r'SOS_READER')
  static const Role SOS_READER = _$SOS_READER;
  /// An internal role type used on business access, EMPLOYEE, ADMIN.
  @BuiltValueEnumConst(wireName: r'FINANCE_MANAGER')
  static const Role FINANCE_MANAGER = _$FINANCE_MANAGER;
  /// An internal role type used on business access, EMPLOYEE, ADMIN.
  @BuiltValueEnumConst(wireName: r'FINANCE_EDIT')
  static const Role FINANCE_EDIT = _$FINANCE_EDIT;
  /// An internal role type used on business access, EMPLOYEE, ADMIN.
  @BuiltValueEnumConst(wireName: r'FINANCE_VIEW')
  static const Role FINANCE_VIEW = _$FINANCE_VIEW;
  /// An internal role type used on business access, EMPLOYEE, ADMIN.
  @BuiltValueEnumConst(wireName: r'AUDIENCE_MANAGER')
  static const Role AUDIENCE_MANAGER = _$AUDIENCE_MANAGER;
  /// An internal role type used on business access, EMPLOYEE, ADMIN.
  @BuiltValueEnumConst(wireName: r'CAMPAIGN_MANAGER')
  static const Role CAMPAIGN_MANAGER = _$CAMPAIGN_MANAGER;
  /// An internal role type used on business access, EMPLOYEE, ADMIN.
  @BuiltValueEnumConst(wireName: r'CATALOGS_MANAGER')
  static const Role CATALOGS_MANAGER = _$CATALOGS_MANAGER;
  /// An internal role type used on business access, EMPLOYEE, ADMIN.
  @BuiltValueEnumConst(wireName: r'CATALOGS_VIEWER')
  static const Role CATALOGS_VIEWER = _$CATALOGS_VIEWER;
  /// An internal role type used on business access, EMPLOYEE, ADMIN.
  @BuiltValueEnumConst(wireName: r'RESTRICTED_OWNER')
  static const Role RESTRICTED_OWNER = _$RESTRICTED_OWNER;
  /// An internal role type used on business access, EMPLOYEE, ADMIN.
  @BuiltValueEnumConst(wireName: r'PROFILE_MANAGER')
  static const Role PROFILE_MANAGER = _$PROFILE_MANAGER;
  /// An internal role type used on business access, EMPLOYEE, ADMIN.
  @BuiltValueEnumConst(wireName: r'PROFILE_PUBLISHER')
  static const Role PROFILE_PUBLISHER = _$PROFILE_PUBLISHER;
  /// An internal role type used on business access, EMPLOYEE, ADMIN.
  @BuiltValueEnumConst(wireName: r'RESOURCE_PINNER_LIST_OWNER')
  static const Role RESOURCE_PINNER_LIST_OWNER = _$RESOURCE_PINNER_LIST_OWNER;
  /// An internal role type used on business access, EMPLOYEE, ADMIN.
  @BuiltValueEnumConst(wireName: r'RESOURCE_PINNER_LIST_READER')
  static const Role RESOURCE_PINNER_LIST_READER = _$RESOURCE_PINNER_LIST_READER;
  /// An internal role type used on business access, EMPLOYEE, ADMIN.
  @BuiltValueEnumConst(wireName: r'BIZ_PINNER_LIST_SHARER')
  static const Role BIZ_PINNER_LIST_SHARER = _$BIZ_PINNER_LIST_SHARER;
  /// An internal role type used on business access, EMPLOYEE, ADMIN.
  @BuiltValueEnumConst(wireName: r'RESOURCE_CONVERSION_TAGS_READER')
  static const Role RESOURCE_CONVERSION_TAGS_READER = _$RESOURCE_CONVERSION_TAGS_READER;

  static Serializer<Role> get serializer => _$roleSerializer;

  const Role._(String name): super(name);

  static BuiltSet<Role> get values => _$values;
  static Role valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class RoleMixin = Object with _$RoleMixin;

