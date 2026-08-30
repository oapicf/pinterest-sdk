//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/delete_partner_asset_access_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_partner_asset_access_body.g.dart';

/// An object with a list of partner asset accesses to delete.
///
/// Properties:
/// * [accesses] - List of partner asset accesses to delete.
@BuiltValue()
abstract class DeletePartnerAssetAccessBody implements Built<DeletePartnerAssetAccessBody, DeletePartnerAssetAccessBodyBuilder> {
  /// List of partner asset accesses to delete.
  @BuiltValueField(wireName: r'accesses')
  BuiltList<DeletePartnerAssetAccessItem> get accesses;

  DeletePartnerAssetAccessBody._();

  factory DeletePartnerAssetAccessBody([void updates(DeletePartnerAssetAccessBodyBuilder b)]) = _$DeletePartnerAssetAccessBody;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeletePartnerAssetAccessBodyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeletePartnerAssetAccessBody> get serializer => _$DeletePartnerAssetAccessBodySerializer();
}

class _$DeletePartnerAssetAccessBodySerializer implements PrimitiveSerializer<DeletePartnerAssetAccessBody> {
  @override
  final Iterable<Type> types = const [DeletePartnerAssetAccessBody, _$DeletePartnerAssetAccessBody];

  @override
  final String wireName = r'DeletePartnerAssetAccessBody';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeletePartnerAssetAccessBody object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'accesses';
    yield serializers.serialize(
      object.accesses,
      specifiedType: const FullType(BuiltList, [FullType(DeletePartnerAssetAccessItem)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    DeletePartnerAssetAccessBody object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeletePartnerAssetAccessBodyBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'accesses':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(DeletePartnerAssetAccessItem)]),
          ) as BuiltList<DeletePartnerAssetAccessItem>;
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
  DeletePartnerAssetAccessBody deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeletePartnerAssetAccessBodyBuilder();
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

