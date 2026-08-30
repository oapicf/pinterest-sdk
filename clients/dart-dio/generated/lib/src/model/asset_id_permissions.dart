//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/asset_group_binding.dart';
import 'package:openapi/src/model/asset_type_response.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'asset_id_permissions.g.dart';

/// An object containing the permissions a business member has on the asset.
///
/// Properties:
/// * [assetGroupInfo] - An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.
/// * [assetId] - Unique identifier of a business asset.
/// * [assetType] 
/// * [permissions] - Permission levels member or partner has on an asset.
@BuiltValue()
abstract class AssetIdPermissions implements Built<AssetIdPermissions, AssetIdPermissionsBuilder> {
  /// An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.
  @BuiltValueField(wireName: r'asset_group_info')
  AssetGroupBinding? get assetGroupInfo;

  /// Unique identifier of a business asset.
  @BuiltValueField(wireName: r'asset_id')
  String get assetId;

  @BuiltValueField(wireName: r'asset_type')
  AssetTypeResponse get assetType;
  // enum assetTypeEnum {  AD_ACCOUNT,  MERCHANT,  PROFILE,  ASSET_GROUP,  PINNER_LIST,  CONVERSION_TAG,  CATALOG,  CONVERSION_SEGMENT,  };

  /// Permission levels member or partner has on an asset.
  @BuiltValueField(wireName: r'permissions')
  BuiltList<String> get permissions;

  AssetIdPermissions._();

  factory AssetIdPermissions([void updates(AssetIdPermissionsBuilder b)]) = _$AssetIdPermissions;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssetIdPermissionsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AssetIdPermissions> get serializer => _$AssetIdPermissionsSerializer();
}

class _$AssetIdPermissionsSerializer implements PrimitiveSerializer<AssetIdPermissions> {
  @override
  final Iterable<Type> types = const [AssetIdPermissions, _$AssetIdPermissions];

  @override
  final String wireName = r'AssetIdPermissions';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssetIdPermissions object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.assetGroupInfo != null) {
      yield r'asset_group_info';
      yield serializers.serialize(
        object.assetGroupInfo,
        specifiedType: const FullType(AssetGroupBinding),
      );
    }
    yield r'asset_id';
    yield serializers.serialize(
      object.assetId,
      specifiedType: const FullType(String),
    );
    yield r'asset_type';
    yield serializers.serialize(
      object.assetType,
      specifiedType: const FullType(AssetTypeResponse),
    );
    yield r'permissions';
    yield serializers.serialize(
      object.permissions,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AssetIdPermissions object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AssetIdPermissionsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'asset_group_info':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AssetGroupBinding),
          ) as AssetGroupBinding?;
          if (valueDes == null) continue;
          result.assetGroupInfo.replace(valueDes);
          break;
        case r'asset_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.assetId = valueDes;
          break;
        case r'asset_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AssetTypeResponse),
          ) as AssetTypeResponse;
          result.assetType = valueDes;
          break;
        case r'permissions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.permissions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AssetIdPermissions deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssetIdPermissionsBuilder();
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

