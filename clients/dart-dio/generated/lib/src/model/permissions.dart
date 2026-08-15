//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'permissions.g.dart';

class Permissions extends EnumClass {

  @BuiltValueEnumConst(wireName: r'ADMIN')
  static const Permissions ADMIN = _$ADMIN;
  @BuiltValueEnumConst(wireName: r'ANALYST')
  static const Permissions ANALYST = _$ANALYST;
  @BuiltValueEnumConst(wireName: r'FINANCE_MANAGER')
  static const Permissions FINANCE_MANAGER = _$FINANCE_MANAGER;
  @BuiltValueEnumConst(wireName: r'FINANCE_EDIT')
  static const Permissions FINANCE_EDIT = _$FINANCE_EDIT;
  @BuiltValueEnumConst(wireName: r'FINANCE_VIEW')
  static const Permissions FINANCE_VIEW = _$FINANCE_VIEW;
  @BuiltValueEnumConst(wireName: r'AUDIENCE_MANAGER')
  static const Permissions AUDIENCE_MANAGER = _$AUDIENCE_MANAGER;
  @BuiltValueEnumConst(wireName: r'CAMPAIGN_MANAGER')
  static const Permissions CAMPAIGN_MANAGER = _$CAMPAIGN_MANAGER;
  @BuiltValueEnumConst(wireName: r'CATALOGS_MANAGER')
  static const Permissions CATALOGS_MANAGER = _$CATALOGS_MANAGER;
  @BuiltValueEnumConst(wireName: r'CATALOGS_VIEWER')
  static const Permissions CATALOGS_VIEWER = _$CATALOGS_VIEWER;
  @BuiltValueEnumConst(wireName: r'PROFILE_PUBLISHER')
  static const Permissions PROFILE_PUBLISHER = _$PROFILE_PUBLISHER;
  @BuiltValueEnumConst(wireName: r'CONSUMER_USER')
  static const Permissions CONSUMER_USER = _$CONSUMER_USER;

  static Serializer<Permissions> get serializer => _$permissionsSerializer;

  const Permissions._(String name): super(name);

  static BuiltSet<Permissions> get values => _$values;
  static Permissions valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class PermissionsMixin = Object with _$PermissionsMixin;

