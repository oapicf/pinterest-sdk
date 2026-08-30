//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/asset_group_type.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'asset_group_update_item_read_or_update_item.g.dart';

/// AssetGroupUpdateItemReadOrUpdateItem
///
/// Properties:
/// * [assetGroupId] - Unique identifier of the asset group to update.
/// * [assetGroupTypes] - Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
/// * [assetsToAdd] - A list of asset ids to add to the asset group.
/// * [assetsToRemove] - A list of asset ids to remove from the asset group.
/// * [description] - Asset group description.
/// * [name] - Asset Group name.
@BuiltValue()
abstract class AssetGroupUpdateItemReadOrUpdateItem implements Built<AssetGroupUpdateItemReadOrUpdateItem, AssetGroupUpdateItemReadOrUpdateItemBuilder> {
  /// Unique identifier of the asset group to update.
  @BuiltValueField(wireName: r'asset_group_id')
  String get assetGroupId;

  /// Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
  @BuiltValueField(wireName: r'asset_group_types')
  BuiltList<AssetGroupType>? get assetGroupTypes;

  /// A list of asset ids to add to the asset group.
  @BuiltValueField(wireName: r'assets_to_add')
  BuiltList<String>? get assetsToAdd;

  /// A list of asset ids to remove from the asset group.
  @BuiltValueField(wireName: r'assets_to_remove')
  BuiltList<String>? get assetsToRemove;

  /// Asset group description.
  @BuiltValueField(wireName: r'description')
  String? get description;

  /// Asset Group name.
  @BuiltValueField(wireName: r'name')
  String? get name;

  AssetGroupUpdateItemReadOrUpdateItem._();

  factory AssetGroupUpdateItemReadOrUpdateItem([void updates(AssetGroupUpdateItemReadOrUpdateItemBuilder b)]) = _$AssetGroupUpdateItemReadOrUpdateItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssetGroupUpdateItemReadOrUpdateItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AssetGroupUpdateItemReadOrUpdateItem> get serializer => _$AssetGroupUpdateItemReadOrUpdateItemSerializer();
}

class _$AssetGroupUpdateItemReadOrUpdateItemSerializer implements PrimitiveSerializer<AssetGroupUpdateItemReadOrUpdateItem> {
  @override
  final Iterable<Type> types = const [AssetGroupUpdateItemReadOrUpdateItem, _$AssetGroupUpdateItemReadOrUpdateItem];

  @override
  final String wireName = r'AssetGroupUpdateItemReadOrUpdateItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssetGroupUpdateItemReadOrUpdateItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'asset_group_id';
    yield serializers.serialize(
      object.assetGroupId,
      specifiedType: const FullType(String),
    );
    if (object.assetGroupTypes != null) {
      yield r'asset_group_types';
      yield serializers.serialize(
        object.assetGroupTypes,
        specifiedType: const FullType(BuiltList, [FullType(AssetGroupType)]),
      );
    }
    if (object.assetsToAdd != null) {
      yield r'assets_to_add';
      yield serializers.serialize(
        object.assetsToAdd,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.assetsToRemove != null) {
      yield r'assets_to_remove';
      yield serializers.serialize(
        object.assetsToRemove,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AssetGroupUpdateItemReadOrUpdateItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AssetGroupUpdateItemReadOrUpdateItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'asset_group_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.assetGroupId = valueDes;
          break;
        case r'asset_group_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AssetGroupType)]),
          ) as BuiltList<AssetGroupType>?;
          if (valueDes == null) continue;
          result.assetGroupTypes.replace(valueDes);
          break;
        case r'assets_to_add':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.assetsToAdd.replace(valueDes);
          break;
        case r'assets_to_remove':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.assetsToRemove.replace(valueDes);
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AssetGroupUpdateItemReadOrUpdateItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssetGroupUpdateItemReadOrUpdateItemBuilder();
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

