//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'user_list_operation_type.g.dart';

class UserListOperationType extends EnumClass {

  /// User list operation type (add or remove)
  @BuiltValueEnumConst(wireName: r'ADD')
  static const UserListOperationType ADD = _$ADD;
  /// User list operation type (add or remove)
  @BuiltValueEnumConst(wireName: r'REMOVE')
  static const UserListOperationType REMOVE = _$REMOVE;

  static Serializer<UserListOperationType> get serializer => _$userListOperationTypeSerializer;

  const UserListOperationType._(String name): super(name);

  static BuiltSet<UserListOperationType> get values => _$values;
  static UserListOperationType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class UserListOperationTypeMixin = Object with _$UserListOperationTypeMixin;

