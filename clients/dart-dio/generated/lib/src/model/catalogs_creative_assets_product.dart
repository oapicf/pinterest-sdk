//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_creative_assets_product_metadata.dart';
import 'package:openapi/src/model/pin.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_creative_assets_product.g.dart';

/// CatalogsCreativeAssetsProduct
///
/// Properties:
/// * [catalogType] 
/// * [metadata] 
/// * [pin] 
@BuiltValue()
abstract class CatalogsCreativeAssetsProduct implements Built<CatalogsCreativeAssetsProduct, CatalogsCreativeAssetsProductBuilder> {
  @BuiltValueField(wireName: r'catalog_type')
  CatalogsCreativeAssetsProductCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  CREATIVE_ASSETS,  };

  @BuiltValueField(wireName: r'metadata')
  CatalogsCreativeAssetsProductMetadata get metadata;

  @BuiltValueField(wireName: r'pin')
  Pin get pin;

  CatalogsCreativeAssetsProduct._();

  factory CatalogsCreativeAssetsProduct([void updates(CatalogsCreativeAssetsProductBuilder b)]) = _$CatalogsCreativeAssetsProduct;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreativeAssetsProductBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreativeAssetsProduct> get serializer => _$CatalogsCreativeAssetsProductSerializer();
}

class _$CatalogsCreativeAssetsProductSerializer implements PrimitiveSerializer<CatalogsCreativeAssetsProduct> {
  @override
  final Iterable<Type> types = const [CatalogsCreativeAssetsProduct, _$CatalogsCreativeAssetsProduct];

  @override
  final String wireName = r'CatalogsCreativeAssetsProduct';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreativeAssetsProduct object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsCreativeAssetsProductCatalogTypeEnum),
    );
    yield r'metadata';
    yield serializers.serialize(
      object.metadata,
      specifiedType: const FullType(CatalogsCreativeAssetsProductMetadata),
    );
    yield r'pin';
    yield serializers.serialize(
      object.pin,
      specifiedType: const FullType(Pin),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsCreativeAssetsProduct object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsCreativeAssetsProductBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsCreativeAssetsProductCatalogTypeEnum),
          ) as CatalogsCreativeAssetsProductCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsCreativeAssetsProductMetadata),
          ) as CatalogsCreativeAssetsProductMetadata;
          result.metadata.replace(valueDes);
          break;
        case r'pin':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Pin),
          ) as Pin;
          result.pin.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsCreativeAssetsProduct deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreativeAssetsProductBuilder();
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

class CatalogsCreativeAssetsProductCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsCreativeAssetsProductCatalogTypeEnum CREATIVE_ASSETS = _$catalogsCreativeAssetsProductCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsCreativeAssetsProductCatalogTypeEnum> get serializer => _$catalogsCreativeAssetsProductCatalogTypeEnumSerializer;

  const CatalogsCreativeAssetsProductCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsCreativeAssetsProductCatalogTypeEnum> get values => _$catalogsCreativeAssetsProductCatalogTypeEnumValues;
  static CatalogsCreativeAssetsProductCatalogTypeEnum valueOf(String name) => _$catalogsCreativeAssetsProductCatalogTypeEnumValueOf(name);
}

