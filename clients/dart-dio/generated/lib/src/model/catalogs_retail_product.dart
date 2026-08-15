//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pin.dart';
import 'package:openapi/src/model/catalogs_retail_product_metadata.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_retail_product.g.dart';

/// CatalogsRetailProduct
///
/// Properties:
/// * [catalogType] 
/// * [metadata] 
/// * [pin] 
@BuiltValue()
abstract class CatalogsRetailProduct implements Built<CatalogsRetailProduct, CatalogsRetailProductBuilder> {
  @BuiltValueField(wireName: r'catalog_type')
  CatalogsRetailProductCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  RETAIL,  };

  @BuiltValueField(wireName: r'metadata')
  CatalogsRetailProductMetadata get metadata;

  @BuiltValueField(wireName: r'pin')
  Pin get pin;

  CatalogsRetailProduct._();

  factory CatalogsRetailProduct([void updates(CatalogsRetailProductBuilder b)]) = _$CatalogsRetailProduct;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsRetailProductBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsRetailProduct> get serializer => _$CatalogsRetailProductSerializer();
}

class _$CatalogsRetailProductSerializer implements PrimitiveSerializer<CatalogsRetailProduct> {
  @override
  final Iterable<Type> types = const [CatalogsRetailProduct, _$CatalogsRetailProduct];

  @override
  final String wireName = r'CatalogsRetailProduct';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsRetailProduct object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsRetailProductCatalogTypeEnum),
    );
    yield r'metadata';
    yield serializers.serialize(
      object.metadata,
      specifiedType: const FullType(CatalogsRetailProductMetadata),
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
    CatalogsRetailProduct object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsRetailProductBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsRetailProductCatalogTypeEnum),
          ) as CatalogsRetailProductCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsRetailProductMetadata),
          ) as CatalogsRetailProductMetadata;
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
  CatalogsRetailProduct deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsRetailProductBuilder();
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

class CatalogsRetailProductCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'RETAIL')
  static const CatalogsRetailProductCatalogTypeEnum RETAIL = _$catalogsRetailProductCatalogTypeEnum_RETAIL;

  static Serializer<CatalogsRetailProductCatalogTypeEnum> get serializer => _$catalogsRetailProductCatalogTypeEnumSerializer;

  const CatalogsRetailProductCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsRetailProductCatalogTypeEnum> get values => _$catalogsRetailProductCatalogTypeEnumValues;
  static CatalogsRetailProductCatalogTypeEnum valueOf(String name) => _$catalogsRetailProductCatalogTypeEnumValueOf(name);
}

