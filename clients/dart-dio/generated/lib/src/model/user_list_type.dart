//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'user_list_type.g.dart';

/// User list type
class UserListType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'EMAIL')
  static const UserListType EMAIL = _$EMAIL;
  @BuiltValueEnumConst(wireName: r'IDFA')
  static const UserListType IDFA = _$IDFA;
  @BuiltValueEnumConst(wireName: r'MAID')
  static const UserListType MAID = _$MAID;
  @BuiltValueEnumConst(wireName: r'LR_ID')
  static const UserListType LR_ID = _$LR_ID;
  @BuiltValueEnumConst(wireName: r'DLX_ID')
  static const UserListType DLX_ID = _$DLX_ID;
  @BuiltValueEnumConst(wireName: r'HASHED_PINNER_ID')
  static const UserListType HASHED_PINNER_ID = _$HASHED_PINNER_ID;

  static Serializer<UserListType> get serializer => _$userListTypeSerializer;

  const UserListType._(String name): super(name);

  static BuiltSet<UserListType> get values => _$values;
  static UserListType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class UserListTypeMixin = Object with _$UserListTypeMixin;

