//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'business_access_role.g.dart';

class BusinessAccessRole extends EnumClass {

  /// Permission role for business access.
  @BuiltValueEnumConst(wireName: r'OWNER')
  static const BusinessAccessRole OWNER = _$OWNER;
  /// Permission role for business access.
  @BuiltValueEnumConst(wireName: r'ADMIN')
  static const BusinessAccessRole ADMIN = _$ADMIN;
  /// Permission role for business access.
  @BuiltValueEnumConst(wireName: r'ANALYST')
  static const BusinessAccessRole ANALYST = _$ANALYST;
  /// Permission role for business access.
  @BuiltValueEnumConst(wireName: r'SOS_READER')
  static const BusinessAccessRole SOS_READER = _$SOS_READER;
  /// Permission role for business access.
  @BuiltValueEnumConst(wireName: r'FINANCE_MANAGER')
  static const BusinessAccessRole FINANCE_MANAGER = _$FINANCE_MANAGER;
  /// Permission role for business access.
  @BuiltValueEnumConst(wireName: r'FINANCE_VIEW')
  static const BusinessAccessRole FINANCE_VIEW = _$FINANCE_VIEW;
  /// Permission role for business access.
  @BuiltValueEnumConst(wireName: r'FINANCE_EDIT')
  static const BusinessAccessRole FINANCE_EDIT = _$FINANCE_EDIT;
  /// Permission role for business access.
  @BuiltValueEnumConst(wireName: r'AUDIENCE_MANAGER')
  static const BusinessAccessRole AUDIENCE_MANAGER = _$AUDIENCE_MANAGER;
  /// Permission role for business access.
  @BuiltValueEnumConst(wireName: r'CAMPAIGN_MANAGER')
  static const BusinessAccessRole CAMPAIGN_MANAGER = _$CAMPAIGN_MANAGER;
  /// Permission role for business access.
  @BuiltValueEnumConst(wireName: r'CATALOGS_MANAGER')
  static const BusinessAccessRole CATALOGS_MANAGER = _$CATALOGS_MANAGER;
  /// Permission role for business access.
  @BuiltValueEnumConst(wireName: r'RESTRICTED_OWNER')
  static const BusinessAccessRole RESTRICTED_OWNER = _$RESTRICTED_OWNER;
  /// Permission role for business access.
  @BuiltValueEnumConst(wireName: r'PROFILE_MANAGER')
  static const BusinessAccessRole PROFILE_MANAGER = _$PROFILE_MANAGER;
  /// Permission role for business access.
  @BuiltValueEnumConst(wireName: r'PROFILE_PUBLISHER')
  static const BusinessAccessRole PROFILE_PUBLISHER = _$PROFILE_PUBLISHER;
  /// Permission role for business access.
  @BuiltValueEnumConst(wireName: r'RESOURCE_PINNER_LIST_OWNER')
  static const BusinessAccessRole RESOURCE_PINNER_LIST_OWNER = _$RESOURCE_PINNER_LIST_OWNER;
  /// Permission role for business access.
  @BuiltValueEnumConst(wireName: r'RESOURCE_PINNER_LIST_READER')
  static const BusinessAccessRole RESOURCE_PINNER_LIST_READER = _$RESOURCE_PINNER_LIST_READER;
  /// Permission role for business access.
  @BuiltValueEnumConst(wireName: r'BIZ_PINNER_LIST_SHARER')
  static const BusinessAccessRole BIZ_PINNER_LIST_SHARER = _$BIZ_PINNER_LIST_SHARER;
  /// Permission role for business access.
  @BuiltValueEnumConst(wireName: r'RESOURCE_CONVERSION_TAGS_READER')
  static const BusinessAccessRole RESOURCE_CONVERSION_TAGS_READER = _$RESOURCE_CONVERSION_TAGS_READER;

  static Serializer<BusinessAccessRole> get serializer => _$businessAccessRoleSerializer;

  const BusinessAccessRole._(String name): super(name);

  static BuiltSet<BusinessAccessRole> get values => _$values;
  static BusinessAccessRole valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BusinessAccessRoleMixin = Object with _$BusinessAccessRoleMixin;

