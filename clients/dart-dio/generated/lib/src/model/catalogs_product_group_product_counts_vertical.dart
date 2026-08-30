//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_retail_product_group_product_counts.dart';
import 'package:openapi/src/model/catalogs_hotel_product_group_product_counts.dart';
import 'package:openapi/src/model/catalogs_creative_assets_product_group_product_counts.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_product_group_product_counts_vertical.g.dart';

/// Product counts for a CatalogsProductGroup
///
/// Properties:
/// * [catalogType] 
/// * [inStock] 
/// * [outOfStock] 
/// * [preorder] 
/// * [total] 
/// * [videos] 
/// * [appLinks] 
/// * [images] 
@BuiltValue()
abstract class CatalogsProductGroupProductCountsVertical implements Built<CatalogsProductGroupProductCountsVertical, CatalogsProductGroupProductCountsVerticalBuilder> {
  /// One Of [CatalogsCreativeAssetsProductGroupProductCounts], [CatalogsHotelProductGroupProductCounts], [CatalogsRetailProductGroupProductCounts]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'catalog_type';

  static const Map<String, Type> discriminatorMapping = {
    r'CREATIVE_ASSETS': CatalogsCreativeAssetsProductGroupProductCounts,
    r'HOTEL': CatalogsHotelProductGroupProductCounts,
    r'RETAIL': CatalogsRetailProductGroupProductCounts,
  };

  CatalogsProductGroupProductCountsVertical._();

  factory CatalogsProductGroupProductCountsVertical([void updates(CatalogsProductGroupProductCountsVerticalBuilder b)]) = _$CatalogsProductGroupProductCountsVertical;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupProductCountsVerticalBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupProductCountsVertical> get serializer => _$CatalogsProductGroupProductCountsVerticalSerializer();
}

extension CatalogsProductGroupProductCountsVerticalDiscriminatorExt on CatalogsProductGroupProductCountsVertical {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsProductGroupProductCounts) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelProductGroupProductCounts) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailProductGroupProductCounts) {
            return r'RETAIL';
        }
        return null;
    }
}
extension CatalogsProductGroupProductCountsVerticalBuilderDiscriminatorExt on CatalogsProductGroupProductCountsVerticalBuilder {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsProductGroupProductCountsBuilder) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelProductGroupProductCountsBuilder) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailProductGroupProductCountsBuilder) {
            return r'RETAIL';
        }
        return null;
    }
}

class _$CatalogsProductGroupProductCountsVerticalSerializer implements PrimitiveSerializer<CatalogsProductGroupProductCountsVertical> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupProductCountsVertical, _$CatalogsProductGroupProductCountsVertical];

  @override
  final String wireName = r'CatalogsProductGroupProductCountsVertical';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupProductCountsVertical object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupProductCountsVertical object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsProductGroupProductCountsVertical deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupProductCountsVerticalBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsProductGroupProductCountsVertical.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsCreativeAssetsProductGroupProductCounts, CatalogsHotelProductGroupProductCounts, CatalogsRetailProductGroupProductCounts, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'CREATIVE_ASSETS':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsCreativeAssetsProductGroupProductCounts),
        ) as CatalogsCreativeAssetsProductGroupProductCounts;
        oneOfType = CatalogsCreativeAssetsProductGroupProductCounts;
        break;
      case r'HOTEL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsHotelProductGroupProductCounts),
        ) as CatalogsHotelProductGroupProductCounts;
        oneOfType = CatalogsHotelProductGroupProductCounts;
        break;
      case r'RETAIL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsRetailProductGroupProductCounts),
        ) as CatalogsRetailProductGroupProductCounts;
        oneOfType = CatalogsRetailProductGroupProductCounts;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

class CatalogsProductGroupProductCountsVerticalCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsProductGroupProductCountsVerticalCatalogTypeEnum CREATIVE_ASSETS = _$catalogsProductGroupProductCountsVerticalCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsProductGroupProductCountsVerticalCatalogTypeEnum> get serializer => _$catalogsProductGroupProductCountsVerticalCatalogTypeEnumSerializer;

  const CatalogsProductGroupProductCountsVerticalCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsProductGroupProductCountsVerticalCatalogTypeEnum> get values => _$catalogsProductGroupProductCountsVerticalCatalogTypeEnumValues;
  static CatalogsProductGroupProductCountsVerticalCatalogTypeEnum valueOf(String name) => _$catalogsProductGroupProductCountsVerticalCatalogTypeEnumValueOf(name);
}

