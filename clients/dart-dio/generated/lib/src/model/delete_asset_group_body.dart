//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_asset_group_body.g.dart';

/// Request body used to delete asset groups
///
/// Properties:
/// * [assetGroupsToDelete] - List of ids of asset groups to be deleted
@BuiltValue()
abstract class DeleteAssetGroupBody implements Built<DeleteAssetGroupBody, DeleteAssetGroupBodyBuilder> {
  /// List of ids of asset groups to be deleted
  @BuiltValueField(wireName: r'asset_groups_to_delete')
  BuiltList<String> get assetGroupsToDelete;

  DeleteAssetGroupBody._();

  factory DeleteAssetGroupBody([void updates(DeleteAssetGroupBodyBuilder b)]) = _$DeleteAssetGroupBody;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeleteAssetGroupBodyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeleteAssetGroupBody> get serializer => _$DeleteAssetGroupBodySerializer();
}

class _$DeleteAssetGroupBodySerializer implements PrimitiveSerializer<DeleteAssetGroupBody> {
  @override
  final Iterable<Type> types = const [DeleteAssetGroupBody, _$DeleteAssetGroupBody];

  @override
  final String wireName = r'DeleteAssetGroupBody';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeleteAssetGroupBody object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'asset_groups_to_delete';
    yield serializers.serialize(
      object.assetGroupsToDelete,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    DeleteAssetGroupBody object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeleteAssetGroupBodyBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'asset_groups_to_delete':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.assetGroupsToDelete.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  DeleteAssetGroupBody deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeleteAssetGroupBodyBuilder();
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

