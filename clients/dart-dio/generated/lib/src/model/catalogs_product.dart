//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_hotel_product.dart';
import 'package:openapi/src/model/catalogs_creative_assets_product_metadata.dart';
import 'package:openapi/src/model/pin.dart';
import 'package:openapi/src/model/catalogs_creative_assets_product.dart';
import 'package:openapi/src/model/catalogs_retail_product.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_product.g.dart';

/// CatalogsProduct
///
/// Properties:
/// * [catalogType] 
/// * [metadata] 
/// * [pin] 
@BuiltValue()
abstract class CatalogsProduct implements Built<CatalogsProduct, CatalogsProductBuilder> {
  /// One Of [CatalogsCreativeAssetsProduct], [CatalogsHotelProduct], [CatalogsRetailProduct]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'catalog_type';

  static const Map<String, Type> discriminatorMapping = {
    r'CREATIVE_ASSETS': CatalogsCreativeAssetsProduct,
    r'HOTEL': CatalogsHotelProduct,
    r'RETAIL': CatalogsRetailProduct,
  };

  CatalogsProduct._();

  factory CatalogsProduct([void updates(CatalogsProductBuilder b)]) = _$CatalogsProduct;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProduct> get serializer => _$CatalogsProductSerializer();
}

extension CatalogsProductDiscriminatorExt on CatalogsProduct {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsProduct) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelProduct) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailProduct) {
            return r'RETAIL';
        }
        return null;
    }
}
extension CatalogsProductBuilderDiscriminatorExt on CatalogsProductBuilder {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsProductBuilder) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelProductBuilder) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailProductBuilder) {
            return r'RETAIL';
        }
        return null;
    }
}

class _$CatalogsProductSerializer implements PrimitiveSerializer<CatalogsProduct> {
  @override
  final Iterable<Type> types = const [CatalogsProduct, _$CatalogsProduct];

  @override
  final String wireName = r'CatalogsProduct';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProduct object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProduct object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsProduct deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsProduct.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsCreativeAssetsProduct, CatalogsHotelProduct, CatalogsRetailProduct, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'CREATIVE_ASSETS':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsCreativeAssetsProduct),
        ) as CatalogsCreativeAssetsProduct;
        oneOfType = CatalogsCreativeAssetsProduct;
        break;
      case r'HOTEL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsHotelProduct),
        ) as CatalogsHotelProduct;
        oneOfType = CatalogsHotelProduct;
        break;
      case r'RETAIL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsRetailProduct),
        ) as CatalogsRetailProduct;
        oneOfType = CatalogsRetailProduct;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

class CatalogsProductCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsProductCatalogTypeEnum CREATIVE_ASSETS = _$catalogsProductCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsProductCatalogTypeEnum> get serializer => _$catalogsProductCatalogTypeEnumSerializer;

  const CatalogsProductCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsProductCatalogTypeEnum> get values => _$catalogsProductCatalogTypeEnumValues;
  static CatalogsProductCatalogTypeEnum valueOf(String name) => _$catalogsProductCatalogTypeEnumValueOf(name);
}

