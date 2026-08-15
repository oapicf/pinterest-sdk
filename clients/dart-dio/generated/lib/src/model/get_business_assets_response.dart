//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/get_business_assets_response_catalog_info.dart';
import 'package:openapi/src/model/asset_group_binding.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'get_business_assets_response.g.dart';

/// An object containing the permissions a business has on the asset.
///
/// Properties:
/// * [assetGroupInfo] 
/// * [assetId] - Unique identifier of a business asset.
/// * [assetType] - Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
/// * [catalogInfo] 
@BuiltValue()
abstract class GetBusinessAssetsResponse implements Built<GetBusinessAssetsResponse, GetBusinessAssetsResponseBuilder> {
  @BuiltValueField(wireName: r'asset_group_info')
  AssetGroupBinding? get assetGroupInfo;

  /// Unique identifier of a business asset.
  @BuiltValueField(wireName: r'asset_id')
  String? get assetId;

  /// Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
  @BuiltValueField(wireName: r'asset_type')
  String? get assetType;

  @BuiltValueField(wireName: r'catalog_info')
  GetBusinessAssetsResponseCatalogInfo? get catalogInfo;

  GetBusinessAssetsResponse._();

  factory GetBusinessAssetsResponse([void updates(GetBusinessAssetsResponseBuilder b)]) = _$GetBusinessAssetsResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(GetBusinessAssetsResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<GetBusinessAssetsResponse> get serializer => _$GetBusinessAssetsResponseSerializer();
}

class _$GetBusinessAssetsResponseSerializer implements PrimitiveSerializer<GetBusinessAssetsResponse> {
  @override
  final Iterable<Type> types = const [GetBusinessAssetsResponse, _$GetBusinessAssetsResponse];

  @override
  final String wireName = r'GetBusinessAssetsResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    GetBusinessAssetsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.assetGroupInfo != null) {
      yield r'asset_group_info';
      yield serializers.serialize(
        object.assetGroupInfo,
        specifiedType: const FullType(AssetGroupBinding),
      );
    }
    if (object.assetId != null) {
      yield r'asset_id';
      yield serializers.serialize(
        object.assetId,
        specifiedType: const FullType(String),
      );
    }
    if (object.assetType != null) {
      yield r'asset_type';
      yield serializers.serialize(
        object.assetType,
        specifiedType: const FullType(String),
      );
    }
    if (object.catalogInfo != null) {
      yield r'catalog_info';
      yield serializers.serialize(
        object.catalogInfo,
        specifiedType: const FullType.nullable(GetBusinessAssetsResponseCatalogInfo),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    GetBusinessAssetsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required GetBusinessAssetsResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'asset_group_info':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AssetGroupBinding),
          ) as AssetGroupBinding;
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
            specifiedType: const FullType(String),
          ) as String;
          result.assetType = valueDes;
          break;
        case r'catalog_info':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(GetBusinessAssetsResponseCatalogInfo),
          ) as GetBusinessAssetsResponseCatalogInfo?;
          if (valueDes == null) continue;
          result.catalogInfo.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  GetBusinessAssetsResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = GetBusinessAssetsResponseBuilder();
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

