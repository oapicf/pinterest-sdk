//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'business_role_check_mode.g.dart';

class BusinessRoleCheckMode extends EnumClass {

  /// Specifies if the partner is internal or external.
  @BuiltValueEnumConst(wireName: r'INTERNAL')
  static const BusinessRoleCheckMode INTERNAL = _$INTERNAL;
  /// Specifies if the partner is internal or external.
  @BuiltValueEnumConst(wireName: r'EXTERNAL')
  static const BusinessRoleCheckMode EXTERNAL = _$EXTERNAL;

  static Serializer<BusinessRoleCheckMode> get serializer => _$businessRoleCheckModeSerializer;

  const BusinessRoleCheckMode._(String name): super(name);

  static BuiltSet<BusinessRoleCheckMode> get values => _$values;
  static BusinessRoleCheckMode valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BusinessRoleCheckModeMixin = Object with _$BusinessRoleCheckModeMixin;

