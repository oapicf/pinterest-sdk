//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'user_account_type.g.dart';

class UserAccountType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'PINNER')
  static const UserAccountType PINNER = _$PINNER;
  @BuiltValueEnumConst(wireName: r'BUSINESS')
  static const UserAccountType BUSINESS = _$BUSINESS;

  static Serializer<UserAccountType> get serializer => _$userAccountTypeSerializer;

  const UserAccountType._(String name): super(name);

  static BuiltSet<UserAccountType> get values => _$values;
  static UserAccountType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class UserAccountTypeMixin = Object with _$UserAccountTypeMixin;

