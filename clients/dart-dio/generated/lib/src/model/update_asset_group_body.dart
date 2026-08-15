//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/update_asset_group_body_asset_groups_to_update_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'update_asset_group_body.g.dart';

/// UpdateAssetGroupBody
///
/// Properties:
/// * [assetGroupsToUpdate] - A list of asset groups and the data that will be used to update them.
@BuiltValue()
abstract class UpdateAssetGroupBody implements Built<UpdateAssetGroupBody, UpdateAssetGroupBodyBuilder> {
  /// A list of asset groups and the data that will be used to update them.
  @BuiltValueField(wireName: r'asset_groups_to_update')
  BuiltList<UpdateAssetGroupBodyAssetGroupsToUpdateInner>? get assetGroupsToUpdate;

  UpdateAssetGroupBody._();

  factory UpdateAssetGroupBody([void updates(UpdateAssetGroupBodyBuilder b)]) = _$UpdateAssetGroupBody;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UpdateAssetGroupBodyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UpdateAssetGroupBody> get serializer => _$UpdateAssetGroupBodySerializer();
}

class _$UpdateAssetGroupBodySerializer implements PrimitiveSerializer<UpdateAssetGroupBody> {
  @override
  final Iterable<Type> types = const [UpdateAssetGroupBody, _$UpdateAssetGroupBody];

  @override
  final String wireName = r'UpdateAssetGroupBody';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UpdateAssetGroupBody object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.assetGroupsToUpdate != null) {
      yield r'asset_groups_to_update';
      yield serializers.serialize(
        object.assetGroupsToUpdate,
        specifiedType: const FullType(BuiltList, [FullType(UpdateAssetGroupBodyAssetGroupsToUpdateInner)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    UpdateAssetGroupBody object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UpdateAssetGroupBodyBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'asset_groups_to_update':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(UpdateAssetGroupBodyAssetGroupsToUpdateInner)]),
          ) as BuiltList<UpdateAssetGroupBodyAssetGroupsToUpdateInner>;
          result.assetGroupsToUpdate.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  UpdateAssetGroupBody deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UpdateAssetGroupBodyBuilder();
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

