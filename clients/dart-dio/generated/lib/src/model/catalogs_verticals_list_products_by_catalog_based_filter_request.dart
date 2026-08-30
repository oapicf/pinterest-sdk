//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_retail_list_products_by_catalog_based_filter_request.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/catalogs_locale.dart';
import 'package:openapi/src/model/catalogs_creative_assets_list_products_by_catalog_based_filter_request.dart';
import 'package:openapi/src/model/catalogs_creative_assets_product_group_filters.dart';
import 'package:openapi/src/model/catalogs_hotel_list_products_by_catalog_based_filter_request.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_verticals_list_products_by_catalog_based_filter_request.g.dart';

/// Request object to list products for a given catalog_id and product group filter.
///
/// Properties:
/// * [catalogId] - Catalog ID pertaining to the product group.
/// * [catalogType] 
/// * [country] 
/// * [filters] 
/// * [locale] 
@BuiltValue()
abstract class CatalogsVerticalsListProductsByCatalogBasedFilterRequest implements Built<CatalogsVerticalsListProductsByCatalogBasedFilterRequest, CatalogsVerticalsListProductsByCatalogBasedFilterRequestBuilder> {
  /// One Of [CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest], [CatalogsHotelListProductsByCatalogBasedFilterRequest], [CatalogsRetailListProductsByCatalogBasedFilterRequest]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'catalog_type';

  static const Map<String, Type> discriminatorMapping = {
    r'CREATIVE_ASSETS': CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest,
    r'HOTEL': CatalogsHotelListProductsByCatalogBasedFilterRequest,
    r'RETAIL': CatalogsRetailListProductsByCatalogBasedFilterRequest,
  };

  CatalogsVerticalsListProductsByCatalogBasedFilterRequest._();

  factory CatalogsVerticalsListProductsByCatalogBasedFilterRequest([void updates(CatalogsVerticalsListProductsByCatalogBasedFilterRequestBuilder b)]) = _$CatalogsVerticalsListProductsByCatalogBasedFilterRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsVerticalsListProductsByCatalogBasedFilterRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsVerticalsListProductsByCatalogBasedFilterRequest> get serializer => _$CatalogsVerticalsListProductsByCatalogBasedFilterRequestSerializer();
}

extension CatalogsVerticalsListProductsByCatalogBasedFilterRequestDiscriminatorExt on CatalogsVerticalsListProductsByCatalogBasedFilterRequest {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelListProductsByCatalogBasedFilterRequest) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailListProductsByCatalogBasedFilterRequest) {
            return r'RETAIL';
        }
        return null;
    }
}
extension CatalogsVerticalsListProductsByCatalogBasedFilterRequestBuilderDiscriminatorExt on CatalogsVerticalsListProductsByCatalogBasedFilterRequestBuilder {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestBuilder) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelListProductsByCatalogBasedFilterRequestBuilder) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailListProductsByCatalogBasedFilterRequestBuilder) {
            return r'RETAIL';
        }
        return null;
    }
}

class _$CatalogsVerticalsListProductsByCatalogBasedFilterRequestSerializer implements PrimitiveSerializer<CatalogsVerticalsListProductsByCatalogBasedFilterRequest> {
  @override
  final Iterable<Type> types = const [CatalogsVerticalsListProductsByCatalogBasedFilterRequest, _$CatalogsVerticalsListProductsByCatalogBasedFilterRequest];

  @override
  final String wireName = r'CatalogsVerticalsListProductsByCatalogBasedFilterRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsVerticalsListProductsByCatalogBasedFilterRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsVerticalsListProductsByCatalogBasedFilterRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsVerticalsListProductsByCatalogBasedFilterRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsVerticalsListProductsByCatalogBasedFilterRequestBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsVerticalsListProductsByCatalogBasedFilterRequest.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest, CatalogsHotelListProductsByCatalogBasedFilterRequest, CatalogsRetailListProductsByCatalogBasedFilterRequest, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'CREATIVE_ASSETS':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest),
        ) as CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest;
        oneOfType = CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest;
        break;
      case r'HOTEL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsHotelListProductsByCatalogBasedFilterRequest),
        ) as CatalogsHotelListProductsByCatalogBasedFilterRequest;
        oneOfType = CatalogsHotelListProductsByCatalogBasedFilterRequest;
        break;
      case r'RETAIL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsRetailListProductsByCatalogBasedFilterRequest),
        ) as CatalogsRetailListProductsByCatalogBasedFilterRequest;
        oneOfType = CatalogsRetailListProductsByCatalogBasedFilterRequest;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

class CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum CREATIVE_ASSETS = _$catalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum> get serializer => _$catalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnumSerializer;

  const CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum> get values => _$catalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnumValues;
  static CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum valueOf(String name) => _$catalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnumValueOf(name);
}

