//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_hotel_product_group_create_request.dart';
import 'package:openapi/src/model/catalogs_retail_product_group_create_request.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_creative_assets_product_group_create_request.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/catalogs_locale.dart';
import 'package:openapi/src/model/catalogs_creative_assets_product_group_filters.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_vertical_product_group_create_request.g.dart';

/// Request object for creating a catalog based product group.
///
/// Properties:
/// * [catalogId] - Catalog ID pertaining to the product group.
/// * [catalogType] 
/// * [country] 
/// * [description] 
/// * [filters] 
/// * [locale] 
/// * [name] 
@BuiltValue()
abstract class CatalogsVerticalProductGroupCreateRequest implements Built<CatalogsVerticalProductGroupCreateRequest, CatalogsVerticalProductGroupCreateRequestBuilder> {
  /// One Of [CatalogsCreativeAssetsProductGroupCreateRequest], [CatalogsHotelProductGroupCreateRequest], [CatalogsRetailProductGroupCreateRequest]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'catalog_type';

  static const Map<String, Type> discriminatorMapping = {
    r'CREATIVE_ASSETS': CatalogsCreativeAssetsProductGroupCreateRequest,
    r'HOTEL': CatalogsHotelProductGroupCreateRequest,
    r'RETAIL': CatalogsRetailProductGroupCreateRequest,
  };

  CatalogsVerticalProductGroupCreateRequest._();

  factory CatalogsVerticalProductGroupCreateRequest([void updates(CatalogsVerticalProductGroupCreateRequestBuilder b)]) = _$CatalogsVerticalProductGroupCreateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsVerticalProductGroupCreateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsVerticalProductGroupCreateRequest> get serializer => _$CatalogsVerticalProductGroupCreateRequestSerializer();
}

extension CatalogsVerticalProductGroupCreateRequestDiscriminatorExt on CatalogsVerticalProductGroupCreateRequest {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsProductGroupCreateRequest) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelProductGroupCreateRequest) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailProductGroupCreateRequest) {
            return r'RETAIL';
        }
        return null;
    }
}
extension CatalogsVerticalProductGroupCreateRequestBuilderDiscriminatorExt on CatalogsVerticalProductGroupCreateRequestBuilder {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsProductGroupCreateRequestBuilder) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelProductGroupCreateRequestBuilder) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailProductGroupCreateRequestBuilder) {
            return r'RETAIL';
        }
        return null;
    }
}

class _$CatalogsVerticalProductGroupCreateRequestSerializer implements PrimitiveSerializer<CatalogsVerticalProductGroupCreateRequest> {
  @override
  final Iterable<Type> types = const [CatalogsVerticalProductGroupCreateRequest, _$CatalogsVerticalProductGroupCreateRequest];

  @override
  final String wireName = r'CatalogsVerticalProductGroupCreateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsVerticalProductGroupCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsVerticalProductGroupCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsVerticalProductGroupCreateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsVerticalProductGroupCreateRequestBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsVerticalProductGroupCreateRequest.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsCreativeAssetsProductGroupCreateRequest, CatalogsHotelProductGroupCreateRequest, CatalogsRetailProductGroupCreateRequest, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'CREATIVE_ASSETS':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsCreativeAssetsProductGroupCreateRequest),
        ) as CatalogsCreativeAssetsProductGroupCreateRequest;
        oneOfType = CatalogsCreativeAssetsProductGroupCreateRequest;
        break;
      case r'HOTEL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsHotelProductGroupCreateRequest),
        ) as CatalogsHotelProductGroupCreateRequest;
        oneOfType = CatalogsHotelProductGroupCreateRequest;
        break;
      case r'RETAIL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsRetailProductGroupCreateRequest),
        ) as CatalogsRetailProductGroupCreateRequest;
        oneOfType = CatalogsRetailProductGroupCreateRequest;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

class CatalogsVerticalProductGroupCreateRequestCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsVerticalProductGroupCreateRequestCatalogTypeEnum CREATIVE_ASSETS = _$catalogsVerticalProductGroupCreateRequestCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsVerticalProductGroupCreateRequestCatalogTypeEnum> get serializer => _$catalogsVerticalProductGroupCreateRequestCatalogTypeEnumSerializer;

  const CatalogsVerticalProductGroupCreateRequestCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsVerticalProductGroupCreateRequestCatalogTypeEnum> get values => _$catalogsVerticalProductGroupCreateRequestCatalogTypeEnumValues;
  static CatalogsVerticalProductGroupCreateRequestCatalogTypeEnum valueOf(String name) => _$catalogsVerticalProductGroupCreateRequestCatalogTypeEnumValueOf(name);
}

