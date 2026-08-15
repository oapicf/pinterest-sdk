//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/update_member_asset_access_body_accesses_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'update_member_asset_access_body.g.dart';

/// An object with a list of all the new accesses.
///
/// Properties:
/// * [accesses] 
@BuiltValue()
abstract class UpdateMemberAssetAccessBody implements Built<UpdateMemberAssetAccessBody, UpdateMemberAssetAccessBodyBuilder> {
  @BuiltValueField(wireName: r'accesses')
  BuiltList<UpdateMemberAssetAccessBodyAccessesInner> get accesses;

  UpdateMemberAssetAccessBody._();

  factory UpdateMemberAssetAccessBody([void updates(UpdateMemberAssetAccessBodyBuilder b)]) = _$UpdateMemberAssetAccessBody;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UpdateMemberAssetAccessBodyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UpdateMemberAssetAccessBody> get serializer => _$UpdateMemberAssetAccessBodySerializer();
}

class _$UpdateMemberAssetAccessBodySerializer implements PrimitiveSerializer<UpdateMemberAssetAccessBody> {
  @override
  final Iterable<Type> types = const [UpdateMemberAssetAccessBody, _$UpdateMemberAssetAccessBody];

  @override
  final String wireName = r'UpdateMemberAssetAccessBody';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UpdateMemberAssetAccessBody object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'accesses';
    yield serializers.serialize(
      object.accesses,
      specifiedType: const FullType(BuiltList, [FullType(UpdateMemberAssetAccessBodyAccessesInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    UpdateMemberAssetAccessBody object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UpdateMemberAssetAccessBodyBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'accesses':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(UpdateMemberAssetAccessBodyAccessesInner)]),
          ) as BuiltList<UpdateMemberAssetAccessBodyAccessesInner>;
          result.accesses.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  UpdateMemberAssetAccessBody deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UpdateMemberAssetAccessBodyBuilder();
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

