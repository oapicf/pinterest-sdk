//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/asset_group_delete_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'asset_group_deletion.g.dart';

/// AssetGroupDeletion
///
/// Properties:
/// * [deletedAssetGroups] 
/// * [exceptions] 
@BuiltValue()
abstract class AssetGroupDeletion implements Built<AssetGroupDeletion, AssetGroupDeletionBuilder> {
  @BuiltValueField(wireName: r'deleted_asset_groups')
  BuiltList<String>? get deletedAssetGroups;

  @BuiltValueField(wireName: r'exceptions')
  BuiltList<AssetGroupDeleteError>? get exceptions;

  AssetGroupDeletion._();

  factory AssetGroupDeletion([void updates(AssetGroupDeletionBuilder b)]) = _$AssetGroupDeletion;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssetGroupDeletionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AssetGroupDeletion> get serializer => _$AssetGroupDeletionSerializer();
}

class _$AssetGroupDeletionSerializer implements PrimitiveSerializer<AssetGroupDeletion> {
  @override
  final Iterable<Type> types = const [AssetGroupDeletion, _$AssetGroupDeletion];

  @override
  final String wireName = r'AssetGroupDeletion';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssetGroupDeletion object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.deletedAssetGroups != null) {
      yield r'deleted_asset_groups';
      yield serializers.serialize(
        object.deletedAssetGroups,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.exceptions != null) {
      yield r'exceptions';
      yield serializers.serialize(
        object.exceptions,
        specifiedType: const FullType.nullable(BuiltList, [FullType(AssetGroupDeleteError)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AssetGroupDeletion object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AssetGroupDeletionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'deleted_asset_groups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.deletedAssetGroups.replace(valueDes);
          break;
        case r'exceptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AssetGroupDeleteError)]),
          ) as BuiltList<AssetGroupDeleteError>?;
          if (valueDes == null) continue;
          result.exceptions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AssetGroupDeletion deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssetGroupDeletionBuilder();
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

