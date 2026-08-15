//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_hotel_product_metadata.dart';
import 'package:openapi/src/model/pin.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_product.g.dart';

/// CatalogsHotelProduct
///
/// Properties:
/// * [catalogType] 
/// * [metadata] 
/// * [pin] 
@BuiltValue()
abstract class CatalogsHotelProduct implements Built<CatalogsHotelProduct, CatalogsHotelProductBuilder> {
  @BuiltValueField(wireName: r'catalog_type')
  CatalogsHotelProductCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  HOTEL,  };

  @BuiltValueField(wireName: r'metadata')
  CatalogsHotelProductMetadata get metadata;

  @BuiltValueField(wireName: r'pin')
  Pin get pin;

  CatalogsHotelProduct._();

  factory CatalogsHotelProduct([void updates(CatalogsHotelProductBuilder b)]) = _$CatalogsHotelProduct;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelProductBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelProduct> get serializer => _$CatalogsHotelProductSerializer();
}

class _$CatalogsHotelProductSerializer implements PrimitiveSerializer<CatalogsHotelProduct> {
  @override
  final Iterable<Type> types = const [CatalogsHotelProduct, _$CatalogsHotelProduct];

  @override
  final String wireName = r'CatalogsHotelProduct';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelProduct object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsHotelProductCatalogTypeEnum),
    );
    yield r'metadata';
    yield serializers.serialize(
      object.metadata,
      specifiedType: const FullType(CatalogsHotelProductMetadata),
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
    CatalogsHotelProduct object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelProductBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsHotelProductCatalogTypeEnum),
          ) as CatalogsHotelProductCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsHotelProductMetadata),
          ) as CatalogsHotelProductMetadata;
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
  CatalogsHotelProduct deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelProductBuilder();
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

class CatalogsHotelProductCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'HOTEL')
  static const CatalogsHotelProductCatalogTypeEnum HOTEL = _$catalogsHotelProductCatalogTypeEnum_HOTEL;

  static Serializer<CatalogsHotelProductCatalogTypeEnum> get serializer => _$catalogsHotelProductCatalogTypeEnumSerializer;

  const CatalogsHotelProductCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsHotelProductCatalogTypeEnum> get values => _$catalogsHotelProductCatalogTypeEnumValues;
  static CatalogsHotelProductCatalogTypeEnum valueOf(String name) => _$catalogsHotelProductCatalogTypeEnumValueOf(name);
}

