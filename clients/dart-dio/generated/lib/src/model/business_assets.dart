//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/base_business_assets.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/asset_group_binding.dart';
import 'package:openapi/src/model/catalog_binding.dart';
import 'package:openapi/src/model/asset_type_response.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'business_assets.g.dart';

/// BusinessAssets
///
/// Properties:
/// * [assetGroupInfo] - An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.
/// * [assetId] - Unique identifier of a business asset.
/// * [assetType] 
/// * [permissions] - Permission levels the requesting business has on an asset.
/// * [catalogInfo] - An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.
@BuiltValue()
abstract class BusinessAssets implements BaseBusinessAssets, Built<BusinessAssets, BusinessAssetsBuilder> {
  /// An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.
  @BuiltValueField(wireName: r'catalog_info')
  CatalogBinding? get catalogInfo;

  BusinessAssets._();

  factory BusinessAssets([void updates(BusinessAssetsBuilder b)]) = _$BusinessAssets;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BusinessAssetsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BusinessAssets> get serializer => _$BusinessAssetsSerializer();
}

class _$BusinessAssetsSerializer implements PrimitiveSerializer<BusinessAssets> {
  @override
  final Iterable<Type> types = const [BusinessAssets, _$BusinessAssets];

  @override
  final String wireName = r'BusinessAssets';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BusinessAssets object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.assetGroupInfo != null) {
      yield r'asset_group_info';
      yield serializers.serialize(
        object.assetGroupInfo,
        specifiedType: const FullType(AssetGroupBinding),
      );
    }
    if (object.catalogInfo != null) {
      yield r'catalog_info';
      yield serializers.serialize(
        object.catalogInfo,
        specifiedType: const FullType(CatalogBinding),
      );
    }
    if (object.assetId != null) {
      yield r'asset_id';
      yield serializers.serialize(
        object.assetId,
        specifiedType: const FullType(String),
      );
    }
    if (object.permissions != null) {
      yield r'permissions';
      yield serializers.serialize(
        object.permissions,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.assetType != null) {
      yield r'asset_type';
      yield serializers.serialize(
        object.assetType,
        specifiedType: const FullType(AssetTypeResponse),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BusinessAssets object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BusinessAssetsBuilder result,
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
        case r'catalog_info':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CatalogBinding),
          ) as CatalogBinding?;
          if (valueDes == null) continue;
          result.catalogInfo.replace(valueDes);
          break;
        case r'asset_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.assetId = valueDes;
          break;
        case r'permissions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.permissions.replace(valueDes);
          break;
        case r'asset_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AssetTypeResponse),
          ) as AssetTypeResponse?;
          if (valueDes == null) continue;
          result.assetType = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BusinessAssets deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BusinessAssetsBuilder();
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

