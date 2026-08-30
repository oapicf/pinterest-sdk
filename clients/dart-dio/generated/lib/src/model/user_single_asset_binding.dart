//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/business_access_user_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'user_single_asset_binding.g.dart';

/// An object containing the permissions a business member/partner has on the asset.
///
/// Properties:
/// * [permissions] - Permission levels member or partner has on an asset.
/// * [user] 
@BuiltValue()
abstract class UserSingleAssetBinding implements Built<UserSingleAssetBinding, UserSingleAssetBindingBuilder> {
  /// Permission levels member or partner has on an asset.
  @BuiltValueField(wireName: r'permissions')
  BuiltList<String>? get permissions;

  @BuiltValueField(wireName: r'user')
  BusinessAccessUserSummary? get user;

  UserSingleAssetBinding._();

  factory UserSingleAssetBinding([void updates(UserSingleAssetBindingBuilder b)]) = _$UserSingleAssetBinding;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UserSingleAssetBindingBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UserSingleAssetBinding> get serializer => _$UserSingleAssetBindingSerializer();
}

class _$UserSingleAssetBindingSerializer implements PrimitiveSerializer<UserSingleAssetBinding> {
  @override
  final Iterable<Type> types = const [UserSingleAssetBinding, _$UserSingleAssetBinding];

  @override
  final String wireName = r'UserSingleAssetBinding';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UserSingleAssetBinding object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.permissions != null) {
      yield r'permissions';
      yield serializers.serialize(
        object.permissions,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.user != null) {
      yield r'user';
      yield serializers.serialize(
        object.user,
        specifiedType: const FullType(BusinessAccessUserSummary),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    UserSingleAssetBinding object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UserSingleAssetBindingBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'permissions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.permissions.replace(valueDes);
          break;
        case r'user':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BusinessAccessUserSummary),
          ) as BusinessAccessUserSummary?;
          if (valueDes == null) continue;
          result.user.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  UserSingleAssetBinding deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UserSingleAssetBindingBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

