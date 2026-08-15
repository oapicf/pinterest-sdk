//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'permissions_with_owner.g.dart';

class PermissionsWithOwner extends EnumClass {

  @BuiltValueEnumConst(wireName: r'ADMIN')
  static const PermissionsWithOwner ADMIN = _$ADMIN;
  @BuiltValueEnumConst(wireName: r'ANALYST')
  static const PermissionsWithOwner ANALYST = _$ANALYST;
  @BuiltValueEnumConst(wireName: r'FINANCE_MANAGER')
  static const PermissionsWithOwner FINANCE_MANAGER = _$FINANCE_MANAGER;
  @BuiltValueEnumConst(wireName: r'FINANCE_EDIT')
  static const PermissionsWithOwner FINANCE_EDIT = _$FINANCE_EDIT;
  @BuiltValueEnumConst(wireName: r'FINANCE_VIEW')
  static const PermissionsWithOwner FINANCE_VIEW = _$FINANCE_VIEW;
  @BuiltValueEnumConst(wireName: r'AUDIENCE_MANAGER')
  static const PermissionsWithOwner AUDIENCE_MANAGER = _$AUDIENCE_MANAGER;
  @BuiltValueEnumConst(wireName: r'CAMPAIGN_MANAGER')
  static const PermissionsWithOwner CAMPAIGN_MANAGER = _$CAMPAIGN_MANAGER;
  @BuiltValueEnumConst(wireName: r'CATALOGS_MANAGER')
  static const PermissionsWithOwner CATALOGS_MANAGER = _$CATALOGS_MANAGER;
  @BuiltValueEnumConst(wireName: r'CATALOGS_VIEWER')
  static const PermissionsWithOwner CATALOGS_VIEWER = _$CATALOGS_VIEWER;
  @BuiltValueEnumConst(wireName: r'PROFILE_PUBLISHER')
  static const PermissionsWithOwner PROFILE_PUBLISHER = _$PROFILE_PUBLISHER;
  @BuiltValueEnumConst(wireName: r'OWNER')
  static const PermissionsWithOwner OWNER = _$OWNER;

  static Serializer<PermissionsWithOwner> get serializer => _$permissionsWithOwnerSerializer;

  const PermissionsWithOwner._(String name): super(name);

  static BuiltSet<PermissionsWithOwner> get values => _$values;
  static PermissionsWithOwner valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class PermissionsWithOwnerMixin = Object with _$PermissionsWithOwnerMixin;

