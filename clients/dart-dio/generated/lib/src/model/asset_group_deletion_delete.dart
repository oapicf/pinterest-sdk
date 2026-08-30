//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'asset_group_deletion_delete.g.dart';

/// AssetGroupDeletionDelete
///
/// Properties:
/// * [assetGroupsToDelete] 
@BuiltValue()
abstract class AssetGroupDeletionDelete implements Built<AssetGroupDeletionDelete, AssetGroupDeletionDeleteBuilder> {
  @BuiltValueField(wireName: r'asset_groups_to_delete')
  BuiltList<String> get assetGroupsToDelete;

  AssetGroupDeletionDelete._();

  factory AssetGroupDeletionDelete([void updates(AssetGroupDeletionDeleteBuilder b)]) = _$AssetGroupDeletionDelete;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssetGroupDeletionDeleteBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AssetGroupDeletionDelete> get serializer => _$AssetGroupDeletionDeleteSerializer();
}

class _$AssetGroupDeletionDeleteSerializer implements PrimitiveSerializer<AssetGroupDeletionDelete> {
  @override
  final Iterable<Type> types = const [AssetGroupDeletionDelete, _$AssetGroupDeletionDelete];

  @override
  final String wireName = r'AssetGroupDeletionDelete';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssetGroupDeletionDelete object, {
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
    AssetGroupDeletionDelete object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AssetGroupDeletionDeleteBuilder result,
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
  AssetGroupDeletionDelete deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssetGroupDeletionDeleteBuilder();
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

