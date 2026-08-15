//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/catalogs_locale.dart';
import 'package:openapi/src/model/catalogs_creative_assets_product_group_update_request.dart';
import 'package:openapi/src/model/catalogs_hotel_product_group_update_request.dart';
import 'package:openapi/src/model/catalogs_retail_product_group_update_request.dart';
import 'package:openapi/src/model/catalogs_creative_assets_product_group_filters.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_vertical_product_group_update_request.g.dart';

/// Request object for updating a catalog based product group.
///
/// Properties:
/// * [catalogType] 
/// * [country] 
/// * [description] 
/// * [filters] 
/// * [locale] 
/// * [name] 
@BuiltValue()
abstract class CatalogsVerticalProductGroupUpdateRequest implements Built<CatalogsVerticalProductGroupUpdateRequest, CatalogsVerticalProductGroupUpdateRequestBuilder> {
  /// One Of [CatalogsCreativeAssetsProductGroupUpdateRequest], [CatalogsHotelProductGroupUpdateRequest], [CatalogsRetailProductGroupUpdateRequest]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'catalog_type';

  static const Map<String, Type> discriminatorMapping = {
    r'CREATIVE_ASSETS': CatalogsCreativeAssetsProductGroupUpdateRequest,
    r'HOTEL': CatalogsHotelProductGroupUpdateRequest,
    r'RETAIL': CatalogsRetailProductGroupUpdateRequest,
  };

  CatalogsVerticalProductGroupUpdateRequest._();

  factory CatalogsVerticalProductGroupUpdateRequest([void updates(CatalogsVerticalProductGroupUpdateRequestBuilder b)]) = _$CatalogsVerticalProductGroupUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsVerticalProductGroupUpdateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsVerticalProductGroupUpdateRequest> get serializer => _$CatalogsVerticalProductGroupUpdateRequestSerializer();
}

extension CatalogsVerticalProductGroupUpdateRequestDiscriminatorExt on CatalogsVerticalProductGroupUpdateRequest {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsProductGroupUpdateRequest) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelProductGroupUpdateRequest) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailProductGroupUpdateRequest) {
            return r'RETAIL';
        }
        return null;
    }
}
extension CatalogsVerticalProductGroupUpdateRequestBuilderDiscriminatorExt on CatalogsVerticalProductGroupUpdateRequestBuilder {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsProductGroupUpdateRequestBuilder) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelProductGroupUpdateRequestBuilder) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailProductGroupUpdateRequestBuilder) {
            return r'RETAIL';
        }
        return null;
    }
}

class _$CatalogsVerticalProductGroupUpdateRequestSerializer implements PrimitiveSerializer<CatalogsVerticalProductGroupUpdateRequest> {
  @override
  final Iterable<Type> types = const [CatalogsVerticalProductGroupUpdateRequest, _$CatalogsVerticalProductGroupUpdateRequest];

  @override
  final String wireName = r'CatalogsVerticalProductGroupUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsVerticalProductGroupUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsVerticalProductGroupUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsVerticalProductGroupUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsVerticalProductGroupUpdateRequestBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsVerticalProductGroupUpdateRequest.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsCreativeAssetsProductGroupUpdateRequest, CatalogsHotelProductGroupUpdateRequest, CatalogsRetailProductGroupUpdateRequest, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'CREATIVE_ASSETS':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsCreativeAssetsProductGroupUpdateRequest),
        ) as CatalogsCreativeAssetsProductGroupUpdateRequest;
        oneOfType = CatalogsCreativeAssetsProductGroupUpdateRequest;
        break;
      case r'HOTEL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsHotelProductGroupUpdateRequest),
        ) as CatalogsHotelProductGroupUpdateRequest;
        oneOfType = CatalogsHotelProductGroupUpdateRequest;
        break;
      case r'RETAIL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsRetailProductGroupUpdateRequest),
        ) as CatalogsRetailProductGroupUpdateRequest;
        oneOfType = CatalogsRetailProductGroupUpdateRequest;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

class CatalogsVerticalProductGroupUpdateRequestCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsVerticalProductGroupUpdateRequestCatalogTypeEnum CREATIVE_ASSETS = _$catalogsVerticalProductGroupUpdateRequestCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsVerticalProductGroupUpdateRequestCatalogTypeEnum> get serializer => _$catalogsVerticalProductGroupUpdateRequestCatalogTypeEnumSerializer;

  const CatalogsVerticalProductGroupUpdateRequestCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsVerticalProductGroupUpdateRequestCatalogTypeEnum> get values => _$catalogsVerticalProductGroupUpdateRequestCatalogTypeEnumValues;
  static CatalogsVerticalProductGroupUpdateRequestCatalogTypeEnum valueOf(String name) => _$catalogsVerticalProductGroupUpdateRequestCatalogTypeEnumValueOf(name);
}

