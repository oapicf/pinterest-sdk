//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/asset_group_type.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'update_asset_group_body_asset_groups_to_update_inner.g.dart';

/// UpdateAssetGroupBodyAssetGroupsToUpdateInner
///
/// Properties:
/// * [assetGroupId] - Unique identifier of the asset group to update.
/// * [assetGroupTypes] - Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
/// * [assetsToAdd] - A list of asset ids to add to the asset group.
/// * [assetsToRemove] - A list of asset ids to remove from the asset group.
/// * [description] - Asset group description
/// * [name] - Asset Group name
@BuiltValue()
abstract class UpdateAssetGroupBodyAssetGroupsToUpdateInner implements Built<UpdateAssetGroupBodyAssetGroupsToUpdateInner, UpdateAssetGroupBodyAssetGroupsToUpdateInnerBuilder> {
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

  /// Asset group description
  @BuiltValueField(wireName: r'description')
  String? get description;

  /// Asset Group name
  @BuiltValueField(wireName: r'name')
  String? get name;

  UpdateAssetGroupBodyAssetGroupsToUpdateInner._();

  factory UpdateAssetGroupBodyAssetGroupsToUpdateInner([void updates(UpdateAssetGroupBodyAssetGroupsToUpdateInnerBuilder b)]) = _$UpdateAssetGroupBodyAssetGroupsToUpdateInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UpdateAssetGroupBodyAssetGroupsToUpdateInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UpdateAssetGroupBodyAssetGroupsToUpdateInner> get serializer => _$UpdateAssetGroupBodyAssetGroupsToUpdateInnerSerializer();
}

class _$UpdateAssetGroupBodyAssetGroupsToUpdateInnerSerializer implements PrimitiveSerializer<UpdateAssetGroupBodyAssetGroupsToUpdateInner> {
  @override
  final Iterable<Type> types = const [UpdateAssetGroupBodyAssetGroupsToUpdateInner, _$UpdateAssetGroupBodyAssetGroupsToUpdateInner];

  @override
  final String wireName = r'UpdateAssetGroupBodyAssetGroupsToUpdateInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UpdateAssetGroupBodyAssetGroupsToUpdateInner object, {
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
    UpdateAssetGroupBodyAssetGroupsToUpdateInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UpdateAssetGroupBodyAssetGroupsToUpdateInnerBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(AssetGroupType)]),
          ) as BuiltList<AssetGroupType>;
          result.assetGroupTypes.replace(valueDes);
          break;
        case r'assets_to_add':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.assetsToAdd.replace(valueDes);
          break;
        case r'assets_to_remove':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.assetsToRemove.replace(valueDes);
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.description = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
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
  UpdateAssetGroupBodyAssetGroupsToUpdateInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UpdateAssetGroupBodyAssetGroupsToUpdateInnerBuilder();
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

