//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/update_partner_asset_access_body_accesses_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'update_partner_asset_access_body.g.dart';

/// UpdatePartnerAssetAccessBody
///
/// Properties:
/// * [accesses] 
@BuiltValue()
abstract class UpdatePartnerAssetAccessBody implements Built<UpdatePartnerAssetAccessBody, UpdatePartnerAssetAccessBodyBuilder> {
  @BuiltValueField(wireName: r'accesses')
  BuiltList<UpdatePartnerAssetAccessBodyAccessesInner> get accesses;

  UpdatePartnerAssetAccessBody._();

  factory UpdatePartnerAssetAccessBody([void updates(UpdatePartnerAssetAccessBodyBuilder b)]) = _$UpdatePartnerAssetAccessBody;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UpdatePartnerAssetAccessBodyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UpdatePartnerAssetAccessBody> get serializer => _$UpdatePartnerAssetAccessBodySerializer();
}

class _$UpdatePartnerAssetAccessBodySerializer implements PrimitiveSerializer<UpdatePartnerAssetAccessBody> {
  @override
  final Iterable<Type> types = const [UpdatePartnerAssetAccessBody, _$UpdatePartnerAssetAccessBody];

  @override
  final String wireName = r'UpdatePartnerAssetAccessBody';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UpdatePartnerAssetAccessBody object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'accesses';
    yield serializers.serialize(
      object.accesses,
      specifiedType: const FullType(BuiltList, [FullType(UpdatePartnerAssetAccessBodyAccessesInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    UpdatePartnerAssetAccessBody object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UpdatePartnerAssetAccessBodyBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'accesses':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(UpdatePartnerAssetAccessBodyAccessesInner)]),
          ) as BuiltList<UpdatePartnerAssetAccessBodyAccessesInner>;
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
  UpdatePartnerAssetAccessBody deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UpdatePartnerAssetAccessBodyBuilder();
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

